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

import com.ampep.ampepservices.entities.Apoderado;
import com.ampep.ampepservices.entities.DocumentosPresentado;
import com.ampep.ampepservices.services.ApoderadoService;
import com.ampep.ampepservices.services.DocumentosPresentadoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class DocumentosPresentadoController 
{
	@Autowired
	DocumentosPresentadoService service;
	
    @GetMapping("/documentosPresentados")
    public List<DocumentosPresentado>listar(){
        return service.listar();
        
    }  
    @GetMapping(path = {"/documentosPresentados/{id}"})
    public DocumentosPresentado listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/documentosPresentados")
    public DocumentosPresentado agregar(@Valid @RequestBody DocumentosPresentado docpres){
        return service.add(docpres);
    }
    @PutMapping(path = {"/documentosPresentados/{id}"})
    public DocumentosPresentado editar(@RequestBody DocumentosPresentado docpres,@PathVariable("id") int id){
    	docpres.setIdDocumentosPresentado(id);
        return service.edit(docpres);
    }
    @DeleteMapping(path = {"/documentosPresentados/{id}"})
    public DocumentosPresentado delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
