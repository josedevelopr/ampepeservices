package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.TipoUsuario;

public interface TipoUsuarioRepositorio extends Repository<TipoUsuario, Integer>{

	List<TipoUsuario>findAll();
	TipoUsuario findByIdTipousu(int id);
	TipoUsuario save(TipoUsuario tu);
	void delete(TipoUsuario tu);
}
