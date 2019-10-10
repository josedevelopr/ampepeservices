package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ampep.ampepservices.entities.UsuarioSistema;
import com.ampep.ampepservices.repositories.UsuarioSistemaRepositorio;

public class UsuarioSistemaServiceImpl implements UsuarioSistemaService{

	@Autowired
	private UsuarioSistemaRepositorio repositorio;
	
	@Override
	public List<UsuarioSistema> listarUST() {
		
		return repositorio.findAll();
	}

	@Override
	public UsuarioSistema listarId(int id) {
		
		return repositorio.findOne(id);
	}

	@Override
	public UsuarioSistema add(UsuarioSistema ust) {
		
		return repositorio.save(ust);
	}

	@Override
	public UsuarioSistema edit(UsuarioSistema ust) {
		
		return repositorio.save(ust);
	}

	@Override
	public UsuarioSistema delete(int id) {
		
		UsuarioSistema ust=repositorio.findOne(id);
		if(ust!=null) {
			repositorio.delete(ust);
		}
		return ust;
	}
}
