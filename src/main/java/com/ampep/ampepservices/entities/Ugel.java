package com.ampep.ampepservices.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_ugel")
public class Ugel 
{
	@Id
	@Column(name="ug_idugel")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUgel;

	@Column(name="ug_idunic")
	private String idUnicUgel;
	
	@Column(name="ug_descripci")
	private String descrUgel;
	
	@Column(name="ug_estado")
	private String estadoUgel;
	
	@Column(name="ug_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecRegUgel;

	@OneToMany(mappedBy = "idUgelColegio", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Colegio> listaColegioUgel;
	
	
	public List<Colegio> getListaColegioUgel() {
		return listaColegioUgel;
	}

	public void setListaColegioUgel(List<Colegio> listaColegioUgel) {
		this.listaColegioUgel = listaColegioUgel;
	}
	public int getIdUgel() {
		return idUgel;
	}

	public void setIdUgel(int idUgel) {
		this.idUgel = idUgel;
	}

	public String getIdUnicUgel() {
		return idUnicUgel;
	}

	public void setIdUnicUgel(String idUnicUgel) {
		this.idUnicUgel = idUnicUgel;
	}

	public String getDescrUgel() {
		return descrUgel;
	}

	public void setDescrUgel(String descrUgel) {
		this.descrUgel = descrUgel;
	}

	public String getEstadoUgel() {
		return estadoUgel;
	}

	public void setEstadoUgel(String estadoUgel) {
		this.estadoUgel = estadoUgel;
	}

	public Date getFecRegUgel() {
		return fecRegUgel;
	}

	public void setFecRegUgel(Date fecRegUgel) {
		this.fecRegUgel = fecRegUgel;
	}
	
	
}
