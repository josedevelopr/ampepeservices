package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.DocumentoRequisitoColegio;

public interface DocumentoRequisitoColegioService 
{
	List<DocumentoRequisitoColegio>listar();
	DocumentoRequisitoColegio listarId(int id);
	DocumentoRequisitoColegio add(DocumentoRequisitoColegio docreqc);
	DocumentoRequisitoColegio edit(DocumentoRequisitoColegio docreqc);
	DocumentoRequisitoColegio delete(int id);
}
