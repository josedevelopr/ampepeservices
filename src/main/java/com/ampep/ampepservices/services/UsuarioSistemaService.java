package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.UsuarioSistema;

public interface UsuarioSistemaService {

	List<UsuarioSistema>listarUST();
	UsuarioSistema listarId(int id);
	UsuarioSistema add(UsuarioSistema tu);
	UsuarioSistema edit(UsuarioSistema tu);
	UsuarioSistema delete(int id);
}
