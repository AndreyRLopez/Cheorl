package com.fesc.cheorl.Entidades;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "tarea")
@EntityListeners(AuditingEntityListener.class)
public class TareaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String idTarea;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column
    private Date fechaInicio;

    @Column
    private Date fechaLimite;

    @ManyToOne
    @JoinColumn(name = "id_usuarioCreador")
    private UsuarioEntity usuarioEntityCreador;

    @ManyToOne
    @JoinColumn(name = "id_usuarioAsignado")
    private UsuarioEntity usuarioEntityAsignado;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private EstadoTareaEntity estadoTareaEntity;

    public EstadoTareaEntity getEstadoTareaEntity() {
        return estadoTareaEntity;
    }

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

    public void setEstadoTareaEntity(EstadoTareaEntity estadoTareaEntity) {
        this.estadoTareaEntity = estadoTareaEntity;
    }


    
}
