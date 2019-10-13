package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Matricula;
import com.ampep.ampepservices.repositories.MatriculaRepositorio;

@Service
public class MatriculaServiceImpl implements MatriculaService
{
	@Autowired
	private MatriculaRepositorio repositorio;
	
	@Override
    public List<Matricula> listar(){
        return repositorio.findAll();
    }

	@Override
	public Matricula listarId(int id) {
		return repositorio.findByIdMatricula(id);
	}

	@Override
	public Matricula add(Matricula mat) {
		return repositorio.save(mat);
	}

	@Override
	public Matricula edit(Matricula mat) {
		return repositorio.save(mat);
	}

	@Override
	public Matricula delete(int id) {
		Matricula mat = repositorio.findByIdMatricula(id);
		if(mat!=null)
		{
			repositorio.delete(mat);
		}
		return mat;
	}
}
