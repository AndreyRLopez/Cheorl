package com.fesc.cheorl.Shared;

import java.io.Serializable;

public class RolesDto implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private long id;
    private String nombre;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
