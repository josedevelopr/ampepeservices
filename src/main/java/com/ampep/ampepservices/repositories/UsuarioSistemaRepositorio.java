package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.UsuarioSistema;

public interface UsuarioSistemaRepositorio extends Repository<UsuarioSistema, Integer>{

	List<UsuarioSistema>findAll();
	UsuarioSistema findOne(int id);
	UsuarioSistema save(UsuarioSistema ust);
	void delete(UsuarioSistema ust);
}
