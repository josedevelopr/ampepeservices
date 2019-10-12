package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Representante;

public interface RepresentanteService 
{
	List<Representante>listar();
	Representante listarId(int id);
	Representante add(Representante p);
	Representante edit(Representante p);
	Representante delete(int id);
}
