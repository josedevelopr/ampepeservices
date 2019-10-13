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
@Table(name="tb_matricula")
public class Matricula 
{
	@Id
	@Column(name="ma_idmatricu")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idMatricula;
	
	@Column(name="ma_estado")
	private String estadoMatricula;
		
	@Column(name="ma_fecharegi")
	@Temporal(TemporalType.DATE)
	private Date fecregistroMatricula;
	
	@ManyToOne
	@JoinColumn(name ="ma_idcolegio")
	private Colegio colegioMatricula;
	
	@ManyToOne
	@JoinColumn(name ="ma_idapodera")
	private Apoderado apoderadoMatricula;
	
	@ManyToOne
	@JoinColumn(name ="ma_idalumno")
	private Alumno alumnoMatricula;
	
	@ManyToOne
	@JoinColumn(name ="ma_idseccion")
	private SeccionEscolar seccionescolarMatricula;
	
	@ManyToOne
	@JoinColumn(name ="ma_idaniesco")
	private AnioEscolar anioescolarMatricula;

	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public String getEstadoMatricula() {
		return estadoMatricula;
	}

	public void setEstadoMatricula(String estadoMatricula) {
		this.estadoMatricula = estadoMatricula;
	}

	public Date getFecregistroMatricula() {
		return fecregistroMatricula;
	}

	public void setFecregistroMatricula(Date fecregistroMatricula) {
		this.fecregistroMatricula = fecregistroMatricula;
	}

	public Colegio getColegioMatricula() {
		return colegioMatricula;
	}

	public void setColegioMatricula(Colegio colegioMatricula) {
		this.colegioMatricula = colegioMatricula;
	}

	public Apoderado getApoderadoMatricula() {
		return apoderadoMatricula;
	}

	public void setApoderadoMatricula(Apoderado apoderadoMatricula) {
		this.apoderadoMatricula = apoderadoMatricula;
	}

	public Alumno getAlumnoMatricula() {
		return alumnoMatricula;
	}

	public void setAlumnoMatricula(Alumno alumnoMatricula) {
		this.alumnoMatricula = alumnoMatricula;
	}

	public SeccionEscolar getSeccionescolarMatricula() {
		return seccionescolarMatricula;
	}

	public void setSeccionescolarMatricula(SeccionEscolar seccionescolarMatricula) {
		this.seccionescolarMatricula = seccionescolarMatricula;
	}

	public AnioEscolar getAnioescolarMatricula() {
		return anioescolarMatricula;
	}

	public void setAnioescolarMatricula(AnioEscolar anioescolarMatricula) {
		this.anioescolarMatricula = anioescolarMatricula;
	}
}
