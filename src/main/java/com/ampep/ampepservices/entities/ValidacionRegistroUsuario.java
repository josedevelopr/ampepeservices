package com.ampep.ampepservices.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_validacionregusuario")
public class ValidacionRegistroUsuario 
{
	@Id	
	@Column(name="va_idvalidac")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idValidRegUsuario;
	
	@Column(name="va_codmodcol")
	private String codModularValRegUsuario;
	
	@Column(name="va_dnirepres")
	private String dniValRegUsuario;
	
	@Column(name="va_fecregist")
	@Temporal(TemporalType.DATE)
	private Date fecRegistrValRegUsuario;
	
	@Column(name="va_correpara")
	private String correoValRegUsuario;
	
	@Column(name="va_codvalida")
	private String codvaliValRegUsuario;
	
	@Column(name="va_estadoval")
	private String estadoValRegUsuario;

	public int getIdValidRegUsuario() {
		return idValidRegUsuario;
	}

	public void setIdValidRegUsuario(int idValidRegUsuario) {
		this.idValidRegUsuario = idValidRegUsuario;
	}

	public String getCodModularValRegUsuario() {
		return codModularValRegUsuario;
	}

	public void setCodModularValRegUsuario(String codModularValRegUsuario) {
		this.codModularValRegUsuario = codModularValRegUsuario;
	}

	public String getDniValRegUsuario() {
		return dniValRegUsuario;
	}

	public void setDniValRegUsuario(String dniValRegUsuario) {
		this.dniValRegUsuario = dniValRegUsuario;
	}

	public Date getFecRegistrValRegUsuario() {
		return fecRegistrValRegUsuario;
	}

	public void setFecRegistrValRegUsuario(Date fecRegistrValRegUsuario) {
		this.fecRegistrValRegUsuario = fecRegistrValRegUsuario;
	}

	public String getCorreoValRegUsuario() {
		return correoValRegUsuario;
	}

	public void setCorreoValRegUsuario(String correoValRegUsuario) {
		this.correoValRegUsuario = correoValRegUsuario;
	}

	public String getCodvaliValRegUsuario() {
		return codvaliValRegUsuario;
	}

	public void setCodvaliValRegUsuario(String codvaliValRegUsuario) {
		this.codvaliValRegUsuario = codvaliValRegUsuario;
	}

	public String getEstadoValRegUsuario() {
		return estadoValRegUsuario;
	}

	public void setEstadoValRegUsuario(String estadoValRegUsuario) {
		this.estadoValRegUsuario = estadoValRegUsuario;
	}
	
}
