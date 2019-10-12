package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Menu;

public interface MenuService {

	List<Menu> listarMenu();
	Menu listarId(int id);
	Menu add(Menu me);
	Menu edit(Menu me);
	Menu delete(int id);
}
