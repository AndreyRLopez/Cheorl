package com.fesc.cheorl.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "estado_tarea")
public class EstadoTareaEntity implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 20)
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoTareaEntity")
    private List<TareaEntity> estadoTareaEntityList = new ArrayList<>();

    public static Long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<TareaEntity> getEstadoTareaEntityList() {
        return estadoTareaEntityList;
    }

    public void setEstadoTareaEntityList(List<TareaEntity> estadoTareaEntityList) {
        this.estadoTareaEntityList = estadoTareaEntityList;
    }

}
