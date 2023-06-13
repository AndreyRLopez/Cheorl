package com.fesc.cheorl.Controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fesc.cheorl.Models.Peticiones.UsuarioCrearRestModel;
import com.fesc.cheorl.Models.Respuestas.UsuarioDataRestModel;
import com.fesc.cheorl.Services.IUsuarioServices;
import com.fesc.cheorl.Shared.UsuarioDto;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioServices iUserService;

    @PostMapping("/crear")
    public UsuarioDataRestModel crearUser(@RequestBody UsuarioCrearRestModel userCrearRestModel) {
        UsuarioDto usuarioCrearDto = modelMapper.map(userCrearRestModel, UsuarioDto.class);
        return iUserService.crearUser(usuarioCrearDto);
    }

    @GetMapping()
    public List<UsuarioDataRestModel> getUsuarios() {
        return iUserService.leerTodosLosUsers();
    }
}