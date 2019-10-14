package com.ampep.ampepservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_antematric")
public class AnteriorMatricula 
{
	@Id
	@Column(name="am_idantmatr")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAnteriorMatricula;
	
	@Column(name="am_colegante")
	private String anteriorColegAnteriorMatricula;
	
	@Column(name="am_gradcurso")
	private String anteriorGradCursoAnteriorMatricula;
	
	@Column(name="am_motiegres")
	private String motivoEgresoAnteriorMatricula;
	
	@ManyToOne
	@JoinColumn(name ="am_idcolegio")
	private Colegio colegioAnteriorMatricula ;
	
	@ManyToOne
	@JoinColumn(name ="am_idsolmatr")
	private SolicitudMatricula solicitudMatAnteriorMatricula ;

	public int getIdAnteriorMatricula() {
		return idAnteriorMatricula;
	}

	public void setIdAnteriorMatricula(int idAnteriorMatricula) {
		this.idAnteriorMatricula = idAnteriorMatricula;
	}

	public String getAnteriorColegAnteriorMatricula() {
		return anteriorColegAnteriorMatricula;
	}

	public void setAnteriorColegAnteriorMatricula(String anteriorColegAnteriorMatricula) {
		this.anteriorColegAnteriorMatricula = anteriorColegAnteriorMatricula;
	}

	public String getAnteriorGradCursoAnteriorMatricula() {
		return anteriorGradCursoAnteriorMatricula;
	}

	public void setAnteriorGradCursoAnteriorMatricula(String anteriorGradCursoAnteriorMatricula) {
		this.anteriorGradCursoAnteriorMatricula = anteriorGradCursoAnteriorMatricula;
	}

	public String getMotivoEgresoAnteriorMatricula() {
		return motivoEgresoAnteriorMatricula;
	}

	public void setMotivoEgresoAnteriorMatricula(String motivoEgresoAnteriorMatricula) {
		this.motivoEgresoAnteriorMatricula = motivoEgresoAnteriorMatricula;
	}

	public Colegio getColegioAnteriorMatricula() {
		return colegioAnteriorMatricula;
	}

	public void setColegioAnteriorMatricula(Colegio colegioAnteriorMatricula) {
		this.colegioAnteriorMatricula = colegioAnteriorMatricula;
	}

	public SolicitudMatricula getSolicitudMatAnteriorMatricula() {
		return solicitudMatAnteriorMatricula;
	}

	public void setSolicitudMatAnteriorMatricula(SolicitudMatricula solicitudMatAnteriorMatricula) {
		this.solicitudMatAnteriorMatricula = solicitudMatAnteriorMatricula;
	}
	
	
}
