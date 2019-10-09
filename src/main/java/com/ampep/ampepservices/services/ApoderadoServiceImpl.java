package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Apoderado;
import com.ampep.ampepservices.repositories.ApoderadoRepositorio;

@Service
public class ApoderadoServiceImpl implements ApoderadoService{
	@Autowired
	private ApoderadoRepositorio repositorio;
	
	@Override
    public List<Apoderado> listar(){
        return repositorio.findAll();
    }

	@Override
	public Apoderado listarId(int id) {
		return repositorio.findByIdApoderado(id);
	}

	@Override
	public Apoderado add(Apoderado p) {
		return repositorio.save(p);
	}

	@Override
	public Apoderado edit(Apoderado p) {
		return repositorio.save(p);
	}

	@Override
	public Apoderado delete(int id) {
		Apoderado apo = repositorio.findByIdApoderado(id);
		if(apo!=null)
		{
			repositorio.delete(apo);
		}
		return apo;
	}
}
