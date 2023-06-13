package com.fesc.cheorl.Repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.fesc.cheorl.Entidades.RolesEntity;

@Repository
public interface IRolRepository extends PagingAndSortingRepository<RolesEntity, Long> {
    RolesEntity findById(long id);
        List<RolesEntity> findAll();

}
