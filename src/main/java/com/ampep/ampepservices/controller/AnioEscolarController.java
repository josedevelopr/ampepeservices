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

import com.ampep.ampepservices.entities.AnioEscolar;
import com.ampep.ampepservices.services.AnioEscolarService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/ampep"})
public class AnioEscolarController 
{
	@Autowired
	AnioEscolarService service;
	
    @GetMapping("/aniosEscolares")
    public List<AnioEscolar>listar(){
        return service.listar();
    }  
    @GetMapping(path = {"/aniosEscolares/{id}"})
    public AnioEscolar listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/aniosEscolares")
    public AnioEscolar agregar(@Valid @RequestBody AnioEscolar apo){
        return service.add(apo);
    }
    @PutMapping(path = {"/aniosEscolares/{id}"})
    public AnioEscolar editar(@RequestBody AnioEscolar apo,@PathVariable("id") int id){
        apo.setIdAnioEscolar(id);
        return service.edit(apo);
    }
    @DeleteMapping(path = {"/aniosEscolares/{id}"})
    public AnioEscolar delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
