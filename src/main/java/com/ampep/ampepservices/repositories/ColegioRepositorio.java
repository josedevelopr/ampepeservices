package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Colegio;

public interface ColegioRepositorio extends Repository<Colegio,Integer>
{
	List<Colegio>findAll();
	Colegio findByIdColegio(int id);
	Colegio save(Colegio cole);
	Colegio delete(Colegio cole);
}
