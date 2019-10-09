package com.ampep.ampepservices.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_pais")
public class Pais 
{
	@Id
	@Column(name="tp_idtbpaiss")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPais;
	
	@Column(name="tp_nombrpais")
	private String nomPais;
	
	@Column(name="tp_desnacion")
	private String descripnacionaliPais;

	@OneToMany(mappedBy="PaisDepartamento", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Departamento> listaDepartamentoPais;
	
	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getNomPais() {
		return nomPais;
	}

	public void setNomPais(String nomPais) {
		this.nomPais = nomPais;
	}

	public String getDescripnacionaliPais() {
		return descripnacionaliPais;
	}

	public void setDescripnacionaliPais(String descripnacionaliPais) {
		this.descripnacionaliPais = descripnacionaliPais;
	}
	
	public List<Departamento> getListaDepartamentoPais() {
		return listaDepartamentoPais;
	}

	public void setListaDepartamentoPais(List<Departamento> listaDepartamentoPais) {
		this.listaDepartamentoPais = listaDepartamentoPais;
	}
	
}
