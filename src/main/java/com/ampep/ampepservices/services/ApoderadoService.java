package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Apoderado;

public interface ApoderadoService 
{
	List<Apoderado>listar();
	Apoderado listarId(int id);
	Apoderado add(Apoderado p);
	Apoderado edit(Apoderado p);
	Apoderado delete(int id);
}
