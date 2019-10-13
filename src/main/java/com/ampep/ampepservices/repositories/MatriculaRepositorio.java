package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Matricula;

public interface MatriculaRepositorio extends Repository<Matricula, Integer>
{
	List<Matricula>findAll();
	Matricula findByIdMatricula(int id);
	Matricula save(Matricula mat);
	Matricula delete(Matricula mat);
}
