package com.ampep.ampepservices.entities;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_grado")
public class GradoEscolar 
{
	@Id
	@Column(name="gr_idgrado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGrado;
	
	@Column(name="gr_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregistroApoderado;
	
	@Column(name="gr_estado")	
	private String estadoApoderado;
	
	public List<SeccionEscolar> getListaSeccionEscolarColegio() {
		return listaSeccionEscolarColegio;
	}

	public void setListaSeccionEscolarColegio(List<SeccionEscolar> listaSeccionEscolarColegio) {
		this.listaSeccionEscolarColegio = listaSeccionEscolarColegio;
	}

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
	
	@OneToMany(mappedBy = "gradoescolarSeccion", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<SeccionEscolar> listaSeccionEscolarColegio;
	
	@OneToMany(mappedBy = "gradoAnuncio", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Anuncio> listaAnunciosGradoEscolar;

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

	public List<Anuncio> getListaAnunciosGradoEscolar() {
		return listaAnunciosGradoEscolar;
	}

	public void setListaAnunciosGradoEscolar(List<Anuncio> listaAnunciosGradoEscolar) {
		this.listaAnunciosGradoEscolar = listaAnunciosGradoEscolar;
	}
	
}
