package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ampep.ampepservices.entities.DocumentosPresentado;
import com.ampep.ampepservices.repositories.DocumentosPresentadoRepositorio;

public class DocumentosPresentadoServiceImpl implements DocumentosPresentadoService
{

	@Autowired
	private DocumentosPresentadoRepositorio repositorio;
	
	@Override
	public List<DocumentosPresentado> listar() {
		return repositorio.findAll();
	}

	@Override
	public DocumentosPresentado listarId(int id) {
		return repositorio.findByIdDocumentosPresentado(id);
	}

	@Override
	public DocumentosPresentado add(DocumentosPresentado docpres) {
		return repositorio.save(docpres);
	}

	@Override
	public DocumentosPresentado edit(DocumentosPresentado docpres) {
		return repositorio.save(docpres);
	}

	@Override
	public DocumentosPresentado delete(int id) {
		DocumentosPresentado docpres = repositorio.findByIdDocumentosPresentado(id);
		if(docpres!=null)
		{
			repositorio.delete(docpres);
		}
		return docpres;
	}

}
