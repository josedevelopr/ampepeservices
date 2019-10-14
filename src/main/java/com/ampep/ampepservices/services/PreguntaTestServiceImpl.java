package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.PreguntaTest;
import com.ampep.ampepservices.repositories.PreguntaTestRepositorio;

@Service
public class PreguntaTestServiceImpl implements PreguntaTestService 
{
	@Autowired
	private PreguntaTestRepositorio repositorio;
	
	@Override
	public List<PreguntaTest> listar() {
		return repositorio.findAll();
	}

	@Override
	public PreguntaTest listarId(int id) {
		return repositorio.findByIdPreguntaTest(id);
	}

	@Override
	public PreguntaTest add(PreguntaTest pregtest) {
		return repositorio.save(pregtest);
	}

	@Override
	public PreguntaTest edit(PreguntaTest pregtest) {
		return repositorio.save(pregtest);
	}

	@Override
	public PreguntaTest delete(int id) {
		PreguntaTest pregtest = repositorio.findByIdPreguntaTest(id);
		if(pregtest!=null)
		{
			return repositorio.delete(pregtest);
		}
		return pregtest;
	}

}
