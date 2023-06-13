package com.fesc.cheorl.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fesc.cheorl.Entidades.UsuarioEntity;

@Repository
public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Long> {

    UsuarioEntity findById(long id);
    
    @Query(nativeQuery = true, value = "SELECT * FROM user WHERE id_rol LIKE %:filtro%")
    public List<UsuarioEntity> usuariosRolPropietario(@Param("filtro") int filtro);

    UsuarioEntity findByIdUser(String id);

    List<UsuarioEntity> findAll();

    UsuarioEntity findByEmail(String correo);

    public UsuarioEntity findOneByEmail(String email);
}
