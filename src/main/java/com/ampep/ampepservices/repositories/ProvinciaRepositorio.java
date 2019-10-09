package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Provincia;

public interface ProvinciaRepositorio extends Repository<Provincia,Integer>
{
	List<Provincia>findAll();
	Provincia findByIdProvincia(int id);
}