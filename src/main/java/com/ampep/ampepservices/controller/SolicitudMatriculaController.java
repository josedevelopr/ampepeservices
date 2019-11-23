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

import com.ampep.ampepservices.entities.SolicitudMatricula;
import com.ampep.ampepservices.services.SolicitudMatriculaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class SolicitudMatriculaController 
{
	@Autowired
	SolicitudMatriculaService service;
	
    @GetMapping("/solicitudesmatriculas")
    public List<SolicitudMatricula>listar(){
        return service.listar();
        
    }  
    @GetMapping(path = {"/solicitudesmatriculas/{id}"})
    public SolicitudMatricula listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/solicitudesmatriculas")
    public SolicitudMatricula agregar(@Valid @RequestBody SolicitudMatricula soli){
        return service.add(soli);
    }
    @PutMapping(path = {"/solicitudesmatriculas/{id}"})
    public SolicitudMatricula editar(@RequestBody SolicitudMatricula soli,@PathVariable("id") int id){
    	soli.setIdSolicitudMatricula(id);
        return service.edit(soli);
    }
    @DeleteMapping(path = {"/solicitudesmatriculas/{id}"})
    public SolicitudMatricula delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
