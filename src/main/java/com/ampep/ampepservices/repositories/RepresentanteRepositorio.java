package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Representante;

public interface RepresentanteRepositorio extends Repository<Representante, Integer>
{
	List<Representante>findAll();
	Representante findByIdRepresentante(int id);
	Representante save(Representante apo);
	Representante delete(Representante apo);
}
