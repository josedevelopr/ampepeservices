package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.SaludEstudiante;

public interface SaludEstudianteRepositorio extends Repository<SaludEstudiante, Integer>
{
	List<SaludEstudiante>findAll();
	SaludEstudiante findByIdSaludEstudiante(int id);
	SaludEstudiante save(SaludEstudiante salest);
	SaludEstudiante delete(SaludEstudiante salest);
}
