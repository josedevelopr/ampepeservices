package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.SolicitudMatricula;

public interface SolicitudMatriculaService 
{
	List<SolicitudMatricula>listar();
	SolicitudMatricula listarId(int id);
	SolicitudMatricula add(SolicitudMatricula soli);
	SolicitudMatricula edit(SolicitudMatricula soli);
	SolicitudMatricula delete(int id);
}
