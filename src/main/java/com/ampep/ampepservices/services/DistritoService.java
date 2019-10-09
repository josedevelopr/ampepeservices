package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Distrito;

public interface DistritoService 
{
	List<Distrito> listar();
	Distrito listarId(int id);
}
