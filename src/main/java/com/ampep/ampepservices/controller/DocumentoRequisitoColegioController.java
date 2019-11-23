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
import com.ampep.ampepservices.entities.DocumentoRequisitoColegio;
import com.ampep.ampepservices.services.DocumentoRequisitoColegioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class DocumentoRequisitoColegioController 
{
	@Autowired
	DocumentoRequisitoColegioService service;
	
    @GetMapping("/documentosRequisitoColegio")
    public List<DocumentoRequisitoColegio>listar(){
        return service.listar();
        
    }  
    @GetMapping(path = {"/documentosRequisitoColegio/{id}"})
    public DocumentoRequisitoColegio listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/documentosRequisitoColegio")
    public DocumentoRequisitoColegio agregar(@Valid @RequestBody DocumentoRequisitoColegio docreq){
        return service.add(docreq);
    }
    @PutMapping(path = {"/documentosRequisitoColegio/{id}"})
    public DocumentoRequisitoColegio editar(@RequestBody DocumentoRequisitoColegio docreq,@PathVariable("id") int id){
    	docreq.setIdDocumetoRequesitoColegio(id);
        return service.edit(docreq);
    }
    @DeleteMapping(path = {"/documentosRequisitoColegio/{id}"})
    public DocumentoRequisitoColegio delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
