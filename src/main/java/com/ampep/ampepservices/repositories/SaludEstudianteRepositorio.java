package com.ampep.ampepservices.repositories;

import java.util.List;

import com.ampep.ampepservices.entities.SaludEstudiante;

public interface SaludEstudianteRepositorio 
{
	List<SaludEstudiante>findAll();
	SaludEstudiante findByIdSaludEstudiante(int id);
	SaludEstudiante save(SaludEstudiante salest);
	SaludEstudiante delete(SaludEstudiante salest);
}
