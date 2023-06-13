package com.fesc.cheorl.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fesc.cheorl.Entidades.DocumentoEntity;
import com.fesc.cheorl.Entidades.RolesEntity;
import com.fesc.cheorl.Entidades.UsuarioEntity;
import com.fesc.cheorl.Models.Respuestas.UsuarioDataRestModel;
import com.fesc.cheorl.Repositories.IDocumentoRepository;
import com.fesc.cheorl.Repositories.IRolRepository;
import com.fesc.cheorl.Repositories.IUsuarioRepository;
import com.fesc.cheorl.Shared.UsuarioDto;

@Service
public class UsuarioServices implements IUsuarioServices {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioRepository iUserRepository;

    @Autowired
    IRolRepository iRolRepositories;

    @Autowired
    IDocumentoRepository iDocumentoRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UsuarioDataRestModel crearUser(UsuarioDto usuarioCrearDto) {
        RolesEntity rolesEntity = iRolRepositories.findById(usuarioCrearDto.getRol());
        DocumentoEntity documentoEntity = iDocumentoRepository.findById(usuarioCrearDto.getDocumento());
        UsuarioEntity usuarioEntity = iUserRepository.findByEmail(usuarioCrearDto.getEmail());

        if (rolesEntity == null) {
            throw new UsernameNotFoundException("Rol no encontrado");
        }

        if (usuarioEntity != null) {
            throw new UsernameNotFoundException("Correo ya usado");
        }

        UsuarioEntity usuarioCrearEntity = modelMapper.map(usuarioCrearDto, UsuarioEntity.class);
        usuarioCrearEntity.setIdUser(UUID.randomUUID().toString());
        usuarioCrearEntity.setRolesEntity(rolesEntity);
        usuarioCrearEntity.setDocumentoEntity(documentoEntity);
        usuarioCrearEntity.setPasswordEncriptada(bCryptPasswordEncoder.encode(usuarioCrearDto.getPassword()));

        UsuarioEntity userCreado = iUserRepository.save(usuarioCrearEntity);
        UsuarioDto userDto = modelMapper.map(userCreado, UsuarioDto.class);
        UsuarioDataRestModel usuarioDataRestModel = modelMapper.map(userDto, UsuarioDataRestModel.class);
        return usuarioDataRestModel;
    }

    @Override
    public List<UsuarioDataRestModel> leerTodosLosUsers() {
        List<UsuarioEntity> UsuarioEntityList = iUserRepository.findAll();
        List<UsuarioDataRestModel> partidoDtoList = new ArrayList<UsuarioDataRestModel>();
        for (UsuarioEntity usuarioEntity : UsuarioEntityList) {
            UsuarioDto usuarioDto = modelMapper.map(usuarioEntity, UsuarioDto.class);
            UsuarioDataRestModel usuarioDataRestModel = modelMapper.map(usuarioDto, UsuarioDataRestModel.class);
            partidoDtoList.add(usuarioDataRestModel);
        }
        return partidoDtoList;
    }

    @Override
    public UsuarioDto leerUser(String correo) {
        
        UsuarioEntity usuarioEntity = iUserRepository.findByEmail(correo);

        if (usuarioEntity == null) {
            throw new UsernameNotFoundException(correo);
        }

        UsuarioDto usuarioDto = modelMapper.map(usuarioEntity, UsuarioDto.class);
        return usuarioDto;

    }

}
