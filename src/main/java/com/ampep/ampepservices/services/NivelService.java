package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Nivel;

public interface NivelService {

	List<Nivel> listarNi();
	Nivel listarId(int id);
	Nivel add(Nivel ni);
	Nivel edit(Nivel ni);
	Nivel delete(int id);
}
