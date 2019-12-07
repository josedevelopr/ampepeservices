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

import com.ampep.ampepservices.entities.Anuncio;
import com.ampep.ampepservices.entities.Colegio;
import com.ampep.ampepservices.entities.GradoEscolar;
import com.ampep.ampepservices.entities.UsuarioSistema;
import com.ampep.ampepservices.services.AnuncioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class AnuncioController {
	@Autowired
	AnuncioService service;
	
	 @GetMapping("/anuncios")
    public List<Anuncio>listar(){
        return service.listar();
        
    } 
	@GetMapping(path = {"/Anuncios/{id}"})
	public Anuncio listarId(@PathVariable("id")int id){
	        return service.listarId(id);
	}
	@PostMapping("/anuncios")
    public Anuncio agregar(@Valid @RequestBody Anuncio alu){
        return service.add(alu);
    }
	@PostMapping("/anuncios/nuevo/{idgrado}/{idusuario}/{titulo}/{descripcion}/{fecregis}/{fecinicio}/{fecfin}/{estado}")
    public Anuncio agregarAnuncio(@PathVariable("idgrado") int idgrado,
    							  @PathVariable("idusuario") int idusuario,
    							  @PathVariable("titulo") String titulo,
    							  @PathVariable("descripcion") String descripcion,
    							  @PathVariable("fecregis") String fecregis,
    							  @PathVariable("fecinicio") String fecinicio,
    							  @PathVariable("fecfin") String fecfin,
    							  @PathVariable("estado") String estado){
		
		Anuncio anuncio			= new Anuncio();
		Colegio cole 			= new Colegio();
		//cole.setIdColegio(idcolegio);
		GradoEscolar grad		= new GradoEscolar();
		grad.setIdGrado(idgrado);
		UsuarioSistema usua		= new UsuarioSistema();
		usua.setIdUsusist(idusuario);
		
		anuncio.setColegioAnuncio(cole);
		anuncio.setDescAnuncio(descripcion);
		anuncio.setEstadoAnuncio(estado);
		//anuncio.setFecfinAnuncio(fecfin);
		//anuncio.setFecinAnuncio(fecinicio);
		//anuncio.setFecRegAnuncio(fecregis);
		anuncio.setGradoAnuncio(grad);
		anuncio.setIdAnuncio(0);
		anuncio.setTitAnuncio(titulo);
		anuncio.setUsuariosisAnuncio(usua);
		
        return service.add(anuncio);
    }
    @PutMapping(path = {"/anuncios/{id}"})
    public Anuncio editar(@RequestBody Anuncio alu,@PathVariable("id") int id){
    	alu.setIdAnuncio(id);
        return service.edit(alu);
    }
    @DeleteMapping(path = {"/anuncios/{id}"})
    public Anuncio delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
