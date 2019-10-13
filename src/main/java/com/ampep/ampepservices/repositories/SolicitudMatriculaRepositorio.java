package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.SolicitudMatricula;

public interface SolicitudMatriculaRepositorio extends Repository <SolicitudMatricula,Integer>
{
	List<SolicitudMatricula>findAll();
	SolicitudMatricula findByIdSolicitudMatricula(int id);
	SolicitudMatricula save(SolicitudMatricula solic);
	SolicitudMatricula delete(SolicitudMatricula SolicitudMatricula);
}
