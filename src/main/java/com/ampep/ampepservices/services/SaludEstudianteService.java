package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.SaludEstudiante;

public interface SaludEstudianteService 
{
	List<SaludEstudiante>listar();
	SaludEstudiante listarId(int id);
	SaludEstudiante add(SaludEstudiante salest);
	SaludEstudiante edit(SaludEstudiante salest);
	SaludEstudiante delete(int id);
}
