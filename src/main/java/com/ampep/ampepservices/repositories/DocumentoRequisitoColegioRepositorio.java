package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.DocumentoRequisitoColegio;

public interface DocumentoRequisitoColegioRepositorio extends Repository<DocumentoRequisitoColegio,Integer>
{
	List<DocumentoRequisitoColegio>findAll();
	DocumentoRequisitoColegio findByIdDocumetoRequesitoColegio(int id);
	DocumentoRequisitoColegio save(DocumentoRequisitoColegio apo);
	DocumentoRequisitoColegio delete(DocumentoRequisitoColegio apo);
}
