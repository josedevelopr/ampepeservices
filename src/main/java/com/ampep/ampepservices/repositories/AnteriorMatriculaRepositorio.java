package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.AnteriorMatricula;

public interface AnteriorMatriculaRepositorio extends Repository<AnteriorMatricula, Integer>
{
	List<AnteriorMatricula>findAll();
	AnteriorMatricula findByIdAnteriorMatricula(int id);
	AnteriorMatricula save(AnteriorMatricula antmat);
	AnteriorMatricula delete(AnteriorMatricula antmat);
}
