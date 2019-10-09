package com.ampep.ampepservices.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_apoderado")
public class Apoderado 
{
	@Id
	@Column(name="ap_idapodera")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idApoderado;
	
	@Column(name="ap_idcolegio")
	private int idColegioApoderado;
	
	@Column(name="ap_iddistrit")
	private int idDisritoApoderado;
	
	@Column(name="ap_dniapoder")
	private String dniApoderado;
	
	@Column(name="ap_tipoapode")
	private String tipApoderado;
	
	@Column(name="ap_apepatern")
	private String apepApoderado;
	
	@Column(name="ap_apematern")
	private String apemApoderado;
	
	@Column(name="ap_nombres")
	private String nomApoderado;
	
	@Column(name="ap_fechnacim")
	@Temporal(TemporalType.DATE)
	private Date fecnacApoderado;
	
	@Column(name="ap_estado")
	private String estadoApoderado;
	
	@Column(name="ap_domicilio")
	private String domiciApoderado;
	
	@Column(name="ap_telefono")
	private String telfApoderado;	
	
	@Column(name="ap_celular")
	private String celuApoderado;
	
	@Column(name="ap_correo")
	private String correoApoderado;
	
	@Column(name="ap_gradinstr")
	private String gradoinsApoderado;
	
	@Column(name="ap_profesion")
	private String profeApoderado;
	
	@Column(name="ap_ocupacion")
	private String ocupacApoderado;
	
	@Column(name="ap_centrtrab")
	private String centrotrabApoderado;
	
	@Column(name="ap_directrab")
	private String direcciApoderado;
	
	@Column(name="ap_estacivil")
	private String estcivApoderado;
	
	@Column(name="ap_fotografa")
	private String fotoApoderado;
	
	@Column(name="ap_fechregis")
	private String fecregistroApoderado;

	public int getIdApoderado() {
		return idApoderado;
	}

	public void setIdApoderado(int idApoderado) {
		this.idApoderado = idApoderado;
	}

	public int getIdColegioApoderado() {
		return idColegioApoderado;
	}

	public void setIdColegioApoderado(int idColegioApoderado) {
		this.idColegioApoderado = idColegioApoderado;
	}

	public int getIdDisritoApoderado() {
		return idDisritoApoderado;
	}

	public void setIdDisritoApoderado(int idDisritoApoderado) {
		this.idDisritoApoderado = idDisritoApoderado;
	}

	public String getDniApoderado() {
		return dniApoderado;
	}

	public void setDniApoderado(String dniApoderado) {
		this.dniApoderado = dniApoderado;
	}

	public String getTipApoderado() {
		return tipApoderado;
	}

	public void setTipApoderado(String tipApoderado) {
		this.tipApoderado = tipApoderado;
	}

	public String getApepApoderado() {
		return apepApoderado;
	}

	public void setApepApoderado(String apepApoderado) {
		this.apepApoderado = apepApoderado;
	}

	public String getApemApoderado() {
		return apemApoderado;
	}

	public void setApemApoderado(String apemApoderado) {
		this.apemApoderado = apemApoderado;
	}

	public String getNomApoderado() {
		return nomApoderado;
	}

	public void setNomApoderado(String nomApoderado) {
		this.nomApoderado = nomApoderado;
	}

	public Date getFecnacApoderado() {
		return fecnacApoderado;
	}

	public void setFecnacApoderado(Date fecnacApoderado) {
		this.fecnacApoderado = fecnacApoderado;
	}

	public String getEstadoApoderado() {
		return estadoApoderado;
	}

	public void setEstadoApoderado(String estadoApoderado) {
		this.estadoApoderado = estadoApoderado;
	}

	public String getDomiciApoderado() {
		return domiciApoderado;
	}

	public void setDomiciApoderado(String domiciApoderado) {
		this.domiciApoderado = domiciApoderado;
	}

	public String getTelfApoderado() {
		return telfApoderado;
	}

	public void setTelfApoderado(String telfApoderado) {
		this.telfApoderado = telfApoderado;
	}

	public String getCeluApoderado() {
		return celuApoderado;
	}

	public void setCeluApoderado(String celuApoderado) {
		this.celuApoderado = celuApoderado;
	}

	public String getCorreoApoderado() {
		return correoApoderado;
	}

	public void setCorreoApoderado(String correoApoderado) {
		this.correoApoderado = correoApoderado;
	}

	public String getGradoinsApoderado() {
		return gradoinsApoderado;
	}

	public void setGradoinsApoderado(String gradoinsApoderado) {
		this.gradoinsApoderado = gradoinsApoderado;
	}

	public String getProfeApoderado() {
		return profeApoderado;
	}

	public void setProfeApoderado(String profeApoderado) {
		this.profeApoderado = profeApoderado;
	}

	public String getOcupacApoderado() {
		return ocupacApoderado;
	}

	public void setOcupacApoderado(String ocupacApoderado) {
		this.ocupacApoderado = ocupacApoderado;
	}

	public String getCentrotrabApoderado() {
		return centrotrabApoderado;
	}

	public void setCentrotrabApoderado(String centrotrabApoderado) {
		this.centrotrabApoderado = centrotrabApoderado;
	}

	public String getDirecciApoderado() {
		return direcciApoderado;
	}

	public void setDirecciApoderado(String direcciApoderado) {
		this.direcciApoderado = direcciApoderado;
	}

	public String getEstcivApoderado() {
		return estcivApoderado;
	}

	public void setEstcivApoderado(String estcivApoderado) {
		this.estcivApoderado = estcivApoderado;
	}

	public String getFotoApoderado() {
		return fotoApoderado;
	}

	public void setFotoApoderado(String fotoApoderado) {
		this.fotoApoderado = fotoApoderado;
	}

	public String getFecregistroApoderado() {
		return fecregistroApoderado;
	}

	public void setFecregistroApoderado(String fecregistroApoderado) {
		this.fecregistroApoderado = fecregistroApoderado;
	}
	
	
}
