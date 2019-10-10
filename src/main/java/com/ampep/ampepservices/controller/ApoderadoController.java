package com.ampep.ampepservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ampep.ampepservices.entities.Apoderado;
import com.ampep.ampepservices.services.ApoderadoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/ampep"})
public class ApoderadoController 
{
	@Autowired
	ApoderadoService service;
	
    @GetMapping("/apoderados")
    public List<Apoderado>listar(){
        return service.listar();
        
    }  
    @GetMapping(path = {"/apoderados/{id}"})
    public Apoderado listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/apoderados")
    public Apoderado agregar(@ModelAttribute Apoderado apo){
        return service.add(apo);
    }
    @PutMapping(path = {"/apoderados/{id}"})
    public Apoderado editar(@RequestBody Apoderado apo,@PathVariable("id") int id){
        apo.setIdApoderado(id);
        return service.edit(apo);
    }
    @DeleteMapping(path = {"/apoderados/{id}"})
    public Apoderado delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
