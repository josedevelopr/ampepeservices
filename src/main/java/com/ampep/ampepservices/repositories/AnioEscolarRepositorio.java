package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.AnioEscolar;

public interface AnioEscolarRepositorio extends Repository<AnioEscolar, Integer>
{
	List<AnioEscolar>findAll();
	AnioEscolar findByIdAnioEscolar(int id);
	AnioEscolar save(AnioEscolar apo);
	AnioEscolar delete(AnioEscolar apo);
}
