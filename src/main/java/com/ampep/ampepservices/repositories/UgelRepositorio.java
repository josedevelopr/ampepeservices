package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Ugel;

public interface UgelRepositorio extends Repository<Ugel, Integer>
{
	List<Ugel> findAll();
	Ugel findByIdUgel(int id);
}
