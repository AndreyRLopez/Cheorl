package com.fesc.cheorl.Models.Peticiones;

import java.util.Date;

public class TareaCrearRestModel {

    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaLimite;
    private String idUsuarioEntityAsignado;
    private long estadoTarea;

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

    public long getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(long estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public String getIdUsuarioEntityAsignado() {
        return idUsuarioEntityAsignado;
    }

    public void setIdUsuarioEntityAsignado(String idUsuarioEntityAsignado) {
        this.idUsuarioEntityAsignado = idUsuarioEntityAsignado;
    }
}