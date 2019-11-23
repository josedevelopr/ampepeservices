package com.ampep.ampepservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ampep.ampepservices.entities.Colegio;
import com.ampep.ampepservices.entities.UsuarioSistema;
import com.ampep.ampepservices.entities.ValidacionRegistroUsuario;
import com.ampep.ampepservices.services.ColegioService;
import com.ampep.ampepservices.services.ValidacionRegistroUsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/ampep"})
public class ValidacionRegistroUsuarioController {
	@Autowired
	ValidacionRegistroUsuarioService service;
	ColegioService serviceColegio;
	
	@PostMapping(path= {"/validacionregistro/"})
	public ValidacionRegistroUsuario agregar(@RequestBody ValidacionRegistroUsuario valreg) {
		
		return service.add(valreg);
	}
	
	@PutMapping(path= {"/validacionregistro/{id}"})
	public ValidacionRegistroUsuario editar(@RequestBody ValidacionRegistroUsuario valreg, @PathVariable("id") int id) {
	
		
		return service.edit(valreg);
	}
	
	@GetMapping(path= {"/validacionregistro/{codmodular}/{dni}"})
	public ValidacionRegistroUsuario buscarValidacion(@PathVariable("codmodular") String codmodular,@PathVariable("dni") String dni) {
		
		return service.listarCodModDni(codmodular, dni);
	}
	
	@GetMapping(path= {"/validacionregistro/{codmodular}/{dni}/{codvalidacion}"})
	public ValidacionRegistroUsuario validarRegistro(@PathVariable("codmodular") String codmodular,@PathVariable("dni") String dni,@PathVariable("codvalidacion") String codvalidacion) {		
		ValidacionRegistroUsuario objValidacion = service.validacionCodModCodValidDni(codmodular, dni, codvalidacion);
		
		if(objValidacion!=null || objValidacion.getIdValidRegUsuario()+""!="")		
		{
			objValidacion.setEstadoValRegUsuario("2");
			service.edit(objValidacion);
		}
		return objValidacion;		
	}
}
