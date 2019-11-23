package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Colegio;

public interface ColegioService 
{
	List<Colegio>listar();
	Colegio listarId(int id);
	Colegio listarCodModular(String codModular);
	Colegio add(Colegio p);
	Colegio edit(Colegio p);
	Colegio delete(int id);
	Colegio validarColegio(String codmoular);
}
