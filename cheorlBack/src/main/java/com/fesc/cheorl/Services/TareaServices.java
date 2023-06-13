package com.fesc.cheorl.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fesc.cheorl.Entidades.EstadoTareaEntity;
import com.fesc.cheorl.Entidades.TareaEntity;
import com.fesc.cheorl.Entidades.UsuarioEntity;
import com.fesc.cheorl.Models.Respuestas.TareaDataRestModel;
import com.fesc.cheorl.Repositories.IEstadoTareaRepository;
import com.fesc.cheorl.Repositories.IRolRepository;
import com.fesc.cheorl.Repositories.ITareaRepository;
import com.fesc.cheorl.Repositories.IUsuarioRepository;
import com.fesc.cheorl.Shared.TareaDto;

@Service
public class TareaServices implements ITareaServices {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioRepository iUserRepository;

    @Autowired
    ITareaRepository iTareaRepository;

    @Autowired
    IRolRepository iRolRepositories;

    @Autowired
    IEstadoTareaRepository iEstadoTareaRepository;

    @Override
    public TareaDataRestModel crearTarea(TareaDto tareaCrearDto, String idCreador) {

        EstadoTareaEntity estadoTareaEntity = iEstadoTareaRepository.findById(tareaCrearDto.getEstadoTarea());
        UsuarioEntity usuarioEntityCreador = iUserRepository.findByIdUser(idCreador);
        UsuarioEntity usuarioEntityAsignado = iUserRepository.findByIdUser(tareaCrearDto.getIdUsuarioEntityAsignado());

        if (estadoTareaEntity == null) {
            throw new UsernameNotFoundException("Hubo un error en estado tarea");
        }

        if (usuarioEntityAsignado == null) {
            throw new UsernameNotFoundException("Hubo un error en asignado");

        }

        if (usuarioEntityCreador == null) {
            throw new UsernameNotFoundException("Hubo un error en creador");

        }

        TareaEntity tareaCrearEntity = modelMapper.map(tareaCrearDto, TareaEntity.class);
        tareaCrearEntity.setIdTarea(UUID.randomUUID().toString());
        tareaCrearEntity.setUsuarioEntityAsignado(usuarioEntityAsignado);
        tareaCrearEntity.setUsuarioEntityCreador(usuarioEntityCreador);
        tareaCrearEntity.setEstadoTareaEntity(estadoTareaEntity);

        TareaEntity tareaEntity = iTareaRepository.save(tareaCrearEntity);
        TareaDto tareaDto = modelMapper.map(tareaEntity, TareaDto.class);
        TareaDataRestModel tareaDataRestModel = modelMapper.map(tareaDto, TareaDataRestModel.class);

        return tareaDataRestModel;
    }

    @Override
    public List<TareaDataRestModel> getTarea(int idUsuario) {

        List<TareaEntity> tareaEntityList = iTareaRepository.tareasUsuario(idUsuario);

        List<TareaDataRestModel> partidoDtoList = new ArrayList<TareaDataRestModel>();

        for (TareaEntity tareaEntity : tareaEntityList) {
            TareaDto tareaDto = modelMapper.map(tareaEntity, TareaDto.class);
            TareaDataRestModel tareaDataRestModel =  modelMapper.map(tareaDto, TareaDataRestModel.class);
            partidoDtoList.add(tareaDataRestModel);
        }

        return partidoDtoList;
    }

    
    @Override
    public TareaDataRestModel actualizarEstadoTarea(long idEstado, String idTarea) {

        TareaEntity tareaEntity = iTareaRepository.findByIdTarea(idTarea);
        EstadoTareaEntity estadoTareaEntity = iEstadoTareaRepository.findById(idEstado);

        if (tareaEntity == null) {
            throw new UsernameNotFoundException("tarea no encontrada");
        }
        if (estadoTareaEntity == null) {
            throw new UsernameNotFoundException("Estado de tarea no encontrado");
        }
        tareaEntity.setEstadoTareaEntity(estadoTareaEntity);
        TareaEntity tareaEntityActualizada = iTareaRepository.save(tareaEntity);
        TareaDto tareaDto = modelMapper.map(tareaEntityActualizada, TareaDto.class);
        TareaDataRestModel tareaDataRestModel = modelMapper.map(tareaDto, TareaDataRestModel.class);
        
        return tareaDataRestModel;
    }
}
