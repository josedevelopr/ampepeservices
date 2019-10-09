package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Departamento;

public interface DepartamentoRepositorio extends Repository<Departamento, Integer>
{
	List<Departamento> findAll();
	Departamento findByIdDepartamento(int id);
	
}
