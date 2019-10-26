package com.ampep.ampepservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.ValidacionRegistroUsuario;
import com.ampep.ampepservices.repositories.ValidacionRegistroUsuarioRepositorio;

@Service
public class ValidacionRegistroUsuarioServiceImpl implements ValidacionRegistroUsuarioService{

	@Autowired
	private ValidacionRegistroUsuarioRepositorio repositorio;
	
	@Override
	public ValidacionRegistroUsuario validacionCodModCodValidDni(String codModular, String dni, String codvali) {
		return repositorio.findByCodModularValRegUsuarioAndDniValRegUsuarioAndCodvaliValRegUsuario(codModular, dni, codvali);
	}

	@Override
	public ValidacionRegistroUsuario add(ValidacionRegistroUsuario validreg) {
		return repositorio.save(validreg);
	}

	@Override
	public ValidacionRegistroUsuario edit(ValidacionRegistroUsuario validreg) {
		return repositorio.save(validreg);
	}

	@Override
	public ValidacionRegistroUsuario listarCodModDni(String codModular, String dni) {
		return repositorio.findByCodModularValRegUsuarioAndDniValRegUsuario(codModular, dni);
	}

}
