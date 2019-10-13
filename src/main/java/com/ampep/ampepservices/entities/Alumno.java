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
@Table(name="tb_alumno")
public class Alumno 
{
	@Id
	@Column(name="al_idalumno")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAlumno;
	
	@Column(name="al_dnipostul")
	private String dniAlumno;

	@Column(name="al_apepatpos")
	private String apepatAlumno;
	
	@Column(name="al_apematpos")
	private String apematAlumno;
	
	@Column(name="al_nompostul")
	private String nomAlumno;
	
	@Column(name="al_lugarnaci")
	private String lugarnacAlumno;
	
	@Column(name="al_fechnacim")
	@Temporal(TemporalType.DATE)
	private Date fecnacimientoApoderado;
	
	@Column(name="al_diractual")
	private String direcactualAlumno;
	
	@Column(name="al_fotografi")
	private String fotoAlumno;
	
	@Column(name="al_descpostu")
	private String descripAlumno;
	
	@Column(name="al_infimppos")
	private String infoimportanteAlumno;
	
	@Column(name="al_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregistroAlumno;
	
	@ManyToOne
	@JoinColumn(name ="al_idcolegio")
	private Colegio colegioAlumno;
	
	@ManyToOne
	@JoinColumn(name = "al_iddistrit")
	private Distrito distritoAlumno;
	
	@OneToMany(mappedBy = "alumnoMatricula", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Matricula> listaMatriculaAlumno;

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getDniAlumno() {
		return dniAlumno;
	}

	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}

	public String getApepatAlumno() {
		return apepatAlumno;
	}

	public void setApepatAlumno(String apepatAlumno) {
		this.apepatAlumno = apepatAlumno;
	}

	public String getApematAlumno() {
		return apematAlumno;
	}

	public void setApematAlumno(String apematAlumno) {
		this.apematAlumno = apematAlumno;
	}

	public String getNomAlumno() {
		return nomAlumno;
	}

	public void setNomAlumno(String nomAlumno) {
		this.nomAlumno = nomAlumno;
	}

	public String getLugarnacAlumno() {
		return lugarnacAlumno;
	}

	public void setLugarnacAlumno(String lugarnacAlumno) {
		this.lugarnacAlumno = lugarnacAlumno;
	}

	public Date getFecnacimientoApoderado() {
		return fecnacimientoApoderado;
	}

	public void setFecnacimientoApoderado(Date fecnacimientoApoderado) {
		this.fecnacimientoApoderado = fecnacimientoApoderado;
	}

	public String getDirecactualAlumno() {
		return direcactualAlumno;
	}

	public void setDirecactualAlumno(String direcactualAlumno) {
		this.direcactualAlumno = direcactualAlumno;
	}

	public String getFotoAlumno() {
		return fotoAlumno;
	}

	public void setFotoAlumno(String fotoAlumno) {
		this.fotoAlumno = fotoAlumno;
	}

	public String getDescripAlumno() {
		return descripAlumno;
	}

	public void setDescripAlumno(String descripAlumno) {
		this.descripAlumno = descripAlumno;
	}

	public String getInfoimportanteAlumno() {
		return infoimportanteAlumno;
	}

	public void setInfoimportanteAlumno(String infoimportanteAlumno) {
		this.infoimportanteAlumno = infoimportanteAlumno;
	}

	public Date getFecregistroAlumno() {
		return fecregistroAlumno;
	}

	public void setFecregistroAlumno(Date fecregistroAlumno) {
		this.fecregistroAlumno = fecregistroAlumno;
	}

	public Colegio getColegioAlumno() {
		return colegioAlumno;
	}

	public void setColegioAlumno(Colegio colegioAlumno) {
		this.colegioAlumno = colegioAlumno;
	}

	public Distrito getDistritoAlumno() {
		return distritoAlumno;
	}

	public void setDistritoAlumno(Distrito distritoAlumno) {
		this.distritoAlumno = distritoAlumno;
	}
	
}
