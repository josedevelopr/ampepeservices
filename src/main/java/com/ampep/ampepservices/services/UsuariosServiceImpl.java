package com.ampep.ampepservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Usuario;
import com.ampep.ampepservices.repositories.UsuariosRepositorio;

@Service  
public class UsuariosServiceImpl implements UsuarioService{

	@Autowired
	private UsuariosRepositorio repositorio;
	
	@Override
	public List<Usuario> listarUsuarios() {
		return repositorio.findAll();
	}

	@Override
	public Usuario obtenerUsuarioPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario guardar(Usuario usu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario editar(Usuario usu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
