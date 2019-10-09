package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Pais;

public interface PaisRepositorio extends Repository<Pais,Integer>
{
	List<Pais> findAll();
	Pais findByIdPais(int id);
	Pais save(Pais pa);
	void delete(Pais pa);
}
