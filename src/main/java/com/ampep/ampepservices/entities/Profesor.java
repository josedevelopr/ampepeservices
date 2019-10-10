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
@Table(name="tb_profesor")
public class Profesor {

	@Id
	@Column(name="pr_idprofeso")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int idProfeso;
	
	@Column(name="pr_apepatern")
	private String apePatern;
	
	@Column(name="pr_amepatern")
	private String apeMatern;
	
	@Column(name="pr_nombres")
	private String nombres;
	
	@Column(name="pr_fechnacim")
	@Temporal(TemporalType.DATE)
	private Date fechNacim;
	
	@Column(name="pr_estado")
	private String estado;
	
	@Column(name="pr_domicilio")
	private String domicilio;
	
	@Column(name="pr_telefono")
	private int telefono;
	
	@Column(name="pr_celular")
	private int celular;
	
	@Column(name="pr_correo")
	private int correo;
	
	@Column(name="pr_gradinstr")
	private String gradInstr;
	
	@Column(name="pr_diretraba")
	private String direTraba;
	
	@Column(name="pr_estacivil")
	private String estaCivil;
	
	@Column(name="pr_fotografi")
	private String fotografi;
	
	@Column(name="pr_nroregpro")
	private int nroRegpro;
	
	@ManyToOne
	@JoinColumn(name="pr_idcolegio")
	private Colegio idColegioProf;
	
	@ManyToOne
	@JoinColumn(name="pr_iddistrit")
	private Distrito idDistritProf;

	public int getIdProfeso() {
		return idProfeso;
	}

	public void setIdProfeso(int idProfeso) {
		this.idProfeso = idProfeso;
	}

	public String getApePatern() {
		return apePatern;
	}

	public void setApePatern(String apePatern) {
		this.apePatern = apePatern;
	}

	public String getApeMatern() {
		return apeMatern;
	}

	public void setApeMatern(String apeMatern) {
		this.apeMatern = apeMatern;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Date getFechNacim() {
		return fechNacim;
	}

	public void setFechNacim(Date fechNacim) {
		this.fechNacim = fechNacim;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getCorreo() {
		return correo;
	}

	public void setCorreo(int correo) {
		this.correo = correo;
	}

	public String getGradInstr() {
		return gradInstr;
	}

	public void setGradInstr(String gradInstr) {
		this.gradInstr = gradInstr;
	}

	public String getDireTraba() {
		return direTraba;
	}

	public void setDireTraba(String direTraba) {
		this.direTraba = direTraba;
	}

	public String getEstaCivil() {
		return estaCivil;
	}

	public void setEstaCivil(String estaCivil) {
		this.estaCivil = estaCivil;
	}

	public String getFotografi() {
		return fotografi;
	}

	public void setFotografi(String fotografi) {
		this.fotografi = fotografi;
	}

	public int getNroRegpro() {
		return nroRegpro;
	}

	public void setNroRegpro(int nroRegpro) {
		this.nroRegpro = nroRegpro;
	}

	public Colegio getIdColegioProf() {
		return idColegioProf;
	}

	public void setIdColegioProf(Colegio idColegioProf) {
		this.idColegioProf = idColegioProf;
	}

	public Distrito getIdDistritProf() {
		return idDistritProf;
	}

	public void setIdDistritProf(Distrito idDistritProf) {
		this.idDistritProf = idDistritProf;
	}
}
