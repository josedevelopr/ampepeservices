package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.AnioEscolar;

public interface AnioEscolarService 
{
	List<AnioEscolar>listar();
	AnioEscolar listarId(int id);
	AnioEscolar add(AnioEscolar p);
	AnioEscolar edit(AnioEscolar p);
	AnioEscolar delete(int id);
}
