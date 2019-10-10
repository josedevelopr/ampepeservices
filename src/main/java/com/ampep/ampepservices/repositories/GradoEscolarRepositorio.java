package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.GradoEscolar;

public interface GradoEscolarRepositorio extends Repository<GradoEscolar,Integer>
{
	List<GradoEscolar>findAll();
	GradoEscolar findByIdGrado(int id);
	GradoEscolar save(GradoEscolar apo);
	GradoEscolar delete(GradoEscolar apo);
}
