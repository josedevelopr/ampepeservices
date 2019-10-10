package com.ampep.ampepservices.controller;

import java.util.List;

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

import com.ampep.ampepservices.entities.TipoUsuario;
import com.ampep.ampepservices.services.TipoUsuarioService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/ampep"})
public class TipoUsuarioController {

	@Autowired
	TipoUsuarioService service;
	
	@GetMapping
	public List<TipoUsuario>listar(){
		
		return service.listarTU();
	}
	
	@PostMapping
	public TipoUsuario agregar(@RequestBody TipoUsuario tu) {
		
		return service.add(tu);
	}
	
	@GetMapping(path= {"/tipousuario/{id}"})
	public TipoUsuario listarId(@PathVariable("id") int id) {
		
		return service.listarId(id);
	}
	
	@PutMapping(path= {"/tipousuario/{id}"})
	public TipoUsuario editar(@RequestBody TipoUsuario tu, @PathVariable("id") int id) {
	
		tu.setIdTipousu(id);
		return service.edit(tu);
	}
	
	@DeleteMapping(path= {"/tipousuario/{id}"})
	public TipoUsuario delete(@PathVariable("id") int id) {
		return service.delete(id);
	}
}
