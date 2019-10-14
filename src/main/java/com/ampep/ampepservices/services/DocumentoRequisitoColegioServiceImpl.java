package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Apoderado;
import com.ampep.ampepservices.entities.DocumentoRequisitoColegio;
import com.ampep.ampepservices.repositories.DocumentoRequisitoColegioRepositorio;

@Service
public class DocumentoRequisitoColegioServiceImpl implements DocumentoRequisitoColegioService
{
	@Autowired
	private DocumentoRequisitoColegioRepositorio repositorio;
	
	@Override
    public List<DocumentoRequisitoColegio> listar(){
        return repositorio.findAll();
    }

	@Override
	public DocumentoRequisitoColegio listarId(int id) {
		return repositorio.findByIdDocumetoRequesitoColegio(id);
	}

	@Override
	public DocumentoRequisitoColegio add(DocumentoRequisitoColegio docreq) {
		return repositorio.save(docreq);
	}

	@Override
	public DocumentoRequisitoColegio edit(DocumentoRequisitoColegio docreq) {
		return repositorio.save(docreq);
	}

	@Override
	public DocumentoRequisitoColegio delete(int id) {
		DocumentoRequisitoColegio docreq = repositorio.findByIdDocumetoRequesitoColegio(id);
		if(docreq!=null)
		{
			repositorio.delete(docreq);
		}
		return docreq;
	}
}
