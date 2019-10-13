package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Alumno;
import com.ampep.ampepservices.repositories.AlumnoRepositorio;

@Service
public class AlumnoServiceImpl implements AlumnoService
{
	@Autowired
	private AlumnoRepositorio repositorio;
	
	@Override
    public List<Alumno> listar(){
        return repositorio.findAll();
    }

	@Override
	public Alumno listarId(int id) {
		return repositorio.findByIdAlumno(id);
	}

	@Override
	public Alumno add(Alumno alu) {
		return repositorio.save(alu);
	}

	@Override
	public Alumno edit(Alumno alu) {
		return repositorio.save(alu);
	}

	@Override
	public Alumno delete(int id) {
		Alumno alu = repositorio.findByIdAlumno(id);
		if(alu!=null)
		{
			repositorio.delete(alu);
		}
		return alu;
	}
}
