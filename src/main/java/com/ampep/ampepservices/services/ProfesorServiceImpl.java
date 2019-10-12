package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Profesor;
import com.ampep.ampepservices.repositories.ProfesorRepositorio;

@Service  
public class ProfesorServiceImpl implements ProfesorService{

	@Autowired
	private ProfesorRepositorio repositorio;
	
	@Override
	public List<Profesor> listarPROF() {
		
		return repositorio.findAll();
	}

	@Override
	public Profesor listarId(int id) {

		return repositorio.findByIdProfeso(id);
	}

	@Override
	public Profesor add(Profesor prof) {

		return repositorio.save(prof);
	}

	@Override
	public Profesor edit(Profesor prof) {

		return repositorio.save(prof);
	}

	@Override
	public Profesor delete(int id) {
		
		Profesor prof=repositorio.findByIdProfeso(id);
		if(prof!=null) {
			repositorio.delete(prof);
		}
		return prof;
	}
}
