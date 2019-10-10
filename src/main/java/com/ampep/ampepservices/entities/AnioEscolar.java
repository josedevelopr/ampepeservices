package com.ampep.ampepservices.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_anioescol")
public class AnioEscolar 
{
	@Id
	@Column(name="ae_idaniesco")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAnioEscolar;
	
	@Column(name="ae_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregisAnioEscolar;
	
	@Column(name="ae_descripci")
	private String descripAnioEscolar;
	
	@Column(name="ae_estado")
	private String estadoAnioEscolar;
	
	@Column(name="ae_feinanesc")
	@Temporal(TemporalType.DATE)
	private Date fecicioAnioEscolar;
	
	@Column(name="ae_fefianesc")
	@Temporal(TemporalType.DATE)
	private Date fecfinAnioEscolar;
	
	@ManyToOne
	@JoinColumn(name ="ae_idcolegio")
	private Colegio colegioAnioEscolar;
	
	@OneToMany(mappedBy = "anioEscolarGrado", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<GradoEscolar> listaGradoEscolarAnioEscolar;

	public List<GradoEscolar> getListaGradoEscolarAnioEscolar() {
		return listaGradoEscolarAnioEscolar;
	}

	public void setListaGradoEscolarAnioEscolar(List<GradoEscolar> listaGradoEscolarAnioEscolar) {
		this.listaGradoEscolarAnioEscolar = listaGradoEscolarAnioEscolar;
	}

	public int getIdAnioEscolar() {
		return idAnioEscolar;
	}

	public void setIdAnioEscolar(int idAnioEscolar) {
		this.idAnioEscolar = idAnioEscolar;
	}

	public Date getFecregisAnioEscolar() {
		return fecregisAnioEscolar;
	}

	public void setFecregisAnioEscolar(Date fecregisAnioEscolar) {
		this.fecregisAnioEscolar = fecregisAnioEscolar;
	}

	public String getDescripAnioEscolar() {
		return descripAnioEscolar;
	}

	public void setDescripAnioEscolar(String descripAnioEscolar) {
		this.descripAnioEscolar = descripAnioEscolar;
	}

	public String getEstadoAnioEscolar() {
		return estadoAnioEscolar;
	}

	public void setEstadoAnioEscolar(String estadoAnioEscolar) {
		this.estadoAnioEscolar = estadoAnioEscolar;
	}

	public Date getFecicioAnioEscolar() {
		return fecicioAnioEscolar;
	}

	public void setFecicioAnioEscolar(Date fecicioAnioEscolar) {
		this.fecicioAnioEscolar = fecicioAnioEscolar;
	}

	public Date getFecfinAnioEscolar() {
		return fecfinAnioEscolar;
	}

	public void setFecfinAnioEscolar(Date fecfinAnioEscolar) {
		this.fecfinAnioEscolar = fecfinAnioEscolar;
	}

	public Colegio getColegioAnioEscolar() {
		return colegioAnioEscolar;
	}

	public void setColegioAnioEscolar(Colegio colegioAnioEscolar) {
		this.colegioAnioEscolar = colegioAnioEscolar;
	}
	
	
}
