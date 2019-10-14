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
@Table(name="tb_apoderado")
public class SaludEstudiante 
{
	@Id
	@Column(name="se_idsaluest")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSaludEstudiante;
	
	@Column(name="se_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregistroSaludEstudiante;
	
	@Column(name="se_antepaper")
	private String antecaspaperaSaludEstudiante;
	
	@Column(name="se_anterubio")
	private String antecasrubiolaSaludEstudiante;
	
	@Column(name="se_antevaric")
	private String antecasvaricelaSaludEstudiante;
	
	@Column(name="se_antesaram")
	private String antecassarampionSaludEstudiante;
	
	@Column(name="se_antehepat")
	private String antecashepatitisSaludEstudiante;
	
	@Column(name="se_antetifoi")
	private String antecastifoideaSaludEstudiante;
	
	@Column(name="se_antecasma")
	private String antecasasmaSaludEstudiante;
	
	@Column(name="se_alergia")
	private String antecasalergiaSaludEstudiante;
	
	@Column(name="se_probvisua")
	private String probvisualSaludEstudiante;
	
	@Column(name="se_probaudit")
	private String probauditivioSaludEstudiante;
	
	@Column(name="se_saluinfan")
	private String saludinfantilSaludEstudiante;
	
	@Column(name="se_infoadici")
	private String infoadicionalSaludEstudiante;
	
	@ManyToOne
	@JoinColumn(name ="se_idalumno")
	private Alumno alumnoSaludoEstudiante;
	
	@ManyToOne
	@JoinColumn(name ="se_idcolegio")
	private Colegio colegioSaludoEstudiante;

	public int getIdSaludEstudiante() {
		return idSaludEstudiante;
	}

	public void setIdSaludEstudiante(int idSaludEstudiante) {
		this.idSaludEstudiante = idSaludEstudiante;
	}

	public Date getFecregistroSaludEstudiante() {
		return fecregistroSaludEstudiante;
	}

	public void setFecregistroSaludEstudiante(Date fecregistroSaludEstudiante) {
		this.fecregistroSaludEstudiante = fecregistroSaludEstudiante;
	}

	public String getAntecaspaperaSaludEstudiante() {
		return antecaspaperaSaludEstudiante;
	}

	public void setAntecaspaperaSaludEstudiante(String antecaspaperaSaludEstudiante) {
		this.antecaspaperaSaludEstudiante = antecaspaperaSaludEstudiante;
	}

	public String getAntecasrubiolaSaludEstudiante() {
		return antecasrubiolaSaludEstudiante;
	}

	public void setAntecasrubiolaSaludEstudiante(String antecasrubiolaSaludEstudiante) {
		this.antecasrubiolaSaludEstudiante = antecasrubiolaSaludEstudiante;
	}

	public String getAntecasvaricelaSaludEstudiante() {
		return antecasvaricelaSaludEstudiante;
	}

	public void setAntecasvaricelaSaludEstudiante(String antecasvaricelaSaludEstudiante) {
		this.antecasvaricelaSaludEstudiante = antecasvaricelaSaludEstudiante;
	}

	public String getAntecassarampionSaludEstudiante() {
		return antecassarampionSaludEstudiante;
	}

	public void setAntecassarampionSaludEstudiante(String antecassarampionSaludEstudiante) {
		this.antecassarampionSaludEstudiante = antecassarampionSaludEstudiante;
	}

	public String getAntecashepatitisSaludEstudiante() {
		return antecashepatitisSaludEstudiante;
	}

	public void setAntecashepatitisSaludEstudiante(String antecashepatitisSaludEstudiante) {
		this.antecashepatitisSaludEstudiante = antecashepatitisSaludEstudiante;
	}

	public String getAntecastifoideaSaludEstudiante() {
		return antecastifoideaSaludEstudiante;
	}

	public void setAntecastifoideaSaludEstudiante(String antecastifoideaSaludEstudiante) {
		this.antecastifoideaSaludEstudiante = antecastifoideaSaludEstudiante;
	}

	public String getAntecasasmaSaludEstudiante() {
		return antecasasmaSaludEstudiante;
	}

	public void setAntecasasmaSaludEstudiante(String antecasasmaSaludEstudiante) {
		this.antecasasmaSaludEstudiante = antecasasmaSaludEstudiante;
	}

	public String getAntecasalergiaSaludEstudiante() {
		return antecasalergiaSaludEstudiante;
	}

	public void setAntecasalergiaSaludEstudiante(String antecasalergiaSaludEstudiante) {
		this.antecasalergiaSaludEstudiante = antecasalergiaSaludEstudiante;
	}

	public String getProbvisualSaludEstudiante() {
		return probvisualSaludEstudiante;
	}

	public void setProbvisualSaludEstudiante(String probvisualSaludEstudiante) {
		this.probvisualSaludEstudiante = probvisualSaludEstudiante;
	}

	public String getProbauditivioSaludEstudiante() {
		return probauditivioSaludEstudiante;
	}

	public void setProbauditivioSaludEstudiante(String probauditivioSaludEstudiante) {
		this.probauditivioSaludEstudiante = probauditivioSaludEstudiante;
	}

	public String getSaludinfantilSaludEstudiante() {
		return saludinfantilSaludEstudiante;
	}

	public void setSaludinfantilSaludEstudiante(String saludinfantilSaludEstudiante) {
		this.saludinfantilSaludEstudiante = saludinfantilSaludEstudiante;
	}

	public String getInfoadicionalSaludEstudiante() {
		return infoadicionalSaludEstudiante;
	}

	public void setInfoadicionalSaludEstudiante(String infoadicionalSaludEstudiante) {
		this.infoadicionalSaludEstudiante = infoadicionalSaludEstudiante;
	}

	public Alumno getAlumnoSaludoEstudiante() {
		return alumnoSaludoEstudiante;
	}

	public void setAlumnoSaludoEstudiante(Alumno alumnoSaludoEstudiante) {
		this.alumnoSaludoEstudiante = alumnoSaludoEstudiante;
	}

	public Colegio getColegioSaludoEstudiante() {
		return colegioSaludoEstudiante;
	}

	public void setColegioSaludoEstudiante(Colegio colegioSaludoEstudiante) {
		this.colegioSaludoEstudiante = colegioSaludoEstudiante;
	}
	
	
}
