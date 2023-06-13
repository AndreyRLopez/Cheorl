package com.fesc.cheorl.Services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fesc.cheorl.Entidades.RolesEntity;
import com.fesc.cheorl.Models.Respuestas.RolesDataRestModel;
import com.fesc.cheorl.Repositories.IRolRepository;
import com.fesc.cheorl.Repositories.ITareaRepository;
import com.fesc.cheorl.Repositories.IUsuarioRepository;
import com.fesc.cheorl.Shared.RolesDto;

@Service
public class RolesServices implements IRolesServices{

     @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioRepository iUserRepository;

    @Autowired
    ITareaRepository iTareaRepository;

    @Autowired
    IRolRepository iRolRepositories;

    @Override
    public List<RolesDataRestModel> getRoles() {

        List<RolesEntity> rolesEntityList = iRolRepositories.findAll();
        List<RolesDataRestModel> partidoDtoList = new ArrayList<RolesDataRestModel>();

        for (RolesEntity rolesEntity : rolesEntityList) {
            RolesDto tareaDto = modelMapper.map(rolesEntity, RolesDto.class);
            RolesDataRestModel tareaDataRestModel =  modelMapper.map(tareaDto, RolesDataRestModel.class);
            partidoDtoList.add(tareaDataRestModel);
        }

        return partidoDtoList;
    }
    
}
