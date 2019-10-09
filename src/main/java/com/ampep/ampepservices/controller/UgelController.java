package com.ampep.ampepservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ampep.ampepservices.entities.Ugel;
import com.ampep.ampepservices.services.UgelService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"ampep"})
public class UgelController 
{
	@Autowired
	UgelService service;
	
	@GetMapping("/ugeles")
	public List<Ugel>listar()
	{
		return service.listar();
	}
	
	@GetMapping("/ugeles/{id}")
	public Ugel listarId(@PathVariable(value="id") int id)
	{
		return service.listarId(id);
	}
}
