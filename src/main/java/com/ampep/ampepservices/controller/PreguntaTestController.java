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

import com.ampep.ampepservices.entities.PreguntaTest;
import com.ampep.ampepservices.services.PreguntaTestService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class PreguntaTestController {
	@Autowired
	PreguntaTestService service;
	
    @GetMapping("/preguntasTest")
    public List<PreguntaTest>listar(){
        return service.listar();
        
    }  
    @GetMapping(path = {"/preguntasTest/{id}"})
    public PreguntaTest listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/preguntasTest")
    public PreguntaTest agregar(@Valid @RequestBody PreguntaTest pregtes){
        return service.add(pregtes);
    }
    @PutMapping(path = {"/preguntasTest/{id}"})
    public PreguntaTest editar(@RequestBody PreguntaTest pregtes,@PathVariable("id") int id){
        pregtes.setIdPreguntaTest(id);
        return service.edit(pregtes);
    }
    @DeleteMapping(path = {"/preguntasTest/{id}"})
    public PreguntaTest delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
