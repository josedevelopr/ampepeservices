package com.ampep.ampepservices.repositories;

import java.util.List;
import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Persona;

public interface PersonaRepositorio extends Repository<Persona, Integer>{
    List<Persona>findAll();
    Persona findById(int id);	
    Persona save(Persona p);
    void delete(Persona p);
}