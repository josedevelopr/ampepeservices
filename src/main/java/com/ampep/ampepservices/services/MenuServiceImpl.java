package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Menu;
import com.ampep.ampepservices.repositories.MenuRepositorio;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private MenuRepositorio repositorio;
	
	@Override
	public List<Menu> listarMenu() {
		
		return repositorio.findAll();
	}

	@Override
	public Menu listarId(int id) {
		
		return repositorio.findOne(id);
	}

	@Override
	public Menu add(Menu me) {
		
		return repositorio.save(me);
	}

	@Override
	public Menu edit(Menu me) {
		
		return repositorio.save(me);
	}

	@Override
	public Menu delete(int id) {
		Menu me = repositorio.findOne(id);
		if(me!=null) {
			repositorio.delete(me);
		}
		return me;
	}
}
