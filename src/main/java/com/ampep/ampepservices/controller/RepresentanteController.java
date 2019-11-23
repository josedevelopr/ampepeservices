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

import com.ampep.ampepservices.entities.Representante;
import com.ampep.ampepservices.services.RepresentanteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class RepresentanteController 
{
	@Autowired
	RepresentanteService service;
	
	@GetMapping("/representantes")
    public List<Representante>listar(){
        return service.listar();
    }  
    @GetMapping(path = {"/representantes/{id}"})
    public Representante listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/representantes")
    public Representante agregar(@Valid @RequestBody Representante apo){
        return service.add(apo);
    }
    @PutMapping(path = {"/representantes/{id}"})
    public Representante editar(@RequestBody Representante apo,@PathVariable("id") int id){
        apo.setIdRepresentante(id);
        return service.edit(apo);
    }
    @DeleteMapping(path = {"/representantes/{id}"})
    public Representante delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
