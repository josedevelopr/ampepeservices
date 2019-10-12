package com.ampep.ampepservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_nivel")
public class Nivel {

	@Id
	@Column(name="ni_idnivel")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int idNivel;
	
	@Column(name="ni_descripci")
	private String descripci;

	public int getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

	public String getDescripci() {
		return descripci;
	}

	public void setDescripci(String descripci) {
		this.descripci = descripci;
	}
}
