package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.PreguntaTest;

public interface PreguntaTestService 
{
	List<PreguntaTest>listar();
	PreguntaTest listarId(int id);
	PreguntaTest add(PreguntaTest pregtest);
	PreguntaTest edit(PreguntaTest pregtest);
	PreguntaTest delete(int id);
}
