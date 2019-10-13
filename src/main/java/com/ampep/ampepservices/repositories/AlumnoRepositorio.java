package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Alumno;
public interface AlumnoRepositorio extends Repository<Alumno, Integer>
{
	List<Alumno>findAll();
	Alumno findByIdAlumno(int id);
	Alumno save(Alumno alu);
	Alumno delete(Alumno alu);
}
