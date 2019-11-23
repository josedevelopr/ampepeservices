package com.ampep.ampepservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ampep.ampepservices.entities.Distrito;
import com.ampep.ampepservices.services.DistritoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"ampep"})
public class DistritoController 
{
	@Autowired
	DistritoService service;
	
	@GetMapping("/distritos")
	public List<Distrito>listar()
	{
		return service.listar();
	}
	
	@GetMapping("/distritos/{id}")
	public Distrito listarId(@PathVariable(value="id") int id)
	{
		return service.listarId(id);
	}
}
