package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Nivel;

public interface NivelRepositorio extends Repository<Nivel, Integer>{

	List<Nivel>findAll();
	Nivel findOne(int id);
	Nivel save(Nivel ni);
	void delete(Nivel ni);
}
