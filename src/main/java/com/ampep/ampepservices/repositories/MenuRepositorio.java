package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Menu;

public interface MenuRepositorio extends Repository<Menu, Integer>{

	List<Menu>findAll();
	Menu findOne(int id);
	Menu save(Menu me);
	void delete(Menu me); 
}
