package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.AnteriorMatricula;

public interface AnteriorMatriculaService 
{
	List<AnteriorMatricula>listar();
	AnteriorMatricula listarId(int id);
	AnteriorMatricula add(AnteriorMatricula antmat);
	AnteriorMatricula edit(AnteriorMatricula antmat);
	AnteriorMatricula delete(int id);
}
