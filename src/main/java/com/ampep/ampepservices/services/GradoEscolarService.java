package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.GradoEscolar;

public interface GradoEscolarService 
{
	List<GradoEscolar>listar();
	GradoEscolar listarId(int id);
	GradoEscolar add(GradoEscolar grad);
	GradoEscolar edit(GradoEscolar grad);
	GradoEscolar delete(int id);
}
