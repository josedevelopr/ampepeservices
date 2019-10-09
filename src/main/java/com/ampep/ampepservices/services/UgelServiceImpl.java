package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.controller.Ugel;
import com.ampep.ampepservices.repositories.UgelRepositorio;

@Service
public class UgelServiceImpl implements UgelService{

	@Autowired
	private UgelRepositorio repositorio;

	@Override
	public List<Ugel> listar() {
		return repositorio.findAll();
	}

	@Override
	public Ugel listarId(int id) {
		return repositorio.findByIdUgel(id);
	}
	
	
	
}
