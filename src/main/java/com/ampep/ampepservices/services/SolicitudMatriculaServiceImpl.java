package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.SolicitudMatricula;
import com.ampep.ampepservices.repositories.SolicitudMatriculaRepositorio;

@Service
public class SolicitudMatriculaServiceImpl implements SolicitudMatriculaService
{
	@Autowired
	private SolicitudMatriculaRepositorio repositorio;
	
	@Override
    public List<SolicitudMatricula> listar(){
        return repositorio.findAll();
    }

	@Override
	public SolicitudMatricula listarId(int id) {
		return repositorio.findByIdSolicitudMatricula(id);
	}

	@Override
	public SolicitudMatricula add(SolicitudMatricula sol) {
		return repositorio.save(sol);
	}

	@Override
	public SolicitudMatricula edit(SolicitudMatricula sol) {
		return repositorio.save(sol);
	}

	@Override
	public SolicitudMatricula delete(int id) {
		SolicitudMatricula sol = repositorio.findByIdSolicitudMatricula(id);
		if(sol!=null)
		{
			repositorio.delete(sol);
		}
		return sol;
	}
}
