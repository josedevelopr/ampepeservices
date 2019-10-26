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

import com.ampep.ampepservices.entities.Colegio;
import com.ampep.ampepservices.services.ColegioService;
import com.google.gson.Gson;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/ampep"})
public class ColegioController 
{
	@Autowired
	ColegioService service;
	
	@GetMapping("/colegios")
    public List<Colegio>listar(){
        return service.listar();
    }  
    @GetMapping(path = {"/colegios/{id}"})
    public Colegio listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @GetMapping(path = {"/colegios/validar/{codModular}"})
    public String validarColegioYRepresentante(@PathVariable("codModular")String codModular){
        return service.validarColegioYRpresentante(codModular, "");
    }
    @PostMapping("/colegios")
    public Colegio agregar(@Valid @RequestBody Colegio apo){
        return service.add(apo);
    }
    @PutMapping(path = {"/colegios/{id}"})
    public Colegio editar(@RequestBody Colegio apo,@PathVariable("id") int id){
        apo.setIdColegio(id);
        return service.edit(apo);
    }
    @DeleteMapping(path = {"/colegios/{id}"})
    public Colegio delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
