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
@Table(name="tb_reprecole")
public class Representante 
{
	@Id
	@Column(name="rc_idrepcole")
	private int idRepresentante;
	
	@Column(name="rc_dnirepres")
	private String dniRepresentante;
	
	@Column(name="rc_apepatern")
	private String apepatRepresentante;
	
	@Column(name="rc_apematern")
	private String apetRepresentante;
	
	@Column(name="rc_nombrerep")
	private String nombreRepresentante;
	
	@Column(name="rc_ruc")
	private String rucRepresentante;
	
	@Column(name="rc_nit")
	private String nitRepresentante;
	
	@Column(name="rc_domicilio")
	private String domicilioRepresentante;
	
	@Column(name="rc_telefono")
	private String telefRepresentante;
	
	@Column(name="rc_celular")
	private String celuRepresentante;
	
	@Column(name="rc_correo")
	private String correoRepresentante;
	
	@Column(name="rc_sexo")
	private String sexoRepresentante;
	
	@Column(name="rc_fechnacim")
	@Temporal(TemporalType.DATE)
	private Date fecnacRepresentante;
	
	@Column(name="rc_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregRepresentante;
	
	@ManyToOne
	@JoinColumn(name="rc_idcolegio")
	private Colegio colegioRepresentante;
	
	@ManyToOne
	@JoinColumn(name="rc_iddistrit")
	private Distrito distritoRepresentante;

	public int getIdRepresentante() {
		return idRepresentante;
	}

	public void setIdRepresentante(int idRepresentante) {
		this.idRepresentante = idRepresentante;
	}

	public String getDniRepresentante() {
		return dniRepresentante;
	}

	public void setDniRepresentante(String dniRepresentante) {
		this.dniRepresentante = dniRepresentante;
	}

	public String getApepatRepresentante() {
		return apepatRepresentante;
	}

	public void setApepatRepresentante(String apepatRepresentante) {
		this.apepatRepresentante = apepatRepresentante;
	}

	public String getApetRepresentante() {
		return apetRepresentante;
	}

	public void setApetRepresentante(String apetRepresentante) {
		this.apetRepresentante = apetRepresentante;
	}

	public String getNombreRepresentante() {
		return nombreRepresentante;
	}

	public void setNombreRepresentante(String nombreRepresentante) {
		this.nombreRepresentante = nombreRepresentante;
	}

	public String getRucRepresentante() {
		return rucRepresentante;
	}

	public void setRucRepresentante(String rucRepresentante) {
		this.rucRepresentante = rucRepresentante;
	}

	public String getNitRepresentante() {
		return nitRepresentante;
	}

	public void setNitRepresentante(String nitRepresentante) {
		this.nitRepresentante = nitRepresentante;
	}

	public String getDomicilioRepresentante() {
		return domicilioRepresentante;
	}

	public void setDomicilioRepresentante(String domicilioRepresentante) {
		this.domicilioRepresentante = domicilioRepresentante;
	}

	public String getTelefRepresentante() {
		return telefRepresentante;
	}

	public void setTelefRepresentante(String telefRepresentante) {
		this.telefRepresentante = telefRepresentante;
	}

	public String getCeluRepresentante() {
		return celuRepresentante;
	}

	public void setCeluRepresentante(String celuRepresentante) {
		this.celuRepresentante = celuRepresentante;
	}

	public String getCorreoRepresentante() {
		return correoRepresentante;
	}

	public void setCorreoRepresentante(String correoRepresentante) {
		this.correoRepresentante = correoRepresentante;
	}

	public String getSexoRepresentante() {
		return sexoRepresentante;
	}

	public void setSexoRepresentante(String sexoRepresentante) {
		this.sexoRepresentante = sexoRepresentante;
	}

	public Date getFecnacRepresentante() {
		return fecnacRepresentante;
	}

	public void setFecnacRepresentante(Date fecnacRepresentante) {
		this.fecnacRepresentante = fecnacRepresentante;
	}

	public Date getFecregRepresentante() {
		return fecregRepresentante;
	}

	public void setFecregRepresentante(Date fecregRepresentante) {
		this.fecregRepresentante = fecregRepresentante;
	}

	public Colegio getColegioRepresentante() {
		return colegioRepresentante;
	}

	public void setColegioRepresentante(Colegio colegioRepresentante) {
		this.colegioRepresentante = colegioRepresentante;
	}

	public Distrito getDistritoRepresentante() {
		return distritoRepresentante;
	}

	public void setDistritoRepresentante(Distrito distritoRepresentante) {
		this.distritoRepresentante = distritoRepresentante;
	}
	
	
}
