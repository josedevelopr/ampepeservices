package com.ampep.ampepservices.controller;

import java.util.List;

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

import com.ampep.ampepservices.entities.UsuarioSistema;
import com.ampep.ampepservices.services.UsuarioSistemaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/ampep"})
public class UsuarioSistemaController {

	@Autowired
	UsuarioSistemaService service;
	
	@GetMapping
	public List<UsuarioSistema>listar(){
		
		return service.listarUST();
	}
	
	@PostMapping
	public UsuarioSistema agregar(@RequestBody UsuarioSistema ust) {
		
		return service.add(ust);
	}
	
	@GetMapping(path= {"/usuariosistema/{id}"})
	public UsuarioSistema listarId(@PathVariable("id") int id) {
		
		return service.listarId(id);
	}
	
	@PutMapping(path= {"/usuariosistema/{id}"})
	public UsuarioSistema editar(@RequestBody UsuarioSistema ust, @PathVariable("id") int id) {
	
		ust.setIdUsusist(id);
		return service.edit(ust);
	}
	
	@DeleteMapping(path= {"/usuariosistema/{id}"})
	public UsuarioSistema delete(@PathVariable("id") int id) {
		return service.delete(id);
	}
}
