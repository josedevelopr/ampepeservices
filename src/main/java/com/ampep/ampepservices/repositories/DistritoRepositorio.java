package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Distrito;

public interface DistritoRepositorio extends Repository<Distrito,Integer>{
	List<Distrito>findAll();
	Distrito findByIdDistrito(int id);
}
