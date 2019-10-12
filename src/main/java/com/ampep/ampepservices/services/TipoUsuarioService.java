package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.TipoUsuario;

public interface TipoUsuarioService {

	List<TipoUsuario>listarTU();
	TipoUsuario listarId(int id);
	TipoUsuario add(TipoUsuario tu);
	TipoUsuario edit(TipoUsuario tu);
	TipoUsuario delete(int id);
}
