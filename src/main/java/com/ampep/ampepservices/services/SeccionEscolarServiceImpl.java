package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.SeccionEscolar;
import com.ampep.ampepservices.repositories.SeccionEscolarRepositorio;

@Service
public class SeccionEscolarServiceImpl implements SeccionEscolarService
{
	@Autowired
	private SeccionEscolarRepositorio repositorio;
	
	@Override
    public List<SeccionEscolar> listar(){
        return repositorio.findAll();
    }

	@Override
	public SeccionEscolar listarId(int id) {
		return repositorio.findByIdSeccion(id);
	}

	@Override
	public SeccionEscolar add(SeccionEscolar seccion) {
		return repositorio.save(seccion);
	}

	@Override
	public SeccionEscolar edit(SeccionEscolar seccion) {
		return repositorio.save(seccion);
	}

	@Override
	public SeccionEscolar delete(int id) {
		SeccionEscolar apo = repositorio.findByIdSeccion(id);
		if(apo!=null)
		{
			repositorio.delete(apo);
		}
		return apo;
	}
}
