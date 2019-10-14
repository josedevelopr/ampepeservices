package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.DocumentosPresentado;

public interface DocumentosPresentadoService
{
	List<DocumentosPresentado>listar();
	DocumentosPresentado listarId(int id);
	DocumentosPresentado add(DocumentosPresentado docpres);
	DocumentosPresentado edit(DocumentosPresentado docpres);
	DocumentosPresentado delete(int id);
}
