package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Apoderado;
import com.ampep.ampepservices.entities.SaludEstudiante;
import com.ampep.ampepservices.repositories.SaludEstudianteRepositorio;

@Service
public class SaludEstudianteServiceImpl implements SaludEstudianteService
{
	@Autowired
	private SaludEstudianteRepositorio repositorio;
	
	@Override
    public List<SaludEstudiante> listar(){
        return repositorio.findAll();
    }

	@Override
	public SaludEstudiante listarId(int id) {
		return repositorio.findByIdSaludEstudiante(id);
	}

	@Override
	public SaludEstudiante add(SaludEstudiante salest) {
		return repositorio.save(salest);
	}

	@Override
	public SaludEstudiante edit(SaludEstudiante salest) {
		return repositorio.save(salest);
	}

	@Override
	public SaludEstudiante delete(int id) {
		SaludEstudiante salest = repositorio.findByIdSaludEstudiante(id);
		if(salest!=null)
		{
			repositorio.delete(apo);
		}
		return salest;
	}
}
