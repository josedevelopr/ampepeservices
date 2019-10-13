package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.SeccionEscolar;

public interface SeccionEscolarRepositorio extends Repository<SeccionEscolar,Integer>
{
	List<SeccionEscolar>findAll();
	SeccionEscolar findByIdSeccion(int id);
	SeccionEscolar save(SeccionEscolar seccion);
	SeccionEscolar delete(SeccionEscolar seccion);
}
