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
@Table(name="tb_solimatri")
public class SolicitudMatricula 
{
	@Id
	@Column(name="sm_idsolmatr")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSolicitudMatricula;
	
	@Column(name="sm_fechsolic")
	@Temporal(TemporalType.DATE)
	private Date fecSolicitudMatricula;
	
	@Column(name="sm_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregisSolicitudMatricula;
	
	@Column(name="sm_fenaposma")
	@Temporal(TemporalType.DATE)
	private Date fecnacpostulanteSolicitudMatricula;
	
	@Column(name="sm_panaposma")
	private String paisnacimientopostulanteSolicitud;
	
	@Column(name="sm_denaposma")
	private String departamentoactualpostulanteSolicitud;
	
	@Column(name="sm_prnaposma")
	private String provinciaactualpostulanteSolicitud;
	
	@Column(name="sm_dinaposma")
	private String distritoactualpostulanteSolicitud;
	
	@Column(name="sm_alergia")
	private String alergiaspostulanteSolicitud;
	
	@Column(name="sm_probvisua")
	private String probvisualpostulanteSolicitud;
	
	@Column(name="sm_probaudit")
	private String probauditivpostulanteSolicitud;
	
	@Column(name="sm_saluinfan")
	private String saludinfanciapostulanteSolicitud;	
	
	@Column(name="sm_infoadici")
	private String infoadicionalpostulanteSolicitud;
	
	@ManyToOne
	@JoinColumn(name ="sm_idcolegio")
	private Colegio colegioSolicitudMatricula;
	
	@ManyToOne
	@JoinColumn(name ="sm_idapodera")
	private Apoderado apoderadoSolicitudMatricula;
	
	@ManyToOne
	@JoinColumn(name ="sm_gradpostu")
	private GradoEscolar gradoSolicitudMatricula;
	
	@ManyToOne
	@JoinColumn(name ="sm_iddistrit")
	private Distrito distritoSolicitudMatricula;
	
	@OneToMany(mappedBy = "solicitudMatAnteriorMatricula", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<AnteriorMatricula> listaAnteriorMatriculaSolicitudMatricula;

	public List<AnteriorMatricula> getListaAnteriorMatriculaSolicitudMatricula() {
		return listaAnteriorMatriculaSolicitudMatricula;
	}

	public void setListaAnteriorMatriculaSolicitudMatricula(
			List<AnteriorMatricula> listaAnteriorMatriculaSolicitudMatricula) {
		this.listaAnteriorMatriculaSolicitudMatricula = listaAnteriorMatriculaSolicitudMatricula;
	}

	public int getIdSolicitudMatricula() {
		return idSolicitudMatricula;
	}

	public void setIdSolicitudMatricula(int idSolicitudMatricula) {
		this.idSolicitudMatricula = idSolicitudMatricula;
	}

	public Date getFecSolicitudMatricula() {
		return fecSolicitudMatricula;
	}

	public void setFecSolicitudMatricula(Date fecSolicitudMatricula) {
		this.fecSolicitudMatricula = fecSolicitudMatricula;
	}

	public Date getFecregisSolicitudMatricula() {
		return fecregisSolicitudMatricula;
	}

	public void setFecregisSolicitudMatricula(Date fecregisSolicitudMatricula) {
		this.fecregisSolicitudMatricula = fecregisSolicitudMatricula;
	}

	public Date getFecnacpostulanteSolicitudMatricula() {
		return fecnacpostulanteSolicitudMatricula;
	}

	public void setFecnacpostulanteSolicitudMatricula(Date fecnacpostulanteSolicitudMatricula) {
		this.fecnacpostulanteSolicitudMatricula = fecnacpostulanteSolicitudMatricula;
	}

	public String getPaisnacimientopostulanteSolicitud() {
		return paisnacimientopostulanteSolicitud;
	}

	public void setPaisnacimientopostulanteSolicitud(String paisnacimientopostulanteSolicitud) {
		this.paisnacimientopostulanteSolicitud = paisnacimientopostulanteSolicitud;
	}

	public String getDepartamentoactualpostulanteSolicitud() {
		return departamentoactualpostulanteSolicitud;
	}

	public void setDepartamentoactualpostulanteSolicitud(String departamentoactualpostulanteSolicitud) {
		this.departamentoactualpostulanteSolicitud = departamentoactualpostulanteSolicitud;
	}

	public String getProvinciaactualpostulanteSolicitud() {
		return provinciaactualpostulanteSolicitud;
	}

	public void setProvinciaactualpostulanteSolicitud(String provinciaactualpostulanteSolicitud) {
		this.provinciaactualpostulanteSolicitud = provinciaactualpostulanteSolicitud;
	}

	public String getDistritoactualpostulanteSolicitud() {
		return distritoactualpostulanteSolicitud;
	}

	public void setDistritoactualpostulanteSolicitud(String distritoactualpostulanteSolicitud) {
		this.distritoactualpostulanteSolicitud = distritoactualpostulanteSolicitud;
	}

	public String getAlergiaspostulanteSolicitud() {
		return alergiaspostulanteSolicitud;
	}

	public void setAlergiaspostulanteSolicitud(String alergiaspostulanteSolicitud) {
		this.alergiaspostulanteSolicitud = alergiaspostulanteSolicitud;
	}

	public String getProbvisualpostulanteSolicitud() {
		return probvisualpostulanteSolicitud;
	}

	public void setProbvisualpostulanteSolicitud(String probvisualpostulanteSolicitud) {
		this.probvisualpostulanteSolicitud = probvisualpostulanteSolicitud;
	}

	public String getProbauditivpostulanteSolicitud() {
		return probauditivpostulanteSolicitud;
	}

	public void setProbauditivpostulanteSolicitud(String probauditivpostulanteSolicitud) {
		this.probauditivpostulanteSolicitud = probauditivpostulanteSolicitud;
	}

	public String getSaludinfanciapostulanteSolicitud() {
		return saludinfanciapostulanteSolicitud;
	}

	public void setSaludinfanciapostulanteSolicitud(String saludinfanciapostulanteSolicitud) {
		this.saludinfanciapostulanteSolicitud = saludinfanciapostulanteSolicitud;
	}

	public String getInfoadicionalpostulanteSolicitud() {
		return infoadicionalpostulanteSolicitud;
	}

	public void setInfoadicionalpostulanteSolicitud(String infoadicionalpostulanteSolicitud) {
		this.infoadicionalpostulanteSolicitud = infoadicionalpostulanteSolicitud;
	}

	public Colegio getColegioSolicitudMatricula() {
		return colegioSolicitudMatricula;
	}

	public void setColegioSolicitudMatricula(Colegio colegioSolicitudMatricula) {
		this.colegioSolicitudMatricula = colegioSolicitudMatricula;
	}

	public Apoderado getApoderadoSolicitudMatricula() {
		return apoderadoSolicitudMatricula;
	}

	public void setApoderadoSolicitudMatricula(Apoderado apoderadoSolicitudMatricula) {
		this.apoderadoSolicitudMatricula = apoderadoSolicitudMatricula;
	}

	public GradoEscolar getGradoSolicitudMatricula() {
		return gradoSolicitudMatricula;
	}

	public void setGradoSolicitudMatricula(GradoEscolar gradoSolicitudMatricula) {
		this.gradoSolicitudMatricula = gradoSolicitudMatricula;
	}

	public Distrito getDistritoSolicitudMatricula() {
		return distritoSolicitudMatricula;
	}

	public void setDistritoSolicitudMatricula(Distrito distritoSolicitudMatricula) {
		this.distritoSolicitudMatricula = distritoSolicitudMatricula;
	}
	
	
	
}
