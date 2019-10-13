package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Alumno;

public interface AlumnoService 
{
	List<Alumno>listar();
	Alumno listarId(int id);
	Alumno add(Alumno alu);
	Alumno edit(Alumno alu);
	Alumno delete(int id);
}
