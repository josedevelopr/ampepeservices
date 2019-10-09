package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Apoderado;

public interface ApoderadoRepositorio extends Repository<Apoderado,Integer>
{
	List<Apoderado>findAll();
	Apoderado findByIdApoderado(int id);
	Apoderado save(Apoderado apo);
	Apoderado delete(Apoderado apo);
}
