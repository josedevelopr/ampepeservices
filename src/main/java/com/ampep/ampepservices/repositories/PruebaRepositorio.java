package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Prueba;

public interface PruebaRepositorio extends Repository<Prueba,Integer>{
	List<Prueba> findAll();
}
