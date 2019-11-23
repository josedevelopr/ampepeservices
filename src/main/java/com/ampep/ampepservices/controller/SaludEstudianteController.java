package com.ampep.ampepservices.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ampep.ampepservices.entities.SaludEstudiante;
import com.ampep.ampepservices.services.SaludEstudianteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class SaludEstudianteController 
{
	@Autowired
	SaludEstudianteService service;
	
    @GetMapping("/saludEstudiantes")
    public List<SaludEstudiante>listar(){
        return service.listar();        
    }  
    
    @GetMapping(path = {"/saludEstudiantes/{id}"})
    public SaludEstudiante listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    @PostMapping("/saludEstudiantes")
    public SaludEstudiante agregar(@Valid @RequestBody SaludEstudiante salest){
        return service.add(salest);
    }
    
    @PutMapping(path = {"/saludEstudiantes/{id}"})
    public SaludEstudiante editar(@RequestBody SaludEstudiante salest,@PathVariable("id") int id){
    	salest.setIdSaludEstudiante(id);
        return service.edit(salest);
    }
    
    @DeleteMapping(path = {"/saludEstudiantes/{id}"})
    public SaludEstudiante delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
