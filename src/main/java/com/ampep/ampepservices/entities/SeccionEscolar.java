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
@Table(name="tb_seccion")
public class SeccionEscolar 
{
	@Id
	@Column(name="se_idseccion")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSeccion;
	
	@Column(name="se_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregistroSeccion;
	
	@Column(name="se_descripci")
	private String descripcionSeccion;
	
	@ManyToOne
	@JoinColumn(name ="se_idprofeso")
	private Profesor profesorSeccion;
	
	@ManyToOne
	@JoinColumn(name ="se_idcolegio")
	private Colegio colegioSeccion;
	
	@ManyToOne
	@JoinColumn(name ="se_idgrado")
	private GradoEscolar gradoescolarSeccion;
	
	@OneToMany(mappedBy = "seccionescolarMatricula", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Matricula> listaMatriculaSeccionEscolar;

	public int getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}

	public Date getFecregistroSeccion() {
		return fecregistroSeccion;
	}

	public void setFecregistroSeccion(Date fecregistroSeccion) {
		this.fecregistroSeccion = fecregistroSeccion;
	}

	public String getDescripcionSeccion() {
		return descripcionSeccion;
	}

	public void setDescripcionSeccion(String descripcionSeccion) {
		this.descripcionSeccion = descripcionSeccion;
	}

	public Profesor getProfesorSeccion() {
		return profesorSeccion;
	}

	public void setProfesorSeccion(Profesor profesorSeccion) {
		this.profesorSeccion = profesorSeccion;
	}

	public Colegio getColegioSeccion() {
		return colegioSeccion;
	}

	public void setColegioSeccion(Colegio colegioSeccion) {
		this.colegioSeccion = colegioSeccion;
	}

	public GradoEscolar getGradoescolarSeccion() {
		return gradoescolarSeccion;
	}

	public void setGradoescolarSeccion(GradoEscolar gradoescolarSeccion) {
		this.gradoescolarSeccion = gradoescolarSeccion;
	}
	
	
}
