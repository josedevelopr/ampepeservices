package com.ampep.ampepservices.services;

import com.ampep.ampepservices.entities.ValidacionRegistroUsuario;

public interface ValidacionRegistroUsuarioService 
{
	ValidacionRegistroUsuario validacionCodModCodValidDni(String codModular, String dni, String codvali);
	ValidacionRegistroUsuario listarCodModDni(String codModular, String dni);
	ValidacionRegistroUsuario add(ValidacionRegistroUsuario validreg);
	ValidacionRegistroUsuario edit(ValidacionRegistroUsuario validreg);
}
