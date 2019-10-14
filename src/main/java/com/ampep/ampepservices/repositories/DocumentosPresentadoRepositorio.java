package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.DocumentosPresentado;

public interface DocumentosPresentadoRepositorio extends Repository<DocumentosPresentado,Integer>
{
	List<DocumentosPresentado>findAll();
	DocumentosPresentado findByIdDocumentosPresentado(int id);
	DocumentosPresentado save(DocumentosPresentado docpres);
	DocumentosPresentado delete(DocumentosPresentado docpres);
}
