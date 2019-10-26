package com.ampep.ampepservices.repositories;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.ValidacionRegistroUsuario;

public interface ValidacionRegistroUsuarioRepositorio extends Repository<ValidacionRegistroUsuario, Integer>{
	ValidacionRegistroUsuario findByCodModularValRegUsuarioAndDniValRegUsuarioAndCodvaliValRegUsuario(String codModular, String dni, String codvali);
	ValidacionRegistroUsuario findByCodModularValRegUsuarioAndDniValRegUsuario(String codModular, String dni);
	ValidacionRegistroUsuario save(ValidacionRegistroUsuario ust);
}
