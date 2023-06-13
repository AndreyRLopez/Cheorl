package com.fesc.cheorl.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fesc.cheorl.Entidades.TareaEntity;
import com.fesc.cheorl.Entidades.UsuarioEntity;

@Repository
public interface ITareaRepository extends CrudRepository<TareaEntity, Long> {
    TareaEntity findByIdTarea(String id);

    @Query(nativeQuery = true, value = "SELECT * FROM tarea WHERE id_usuario_asignado LIKE %:filtro%")
    public List<TareaEntity> tareasUsuario(@Param("filtro") int filtro);

    List<TareaEntity> findByUsuarioEntityAsignado(UsuarioEntity usuarioEntity);

}
