package com.ampep.ampepservices.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_grado")
public class GradoEscolar 
{
	@Id
	@Column(name="gr_idgrado")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGrado;
	
	@Column(name="gr_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregistroApoderado;
	
	@Column(name="gr_estado")	
	private String estadoApoderado;
	
	@Column(name="gr_idnivel")	
	private String nivelGradoEscolar;
	
	@Column(name="gr_descripci")	
	private String descripcionGradoEscolar;
	
	@ManyToOne
	@JoinColumn(name ="gr_idaniesco")
	private AnioEscolar anioEscolarGrado;
	
	@ManyToOne
	@JoinColumn(name ="gr_idcolegio")
	private Colegio colegioGradoEscolar;

	public int getIdGrado() {
		return idGrado;
	}

	public void setIdGrado(int idGrado) {
		this.idGrado = idGrado;
	}

	public Date getFecregistroApoderado() {
		return fecregistroApoderado;
	}

	public void setFecregistroApoderado(Date fecregistroApoderado) {
		this.fecregistroApoderado = fecregistroApoderado;
	}

	public String getEstadoApoderado() {
		return estadoApoderado;
	}

	public void setEstadoApoderado(String estadoApoderado) {
		this.estadoApoderado = estadoApoderado;
	}

	public String getNivelGradoEscolar() {
		return nivelGradoEscolar;
	}

	public void setNivelGradoEscolar(String nivelGradoEscolar) {
		this.nivelGradoEscolar = nivelGradoEscolar;
	}

	public String getDescripcionGradoEscolar() {
		return descripcionGradoEscolar;
	}

	public void setDescripcionGradoEscolar(String descripcionGradoEscolar) {
		this.descripcionGradoEscolar = descripcionGradoEscolar;
	}

	public AnioEscolar getAnioEscolarGrado() {
		return anioEscolarGrado;
	}

	public void setAnioEscolarGrado(AnioEscolar anioEscolarGrado) {
		this.anioEscolarGrado = anioEscolarGrado;
	}

	public Colegio getColegioGradoEscolar() {
		return colegioGradoEscolar;
	}

	public void setColegioGradoEscolar(Colegio colegioGradoEscolar) {
		this.colegioGradoEscolar = colegioGradoEscolar;
	}
	
	
	
}
