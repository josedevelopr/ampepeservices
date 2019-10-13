package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.DocumentoRequerido;

public interface DocumentoRequeridoRepositorio extends Repository<DocumentoRequerido, Integer>
{
	List<DocumentoRequerido>findAll();
	DocumentoRequerido findByIdDocumentoRequerido(int id);
	DocumentoRequerido save(DocumentoRequerido apo);
	DocumentoRequerido delete(DocumentoRequerido apo);
}
