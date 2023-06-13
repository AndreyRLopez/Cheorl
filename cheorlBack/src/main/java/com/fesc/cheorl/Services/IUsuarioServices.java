package com.fesc.cheorl.Services;

import java.util.List;

import com.fesc.cheorl.Models.Respuestas.UsuarioDataRestModel;
import com.fesc.cheorl.Shared.UsuarioDto;

public interface IUsuarioServices {

    public UsuarioDataRestModel crearUser(UsuarioDto usuarioCrearDto);

    public UsuarioDto leerUser(String correo);

    // public UserDataRestActualizacionPassword changePassword(PasswordDto passwordDto) throws JsonProcessingException;

    public List<UsuarioDataRestModel> leerTodosLosUsers();

    // public List<UserDto> leerEmpleados(int idRol);

    // public PedidosDto crearPedidoUser(int idUser);
    
} 