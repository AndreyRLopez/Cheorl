package com.fesc.cheorl.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "usuario")
@Table(indexes = {
        @Index(columnList = "idUser", name = "index_idUser", unique = true),
        @Index(columnList = "email", name = "index_email", unique = true),
        @Index(columnList = "cc", name = "index_cc", unique = true),
})
public class UsuarioEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String idUser;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String apellido;

    @Column(nullable = false, length = 13)
    private String celular;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false)
    private String passwordEncriptada;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private RolesEntity rolesEntity;

    @ManyToOne
    @JoinColumn(name = "id_documento")
    private DocumentoEntity documentoEntity;

    @Column(nullable = false, length = 100)
    private String cc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioEntityCreador")
    private List<TareaEntity> tareaEntityCreadorList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioEntityAsignado")
    private List<TareaEntity> tareaEntityAsignadoList = new ArrayList<>();

    public RolesEntity getRolesEntity() {
        return rolesEntity;
    }

    public void setRolesEntity(RolesEntity rolesEntity) {
        this.rolesEntity = rolesEntity;
    }

    public DocumentoEntity getDocumentoEntity() {
        return documentoEntity;
    }

    public void setDocumentoEntity(DocumentoEntity documentoEntity) {
        this.documentoEntity = documentoEntity;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordEncriptada() {
        return passwordEncriptada;
    }

    public void setPasswordEncriptada(String passwordEncriptada) {
        this.passwordEncriptada = passwordEncriptada;
    }

}
