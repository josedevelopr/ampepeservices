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

import com.ampep.ampepservices.entities.Alumno;
import com.ampep.ampepservices.services.AlumnoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class AlumnoController 
{
	@Autowired
	AlumnoService service;
	
    @GetMapping("/alumnos")
    public List<Alumno>listar(){
        return service.listar();
        
    }  
    @GetMapping(path = {"/alumnos/{id}"})
    public Alumno listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/alumnos")
    public Alumno agregar(@Valid @RequestBody Alumno alu){
        return service.add(alu);
    }
    @PutMapping(path = {"/alumnos/{id}"})
    public Alumno editar(@RequestBody Alumno alu,@PathVariable("id") int id){
    	alu.setIdAlumno(id);
        return service.edit(alu);
    }
    @DeleteMapping(path = {"/alumnos/{id}"})
    public Alumno delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
