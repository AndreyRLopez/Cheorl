package com.fesc.cheorl.Shared;

import java.io.Serializable;
import java.util.Date;


public class TareaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String idTarea;
    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaLimite;
    private String idUsuarioEntityAsignado;
    private long estadoTarea;
    private UsuarioDto usuarioEntityCreador;
    private UsuarioDto usuarioEntityAsignado;
    private EstadoTareaDto estadoTareaEntity;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getIdUsuarioEntityAsignado() {
        return idUsuarioEntityAsignado;
    }

    public void setIdUsuarioEntityAsignado(String idUsuarioEntityAsignado) {
        this.idUsuarioEntityAsignado = idUsuarioEntityAsignado;
    }

    public long getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(long estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public UsuarioDto getUsuarioEntityCreador() {
        return usuarioEntityCreador;
    }

    public void setUsuarioEntityCreador(UsuarioDto usuarioEntityCreador) {
        this.usuarioEntityCreador = usuarioEntityCreador;
    }

    public UsuarioDto getUsuarioEntityAsignado() {
        return usuarioEntityAsignado;
    }

    public void setUsuarioEntityAsignado(UsuarioDto usuarioEntityAsignado) {
        this.usuarioEntityAsignado = usuarioEntityAsignado;
    }

    public EstadoTareaDto getEstadoTareaEntity() {
        return estadoTareaEntity;
    }

    public void setEstadoTareaEntity(EstadoTareaDto estadoTareaEntity) {
        this.estadoTareaEntity = estadoTareaEntity;
    }


}
