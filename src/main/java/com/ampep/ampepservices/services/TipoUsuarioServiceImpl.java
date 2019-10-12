package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.TipoUsuario;
import com.ampep.ampepservices.repositories.TipoUsuarioRepositorio;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService{

	@Autowired
	private TipoUsuarioRepositorio repositorio;
	
	@Override
	public List<TipoUsuario> listarTU() {
		
		return repositorio.findAll();
	}

	@Override
	public TipoUsuario listarId(int id) {
		
		return repositorio.findOne(id);
	}

	@Override
	public TipoUsuario add(TipoUsuario tu) {
		
		return repositorio.save(tu);
	}

	@Override
	public TipoUsuario edit(TipoUsuario tu) {
		
		return repositorio.save(tu);
	}

	@Override
	public TipoUsuario delete(int id) {
		
		TipoUsuario tu=repositorio.findOne(id);
		if(tu!=null) {
			repositorio.delete(tu);
		}
		return tu;
	}
}
