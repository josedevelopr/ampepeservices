package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Apoderado;
import com.ampep.ampepservices.entities.DocumentoRequerido;
import com.ampep.ampepservices.repositories.DocumentoRequeridoRepositorio;

@Service
public class DocumentoRequeridoServiceImpl implements DocumentoRequeridoService 
{
	@Autowired
	private DocumentoRequeridoRepositorio repositorio;
	
	@Override
    public List<DocumentoRequerido> listar(){
        return repositorio.findAll();
    }

	@Override
	public DocumentoRequerido listarId(int id) {
		return repositorio.findByIdDocumentoRequerido(id);
	}

	@Override
	public DocumentoRequerido add(DocumentoRequerido docreq) {
		return repositorio.save(docreq);
	}

	@Override
	public DocumentoRequerido edit(DocumentoRequerido docreq) {
		return repositorio.save(docreq);
	}

	@Override
	public DocumentoRequerido delete(int id) {
		DocumentoRequerido docreq = repositorio.findByIdDocumentoRequerido(id);
		if(docreq!=null)
		{
			repositorio.delete(docreq);
		}
		return docreq;
	}
}
