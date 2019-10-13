package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.DocumentoRequerido;

public interface DocumentoRequeridoService 
{
	List<DocumentoRequerido>listar();
	DocumentoRequerido listarId(int id);
	DocumentoRequerido add(DocumentoRequerido docreq);
	DocumentoRequerido edit(DocumentoRequerido docreq);
	DocumentoRequerido delete(int id);
}
