package com.fesc.cheorl.Controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fesc.cheorl.Models.Peticiones.TareaCrearRestModel;
import com.fesc.cheorl.Models.Respuestas.TareaDataRestModel;
import com.fesc.cheorl.Services.ITareaServices;
import com.fesc.cheorl.Shared.TareaDto;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/tarea")
public class TareaController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ITareaServices iTareaServices;

    @PostMapping("/crear/{idCreador}")
    public TareaDataRestModel crearTarea(@RequestBody TareaCrearRestModel tareaCrearRestModel,
            @PathVariable String idCreador) {
        TareaDto tareaCrearDto = modelMapper.map(tareaCrearRestModel, TareaDto.class);
        return iTareaServices.crearTarea(tareaCrearDto, idCreador);
    }

    @GetMapping("/{idUsuario}")
    public List<TareaDataRestModel> getTareas(@PathVariable int idUsuario) {
        return iTareaServices.getTarea(idUsuario);
    }

    @PutMapping("/actualizar/estado/{idTarea}/{idEstado}")
    public TareaDataRestModel actualizarEstadoTarea(@PathVariable long idEstado,
            @PathVariable String idTarea) {
        return iTareaServices.actualizarEstadoTarea(idEstado, idTarea);
    }

}
