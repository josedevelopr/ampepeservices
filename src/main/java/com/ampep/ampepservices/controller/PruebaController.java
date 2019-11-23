package com.ampep.ampepservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ampep.ampepservices.entities.Prueba;
import com.ampep.ampepservices.services.PruebaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class PruebaController 
{
	@Autowired
	PruebaService service;
	
    @GetMapping
    public List<Prueba>listar(){
        return service.listar();
    }
}
