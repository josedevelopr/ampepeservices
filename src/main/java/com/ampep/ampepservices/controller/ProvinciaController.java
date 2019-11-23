package com.ampep.ampepservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ampep.ampepservices.entities.Provincia;
import com.ampep.ampepservices.services.ProvinciaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"ampep"})
public class ProvinciaController 
{
	@Autowired
	ProvinciaService service;
	
	@GetMapping("/provincias")
	public List<Provincia>listar()
	{
		return service.listar();
	}
	
	@GetMapping("/provincias/{id}")
	public Provincia listarId(@PathVariable(value="id") int id)
	{
		return service.listarId(id);
	}
}
