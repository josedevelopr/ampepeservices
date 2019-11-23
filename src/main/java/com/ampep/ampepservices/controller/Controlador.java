package com.ampep.ampepservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsConfigurationSource;

import com.ampep.ampepservices.entities.Persona;
import com.ampep.ampepservices.services.PersonaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/personas"})
public class Controlador {
	
    @Autowired
    PersonaService service;
    
    @GetMapping
    public List<Persona>listar(){
        return service.listar();
    }
    @PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    }
    @GetMapping(path = {"/{id}"})
    public Persona listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PutMapping(path = {"/{id}"})
    public Persona editar(@RequestBody Persona p,@PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public Persona delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}