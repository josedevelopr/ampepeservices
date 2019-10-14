package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.AnteriorMatricula;
import com.ampep.ampepservices.entities.Apoderado;
import com.ampep.ampepservices.repositories.AnteriorMatriculaRepositorio;

@Service
public class AnteriorMatriculaServiceImpl implements AnteriorMatriculaService
{
	@Autowired
	private AnteriorMatriculaRepositorio repositorio;
	
	@Override
    public List<AnteriorMatricula> listar(){
        return repositorio.findAll();
    }

	@Override
	public AnteriorMatricula listarId(int id) {
		return repositorio.findByIdAnteriorMatricula(id);
	}

	@Override
	public AnteriorMatricula add(AnteriorMatricula antmat) {
		return repositorio.save(antmat);
	}

	@Override
	public AnteriorMatricula edit(AnteriorMatricula antmat) {
		return repositorio.save(antmat);
	}

	@Override
	public AnteriorMatricula delete(int id) {
		AnteriorMatricula antmat = repositorio.findByIdAnteriorMatricula(id);
		if(antmat!=null)
		{
			repositorio.delete(antmat);
		}
		return antmat;
	}
}
