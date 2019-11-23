package com.ampep.ampepservices.controller;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
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

import com.ampep.ampepservices.entities.Colegio;
import com.ampep.ampepservices.entities.ColegioMinedu;
import com.ampep.ampepservices.entities.Distrito;
import com.ampep.ampepservices.entities.Representante;
import com.ampep.ampepservices.entities.Ugel;
import com.ampep.ampepservices.services.ColegioService;
//import com.google.gson.Gson;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class ColegioController 
{
	@Autowired
	ColegioService service;
	EntityManager em;
	
	@GetMapping("/colegios")
    public List<Colegio>listar(){
        return service.listar();
    }  
    @GetMapping(path = {"/colegios/{id}"})
    public Colegio listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @GetMapping(path = {"/colegios/validar/{codModular}"})
    public Colegio validarColegioYRepresentante(@PathVariable("codModular")String codModular){
        
    	return service.validarColegio(codModular);
    	
    }
    
    @GetMapping(path = {"/colegios/validar_registro/{codModular}"})
    public String validarColegioRegistro(@PathVariable("codModular")String codModular){
    	System.out.print("********************************************");
    	System.out.print(codModular);
    	return em.createNamedStoredProcedureQuery("usp_validar_colegio").setParameter("it_codmodular", codModular).getResultList().toString();
    }
    
    @PostMapping("/colegios")
    public Colegio agregar(@Valid @RequestBody ColegioMinedu colegio){
        Colegio objColegio = new Colegio();
        Representante objRepresentante = new Representante();
        Distrito objDistrito = new Distrito();
        Ugel objUgel = new Ugel();
        
        objDistrito.setIdDistrito(1358);
        objUgel.setIdUgel(156);
        //objColegio.setI
    	objColegio.setDireccionColegio(colegio.getDireccionColegio());
    	objColegio.setDirectorColegio(colegio.getDirectorColegio());
    	objColegio.setFecRegistroColegio(new Date());
    	objColegio.setNomColegio(colegio.getNombreColegio());
    	objColegio.setDistritoColegio(objDistrito);
    	objColegio.setIdUgelColegio(objUgel);
    	objColegio.setIdModularColegio(colegio.getCodmodularColegio());
    	
    	return service.add(objColegio);    	
    }
    @PutMapping(path = {"/colegios/{id}"})
    public Colegio editar(@RequestBody Colegio apo,@PathVariable("id") int id){
        apo.setIdColegio(id);
        return service.edit(apo);
    }
    @DeleteMapping(path = {"/colegios/{id}"})
    public Colegio delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
