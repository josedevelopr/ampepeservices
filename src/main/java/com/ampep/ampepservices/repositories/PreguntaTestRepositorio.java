package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.PreguntaTest;

public interface PreguntaTestRepositorio extends Repository<PreguntaTest,Integer> 
{
	List<PreguntaTest>findAll();
	PreguntaTest findByIdPreguntaTest(int id);
	PreguntaTest save(PreguntaTest pregtest);
	PreguntaTest delete(PreguntaTest pregtest);
}
