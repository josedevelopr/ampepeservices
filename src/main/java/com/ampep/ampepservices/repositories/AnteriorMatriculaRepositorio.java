package com.ampep.ampepservices.repositories;

import java.util.List;

import com.ampep.ampepservices.entities.AnteriorMatricula;

public interface AnteriorMatriculaRepositorio 
{
	List<AnteriorMatricula>findAll();
	AnteriorMatricula findByIdAnteriorMatricula(int id);
	AnteriorMatricula save(AnteriorMatricula antmat);
	AnteriorMatricula delete(AnteriorMatricula antmat);
}
