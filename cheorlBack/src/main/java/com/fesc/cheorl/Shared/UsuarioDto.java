package com.fesc.cheorl.Shared;

import java.io.Serializable;

public class UsuarioDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String idUser;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    private String cc;
    private String password;
    private String passwordEncriptada;
    private long rol;
    private long documento;
    private RolesDto rolesEntity;
    private DocumentoDto documentoEntity;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordEncriptada() {
        return passwordEncriptada;
    }

    public void setPasswordEncriptada(String passwordEncriptada) {
        this.passwordEncriptada = passwordEncriptada;
    }

    public RolesDto getRolesEntity() {
        return rolesEntity;
    }

    public void setRolesEntity(RolesDto rolesEntity) {
        this.rolesEntity = rolesEntity;
    }

    public DocumentoDto getDocumentoEntity() {
        return documentoEntity;
    }

    public void setDocumentoEntity(DocumentoDto documentoEntity) {
        this.documentoEntity = documentoEntity;
    }

    public long getRol() {
        return rol;
    }

    public void setRol(long rol) {
        this.rol = rol;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }
    
}