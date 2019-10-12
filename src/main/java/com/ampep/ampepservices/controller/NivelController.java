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

import com.ampep.ampepservices.entities.Nivel;
import com.ampep.ampepservices.services.NivelService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/ampep"})
public class NivelController {

	@Autowired
	NivelService service;
	
	@GetMapping("/nivel")
    public List<Nivel>listar(){
        return service.listarNi();
    }  
    @GetMapping(path = {"/nivel/{id}"})
    public Nivel listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/nivel")
    public Nivel agregar(@Valid @RequestBody Nivel ni){
        return service.add(ni);
    }
    @PutMapping(path = {"/nivel/{id}"})
    public Nivel editar(@RequestBody Nivel ni,@PathVariable("id") int id){
        ni.setIdNivel(id);
        return service.edit(ni);
    }
    @DeleteMapping(path = {"/nivel/{id}"})
    public Nivel delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
