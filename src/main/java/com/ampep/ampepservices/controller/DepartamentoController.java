package com.ampep.ampepservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ampep.ampepservices.entities.Departamento;
import com.ampep.ampepservices.entities.Pais;
import com.ampep.ampepservices.services.DepartamentoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"ampep"})
public class DepartamentoController 
{
	@Autowired
	DepartamentoService service;
	
	@GetMapping("/departamentos")
	public List<Departamento>listar()
	{
		return service.listar();
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamento listarId(@PathVariable(value="id") int id)
	{
		return service.listarId(id);
	}
}
