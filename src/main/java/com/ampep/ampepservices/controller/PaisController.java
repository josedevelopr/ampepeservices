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

import com.ampep.ampepservices.entities.Pais;
import com.ampep.ampepservices.services.PaisService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"ampep"})
public class PaisController 
{
	@Autowired
	PaisService service;
	
	@GetMapping("/paises")
	public List<Pais>listar()
	{
		return service.listar();
	}
	
	@GetMapping("/paises/{id}")
	public Pais listarId(@PathVariable(value="id") int id)
	{
		return service.listarId(id);
	}
	
	@PostMapping("/paises")
	public Pais agregarPais(@Valid @RequestBody Pais pais)
	{
		return service.add(pais);
	}
	
	@PutMapping("/paises/{id}")	
    public Pais editar(@RequestBody Pais p,@PathVariable("id") int id){
        p.setIdPais(id);
        return service.edit(p);
    }
	@DeleteMapping(path = {"/paises/{id}"})
	public Pais delete(@PathVariable("id") int  id){
	   return service.delete(id);
	}
}
