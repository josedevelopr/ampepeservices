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

import com.ampep.ampepservices.entities.GradoEscolar;
import com.ampep.ampepservices.services.GradoEscolarService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class GradoEscolarController 
{
	@Autowired
	GradoEscolarService service;
	
    @GetMapping("/gradosEscolares")
    public List<GradoEscolar>listar(){
        return service.listar();
        
    }  
    @GetMapping(path = {"/gradosEscolares/{id}"})
    public GradoEscolar listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/gradosEscolares")
    public GradoEscolar agregar(@Valid @RequestBody GradoEscolar apo){
        return service.add(apo);
    }
    @PutMapping(path = {"/gradosEscolares/{id}"})
    public GradoEscolar editar(@RequestBody GradoEscolar apo,@PathVariable("id") int id){
        apo.setIdGrado(id);
        return service.edit(apo);
    }
    @DeleteMapping(path = {"/gradosEscolares/{id}"})
    public GradoEscolar delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
