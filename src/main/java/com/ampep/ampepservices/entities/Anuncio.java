package com.ampep.ampepservices.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_anuncios")
public class Anuncio {
	@Id
	@Column(name="an_idanuncio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAnuncio;
	
	@Column(name="an_titulo")
	private String titAnuncio;
	
	@Column(name="an_descrip")
	private String descAnuncio;
	
	@Column(name="an_fechregis")
	private Date fecRegAnuncio;
	
	@Column(name="an_horiniacc")
	private Date fecinAnuncio;
	
	@Column(name="an_fecfinacc")
	private Date fecfinAnuncio;
	
	@Column(name="an_estado")
	private String estadoAnuncio;
	
	@ManyToOne
	@JoinColumn(name ="an_idcolegio")
	private Colegio colegioAnuncio;
	
	@ManyToOne
	@JoinColumn(name ="an_idgrado")
	private GradoEscolar gradoAnuncio;

	@ManyToOne
	@JoinColumn(name ="an_idususist")
	private UsuarioSistema usuariosisAnuncio;
	
	public int getIdAnuncio() {
		return idAnuncio;
	}

	public void setIdAnuncio(int idAnuncio) {
		this.idAnuncio = idAnuncio;
	}

	public String getTitAnuncio() {
		return titAnuncio;
	}

	public void setTitAnuncio(String titAnuncio) {
		this.titAnuncio = titAnuncio;
	}

	public String getDescAnuncio() {
		return descAnuncio;
	}

	public void setDescAnuncio(String descAnuncio) {
		this.descAnuncio = descAnuncio;
	}

	public Date getFecRegAnuncio() {
		return fecRegAnuncio;
	}

	public void setFecRegAnuncio(Date fecRegAnuncio) {
		this.fecRegAnuncio = fecRegAnuncio;
	}

	public Date getFecinAnuncio() {
		return fecinAnuncio;
	}

	public void setFecinAnuncio(Date fecinAnuncio) {
		this.fecinAnuncio = fecinAnuncio;
	}

	public Date getFecfinAnuncio() {
		return fecfinAnuncio;
	}

	public void setFecfinAnuncio(Date fecfinAnuncio) {
		this.fecfinAnuncio = fecfinAnuncio;
	}

	public String getEstadoAnuncio() {
		return estadoAnuncio;
	}

	public void setEstadoAnuncio(String estadoAnuncio) {
		this.estadoAnuncio = estadoAnuncio;
	}

	public Colegio getColegioAnuncio() {
		return colegioAnuncio;
	}

	public void setColegioAnuncio(Colegio colegioAnuncio) {
		this.colegioAnuncio = colegioAnuncio;
	}

	public GradoEscolar getGradoAnuncio() {
		return gradoAnuncio;
	}

	public void setGradoAnuncio(GradoEscolar gradoAnuncio) {
		this.gradoAnuncio = gradoAnuncio;
	}

	public UsuarioSistema getUsuariosisAnuncio() {
		return usuariosisAnuncio;
	}

	public void setUsuariosisAnuncio(UsuarioSistema usuariosisAnuncio) {
		this.usuariosisAnuncio = usuariosisAnuncio;
	}
	
	
}
