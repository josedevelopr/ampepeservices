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
import com.ampep.ampepservices.entities.DocumentoRequerido;
import com.ampep.ampepservices.services.DocumentoRequeridoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/ampep"})
public class DocumentoRequeridoController 
{
	@Autowired
	DocumentoRequeridoService service;
	
    @GetMapping("/documentosRequeridos")
    public List<DocumentoRequerido>listar(){
        return service.listar();        
    }  
    @GetMapping(path = {"/documentosRequeridos/{id}"})
    public DocumentoRequerido listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/documentosRequeridos")
    public DocumentoRequerido agregar(@Valid @RequestBody DocumentoRequerido docreq){
        return service.add(docreq);
    }
    @PutMapping(path = {"/documentosRequeridos/{id}"})
    public DocumentoRequerido editar(@RequestBody DocumentoRequerido docreq,@PathVariable("id") int id){
        docreq.setIdDocumentoRequisito(id);
        return service.edit(docreq);
    }
    @DeleteMapping(path = {"/documentosRequeridos/{id}"})
    public DocumentoRequerido delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
