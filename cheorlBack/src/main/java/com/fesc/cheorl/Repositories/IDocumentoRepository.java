package com.fesc.cheorl.Repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.fesc.cheorl.Entidades.DocumentoEntity;

@Repository
public interface IDocumentoRepository extends PagingAndSortingRepository<DocumentoEntity, Long>{
    DocumentoEntity findById(long id);
}
