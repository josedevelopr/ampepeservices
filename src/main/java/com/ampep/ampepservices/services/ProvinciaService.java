package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Provincia;

public interface ProvinciaService 
{
	List<Provincia> listar();
	Provincia listarId(int id);
}
