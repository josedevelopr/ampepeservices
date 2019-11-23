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

import com.ampep.ampepservices.entities.Profesor;
import com.ampep.ampepservices.services.ProfesorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class ProfesorController {

	@Autowired
	ProfesorService service;
	
	@GetMapping(path= {"/profesor/"})
	public List<Profesor>listar() {
		
		return service.listarPROF();
	}
	
	@PostMapping(path= {"/profesor/"})
	public Profesor agregar(@Valid @RequestBody Profesor prof) {
		System.out.print("POST");
		return service.add(prof);
	}
	
	@GetMapping(path= {"/profesor/{id}"})
	public Profesor listarId(@PathVariable("id") int id) {
		
		return service.listarId(id);
	}
	
	@PutMapping(path= {"/profesor/{id}"})
	public Profesor editar(@Valid @RequestBody Profesor prof,@Valid @PathVariable("id") int id) {
	
		prof.setIdProfeso(id);

		System.out.print("cod "+id);
		return service.edit(prof);
	}
	
	@DeleteMapping(path= {"/profesor/{id}"})
	public Profesor delete(@PathVariable("id") int id) {
		return service.delete(id);
	}
}
