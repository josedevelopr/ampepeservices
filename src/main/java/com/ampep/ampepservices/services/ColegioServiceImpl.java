package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Colegio;
import com.ampep.ampepservices.repositories.ColegioRepositorio;

@Service
public class ColegioServiceImpl implements ColegioService 
{
	@Autowired
	private ColegioRepositorio repositorio;
	
	@Override
	public List<Colegio> listar() {
		return repositorio.findAll();
	}

	@Override
	public Colegio listarId(int id) {
		return repositorio.findByIdColegio(id);
	}

	@Override
	public Colegio add(Colegio p) {
		return repositorio.save(p);
	}

	@Override
	public Colegio edit(Colegio p) {
		return repositorio.save(p);
	}

	@Override
	public Colegio delete(int id) {
		Colegio cole = repositorio.findByIdColegio(id);
		if(cole!=null) {
			repositorio.delete(cole);
		}
		return cole;
	}

}
