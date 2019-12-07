package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.entities.Usuario;

public interface UsuarioService {
	List<Usuario> listarUsuarios();
	Usuario obtenerUsuarioPorId(int id);
	Usuario guardar(Usuario usu);
	Usuario editar(Usuario usu);
	Usuario eliminar(int id);
}
