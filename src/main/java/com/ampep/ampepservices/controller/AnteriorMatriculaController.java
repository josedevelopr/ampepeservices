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

import com.ampep.ampepservices.entities.AnteriorMatricula;
import com.ampep.ampepservices.services.AnteriorMatriculaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class AnteriorMatriculaController 
{
	@Autowired
	AnteriorMatriculaService service;
	
    @GetMapping("/anterioresMatriculas")
    public List<AnteriorMatricula>listar(){
        return service.listar();        
    }  
    
    @GetMapping(path = {"/anterioresMatriculas/{id}"})
    public AnteriorMatricula listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    @PostMapping("/anterioresMatriculas")
    public AnteriorMatricula agregar(@Valid @RequestBody AnteriorMatricula antmat){
        return service.add(antmat);
    }
    
    @PutMapping(path = {"/anterioresMatriculas/{id}"})
    public AnteriorMatricula editar(@RequestBody AnteriorMatricula antmat,@PathVariable("id") int id){
    	antmat.setIdAnteriorMatricula(id);
        return service.edit(antmat);
    }
    
    @DeleteMapping(path = {"/anterioresMatriculas/{id}"})
    public AnteriorMatricula delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
