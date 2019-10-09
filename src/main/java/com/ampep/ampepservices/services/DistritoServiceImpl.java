package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Distrito;
import com.ampep.ampepservices.repositories.DistritoRepositorio;

@Service
public class DistritoServiceImpl implements DistritoService
{
	@Autowired
	private DistritoRepositorio repositorio;

	@Override
	public List<Distrito> listar() {
		return repositorio.findAll();
	}

	@Override
	public Distrito listarId(int id) {
		return repositorio.findByIdDistrito(id);
	}
	
}
