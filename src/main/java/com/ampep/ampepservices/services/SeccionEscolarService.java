package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.SeccionEscolar;

public interface SeccionEscolarService 
{
	List<SeccionEscolar>listar();
	SeccionEscolar listarId(int id);
	SeccionEscolar add(SeccionEscolar seccion);
	SeccionEscolar edit(SeccionEscolar seccion);
	SeccionEscolar delete(int id);
}
