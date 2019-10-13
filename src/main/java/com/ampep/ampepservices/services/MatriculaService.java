package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Matricula;

public interface MatriculaService 
{
	List<Matricula>listar();
	Matricula listarId(int id);
	Matricula add(Matricula mat);
	Matricula edit(Matricula mat);
	Matricula delete(int id);
}
