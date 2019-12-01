package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Anuncio;

public interface AnuncioService {
	List<Anuncio> listar();
	Anuncio listarId(int id);
	Anuncio add(Anuncio anuncio);
	Anuncio edit(Anuncio anuncio);
	Anuncio delete(int id);
}
