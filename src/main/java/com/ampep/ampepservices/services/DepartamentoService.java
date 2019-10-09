package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Departamento;

public interface DepartamentoService 
{
	List<Departamento>listar();
	Departamento listarId(int id);
}
