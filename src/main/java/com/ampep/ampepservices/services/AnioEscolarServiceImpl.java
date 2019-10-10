package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.AnioEscolar;
import com.ampep.ampepservices.repositories.AnioEscolarRepositorio;

@Service
public class AnioEscolarServiceImpl implements AnioEscolarService
{
	@Autowired
	private AnioEscolarRepositorio repositorio;
	
	@Override
    public List<AnioEscolar> listar(){
        return repositorio.findAll();
    }

	@Override
	public AnioEscolar listarId(int id) {
		return repositorio.findByIdAnioEscolar(id);
	}

	@Override
	public AnioEscolar add(AnioEscolar p) {
		return repositorio.save(p);
	}

	@Override
	public AnioEscolar edit(AnioEscolar p) {
		return repositorio.save(p);
	}

	@Override
	public AnioEscolar delete(int id) {
		AnioEscolar apo = repositorio.findByIdAnioEscolar(id);
		if(apo!=null)
		{
			repositorio.delete(apo);
		}
		return apo;
	}
}
