package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Representante;
import com.ampep.ampepservices.repositories.RepresentanteRepositorio;

@Service
public class RepresentanteServiceImpl implements RepresentanteService 
{
	@Autowired
	private RepresentanteRepositorio repositorio; 
	
	@Override
	public List<Representante> listar() {
		return repositorio.findAll();
	}

	@Override
	public Representante listarId(int id) {
		return repositorio.findByIdRepresentante(id);
	}

	@Override
	public Representante add(Representante p) {
		return repositorio.save(p);
	}

	@Override
	public Representante edit(Representante p) {
		return repositorio.save(p);
	}

	@Override
	public Representante delete(int id) {
		Representante rep = repositorio.findByIdRepresentante(id);
		if(rep!=null)
		{
			repositorio.delete(rep);
		}
		
		return rep;
	}

}
