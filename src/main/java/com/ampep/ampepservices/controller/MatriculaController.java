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

import com.ampep.ampepservices.entities.Matricula;
import com.ampep.ampepservices.services.MatriculaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class MatriculaController 
{
	@Autowired
	MatriculaService service;
	
    @GetMapping("/matriculas")
    public List<Matricula>listar(){
        return service.listar();
        
    }  
    @GetMapping(path = {"/matriculas/{id}"})
    public Matricula listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/matriculas")
    public Matricula agregar(@Valid @RequestBody Matricula mat){
        return service.add(mat);
    }
    @PutMapping(path = {"/matriculas/{id}"})
    public Matricula editar(@RequestBody Matricula mat,@PathVariable("id") int id){
    	mat.setIdMatricula(id);
        return service.edit(mat);
    }
    @DeleteMapping(path = {"/matriculas/{id}"})
    public Matricula delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
