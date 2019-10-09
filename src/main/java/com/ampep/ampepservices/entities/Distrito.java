package com.ampep.ampepservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
