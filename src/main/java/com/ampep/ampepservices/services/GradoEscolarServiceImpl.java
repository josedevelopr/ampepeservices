package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.GradoEscolar;
import com.ampep.ampepservices.repositories.GradoEscolarRepositorio;

@Service
public class GradoEscolarServiceImpl   implements GradoEscolarService
{

	@Autowired
	private GradoEscolarRepositorio repositorio;
	
	@Override
    public List<GradoEscolar> listar(){
        return repositorio.findAll();
    }

	@Override
	public GradoEscolar listarId(int id) {
		return repositorio.findByIdGrado(id);
	}

	@Override
	public GradoEscolar add(GradoEscolar grad) {
		return repositorio.save(grad);
	}

	@Override
	public GradoEscolar edit(GradoEscolar grad) {
		return repositorio.save(grad);
	}

	@Override
	public GradoEscolar delete(int id) {
		GradoEscolar apo = repositorio.findByIdGrado(id);
		if(apo!=null)
		{
			repositorio.delete(apo);
		}
		return apo;
	}
}
