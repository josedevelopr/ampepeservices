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
@Table(name="tb_departame")
public class Departamento 
{
	@Id
	@Column(name="td_iddeparta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDepartamento;
	
	@Column(name="td_nomdepart")
	private String nomDepartamento;
	
	@ManyToOne
	@JoinColumn(name="td_idtbpaiss")
	private Pais PaisDepartamento;
	
	@OneToMany(mappedBy="DepartamentoProvincia", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Provincia> listaProvinciaDepartameto;

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNomDepartamento() {
		return nomDepartamento;
	}

	public void setNomDepartamento(String nomDepartamento) {
		this.nomDepartamento = nomDepartamento;
	}

	public Pais getPaisDepartamento() {
		return PaisDepartamento;
	}

	public void setPaisDepartamento(Pais paisDepartamento) {
		PaisDepartamento = paisDepartamento;
	}

	public List<Provincia> getListaProvinciaDepartameto() {
		return listaProvinciaDepartameto;
	}

	public void setListaProvinciaDepartameto(List<Provincia> listaProvinciaDepartameto) {
		this.listaProvinciaDepartameto = listaProvinciaDepartameto;
	}
	
	
	
	
}
