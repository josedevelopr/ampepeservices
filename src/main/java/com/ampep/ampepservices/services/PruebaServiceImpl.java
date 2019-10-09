package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Prueba;
import com.ampep.ampepservices.repositories.PruebaRepositorio;

@Service
public class PruebaServiceImpl implements PruebaService{
	@Autowired
	private PruebaRepositorio repositorio;
	
	@Override
	public List<Prueba> listar() {
		return repositorio.findAll();
	}
}
