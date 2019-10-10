package com.ampep.ampepservices.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_distrito")
public class Distrito 
{
	@Id
	@Column(name="di_iddistrit")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idDistrito;
	
	@Column(name="di_descripci")
	private String descrDistrito;
	
	@ManyToOne
	@JoinColumn(name="di_idprovinc")
	private Provincia ProvinciaDistrito;
	
	@OneToMany(mappedBy = "distritoColegio", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Colegio> listaDistritoColegio;

	@OneToMany(mappedBy = "distritoApoderado", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Apoderado> listaDistritoApoderado;
	
	@OneToMany(mappedBy = "idDistritProf", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Profesor> listaDistritoProfesor;
	
	public List<Colegio> getListaDistritoColegio() {
		return listaDistritoColegio;
	}

	public void setListaDistritoColegio(List<Colegio> listaDistritoColegio) {
		this.listaDistritoColegio = listaDistritoColegio;
	}

	public List<Apoderado> getListaDistritoApoderado() {
		return listaDistritoApoderado;
	}

	public void setListaDistritoApoderado(List<Apoderado> listaDistritoApoderado) {
		this.listaDistritoApoderado = listaDistritoApoderado;
	}

	public List<Profesor> getListaDistritoProfesor() {
		return listaDistritoProfesor;
	}

	public void setListaDistritoProfesor(List<Profesor> listaDistritoProfesor) {
		this.listaDistritoProfesor = listaDistritoProfesor;
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getDescrDistrito() {
		return descrDistrito;
	}

	public void setDescrDistrito(String descrDistrito) {
		this.descrDistrito = descrDistrito;
	}

	public Provincia getProvinciaDistrito() {
		return ProvinciaDistrito;
	}

	public void setProvinciaDistrito(Provincia provinciaDistrito) {
		ProvinciaDistrito = provinciaDistrito;
	}
	
	
}
