package com.fesc.cheorl.Repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.fesc.cheorl.Entidades.EstadoTareaEntity;

@Repository
public interface IEstadoTareaRepository extends PagingAndSortingRepository<EstadoTareaEntity, Long> {
    EstadoTareaEntity findById(long id);
}
