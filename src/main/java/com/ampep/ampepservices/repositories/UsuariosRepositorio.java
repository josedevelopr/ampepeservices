package com.ampep.ampepservices.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ampep.ampepservices.entities.Usuario;

public interface UsuariosRepositorio extends Repository<Usuario, Integer>{
	List<Usuario>findAll();
	Usuario findByIdUsuario(int id);
	Usuario save(Usuario usu);
	Usuario delete(Usuario usu);
}
