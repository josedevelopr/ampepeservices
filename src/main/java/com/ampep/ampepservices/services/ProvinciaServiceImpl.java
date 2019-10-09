package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Provincia;
import com.ampep.ampepservices.repositories.ProvinciaRepositorio;

@Service
public class ProvinciaServiceImpl implements ProvinciaService
{
	@Autowired
	private ProvinciaRepositorio repositorio;

	@Override
	public List<Provincia> listar() {
		return repositorio.findAll();
	}

	@Override
	public Provincia listarId(int id) {
		return repositorio.findByIdProvincia(id);
	}
	
	
}
