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
@Table(name="tb_provincia")
public class Provincia 
{
	@Id
	@Column(name="pr_idprovinc")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProvincia;
	
	@Column(name="pr_descripci")
	private String nomProvincia;
	
	@ManyToOne
	@JoinColumn(name="pr_iddeparta")
	private Departamento DepartamentoProvincia;
	
	@OneToMany(mappedBy = "ProvinciaDistrito", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Distrito> listaDistritoProvincia;

	public List<Distrito> getListaDistritoProvincia() {
		return listaDistritoProvincia;
	}

	public void setListaDistritoProvincia(List<Distrito> listaDistritoProvincia) {
		this.listaDistritoProvincia = listaDistritoProvincia;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNomProvincia() {
		return nomProvincia;
	}

	public void setNomProvincia(String nomProvincia) {
		this.nomProvincia = nomProvincia;
	}

	public Departamento getDepartamentoProvincia() {
		return DepartamentoProvincia;
	}

	public void setDepartamentoProvincia(Departamento departamentoProvincia) {
		DepartamentoProvincia = departamentoProvincia;
	}
	
	
}
