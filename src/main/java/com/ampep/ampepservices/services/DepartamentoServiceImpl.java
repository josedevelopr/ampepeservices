package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Departamento;
import com.ampep.ampepservices.repositories.DepartamentoRepositorio;

@Service
public class DepartamentoServiceImpl implements DepartamentoService 
{
	@Autowired
	private DepartamentoRepositorio repositorio;
	
	@Override
	public List<Departamento> listar() {
		return repositorio.findAll();
	}

	@Override
	public Departamento listarId(int id) {
		return repositorio.findByIdDepartamento(id);
	}
	
}
