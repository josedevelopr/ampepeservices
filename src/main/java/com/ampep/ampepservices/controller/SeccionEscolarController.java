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

import com.ampep.ampepservices.entities.SeccionEscolar;
import com.ampep.ampepservices.services.SeccionEscolarService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/ampep"})
public class SeccionEscolarController 
{
	@Autowired
	SeccionEscolarService service;
	
    @GetMapping("/seccionescolares")
    public List<SeccionEscolar>listar(){
        return service.listar();
        
    }  
    @GetMapping(path = {"/seccionescolares/{id}"})
    public SeccionEscolar listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/seccionescolares")
    public SeccionEscolar agregar(@Valid @RequestBody SeccionEscolar seccion){
        return service.add(seccion);
    }
    @PutMapping(path = {"/seccionescolares/{id}"})
    public SeccionEscolar editar(@RequestBody SeccionEscolar seccion,@PathVariable("id") int id){
    	seccion.setIdSeccion(id);
        return service.edit(seccion);
    }
    @DeleteMapping(path = {"/seccionescolares/{id}"})
    public SeccionEscolar delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
