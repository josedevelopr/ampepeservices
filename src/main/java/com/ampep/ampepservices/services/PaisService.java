package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Pais;

public interface PaisService 
{
	List<Pais>listar();
	Pais listarId(int id);
	Pais add(Pais pa);
	Pais edit(Pais pa);
	Pais delete(int id);
}
