package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Pais;
import com.ampep.ampepservices.repositories.PaisRepositorio;

@Service
public class PaisServiceImpl implements PaisService{

	@Autowired
	private PaisRepositorio repositorio;
	
	@Override
	public List<Pais> listar() {
		return repositorio.findAll();
	}

	@Override
	public Pais listarId(int id) {
		return repositorio.findByIdPais(id);
	}

	@Override
	public Pais add(Pais pa) {
		return repositorio.save(pa);
	}

	@Override
	public Pais edit(Pais pa) {
		return repositorio.save(pa);
	}

	@Override
	public Pais delete(int id) {
		Pais pa = repositorio.findByIdPais(id);
		if(pa!=null)
		{
			repositorio.delete(pa);
		}
		return pa;
	}

}
