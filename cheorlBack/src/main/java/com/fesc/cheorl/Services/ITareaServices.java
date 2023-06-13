package com.fesc.cheorl.Services;

import java.util.List;

import com.fesc.cheorl.Models.Respuestas.TareaDataRestModel;
import com.fesc.cheorl.Shared.TareaDto;

public interface ITareaServices {
    TareaDataRestModel crearTarea(TareaDto tareaCrearDto, String idCreador);
    List<TareaDataRestModel> getTarea(int idUsuario);
    TareaDataRestModel actualizarEstadoTarea(long idEstado, String idTarea);
}
