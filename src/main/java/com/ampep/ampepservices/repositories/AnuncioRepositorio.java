package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Anuncio;

public interface AnuncioRepositorio extends Repository<Anuncio, Integer>{

	List<Anuncio> findAll();
	Anuncio findByIdAnuncio(int id);
	Anuncio save(Anuncio anuncio);
	Anuncio delete(Anuncio anuncio);
	
}
