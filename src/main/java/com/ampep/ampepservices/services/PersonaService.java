package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Persona;

public interface PersonaService {
    List<Persona>listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
}