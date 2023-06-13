package com.fesc.cheorl.Models.Respuestas;

import java.util.Date;

import com.fesc.cheorl.Entidades.EstadoTareaEntity;
import com.fesc.cheorl.Entidades.UsuarioEntity;

public class TareaDataRestModel {
    
    private long id;
    private String idTarea;
    private String nombre;
    private String descripcion;
    private Date fechaLimite;
    private UsuarioEntity usuarioEntityCreador;
    private UsuarioEntity usuarioEntityAsignado;
    private EstadoTareaEntity estadoTareaEntity;

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public UsuarioEntity getUsuarioEntityCreador() {
        return usuarioEntityCreador;
    }

    public void setUsuarioEntityCreador(UsuarioEntity usuarioEntityCreador) {
        this.usuarioEntityCreador = usuarioEntityCreador;
    }

    public UsuarioEntity getUsuarioEntityAsignado() {
        return usuarioEntityAsignado;
    }

    public void setUsuarioEntityAsignado(UsuarioEntity usuarioEntityAsignado) {
        this.usuarioEntityAsignado = usuarioEntityAsignado;
    }

    public EstadoTareaEntity getEstadoTareaEntity() {
        return estadoTareaEntity;
    }

    public void setEstadoTareaEntity(EstadoTareaEntity estadoTareaEntity) {
        this.estadoTareaEntity = estadoTareaEntity;
    }

}
