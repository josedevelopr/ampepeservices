package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Anuncio;
import com.ampep.ampepservices.repositories.AnuncioRepositorio;

@Service
public class AnuncioServiceImpl implements AnuncioService{

	@Autowired
	private AnuncioRepositorio repositorio;
	
	@Override
	public List<Anuncio> listar() {
		return repositorio.findAll();
	}

	@Override
	public Anuncio listarId(int id) {
		return repositorio.findByIdAnuncio(id);
	}

	@Override
	public Anuncio add(Anuncio anuncio) {
		return repositorio.save(anuncio);
	}

	@Override
	public Anuncio edit(Anuncio anuncio) {
		return repositorio.save(anuncio);
	}

	@Override
	public Anuncio delete(int id) {
		Anuncio anun = repositorio.findByIdAnuncio(id);
		if(anun!=null) {
			repositorio.delete(anun);
		}
		return repositorio.delete(anun);
	}
	
}
