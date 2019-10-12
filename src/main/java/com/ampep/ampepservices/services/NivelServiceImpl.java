package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Nivel;
import com.ampep.ampepservices.repositories.NivelRepositorio;

@Service
public class NivelServiceImpl implements NivelService{

	@Autowired
	private NivelRepositorio repositorio;
	
	@Override
	public List<Nivel> listarNi() {
		
		return repositorio.findAll();
	}

	@Override
	public Nivel listarId(int id) {
		
		return repositorio.findOne(id);
	}

	@Override
	public Nivel add(Nivel ni) {
		
		return repositorio.save(ni);
	}

	@Override
	public Nivel edit(Nivel ni) {
		
		return repositorio.save(ni);
	}

	@Override
	public Nivel delete(int id) {
		Nivel ni = repositorio.findOne(id);
		if(ni!=null) {
			repositorio.delete(ni);
		}
		return ni;
	}

	
}
