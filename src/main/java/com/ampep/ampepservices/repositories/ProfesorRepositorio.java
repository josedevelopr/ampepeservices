package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Profesor;

public interface ProfesorRepositorio extends Repository<Profesor, Integer>{

	List<Profesor>findAll();
	Profesor findByIdProfeso(int id);
	Profesor save(Profesor prof);
	void delete(Profesor prof);
}
