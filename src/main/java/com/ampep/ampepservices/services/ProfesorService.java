package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Profesor;

public interface ProfesorService {

	List<Profesor> listarPROF();
	Profesor listarId(int id);
	Profesor add(Profesor prof);
	Profesor edit(Profesor prof);
	Profesor delete(int id);
}
