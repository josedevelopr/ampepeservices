package com.ampep.ampepservices.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_tipousuar")
public class TipoUsuario {

	@Id
	@Column(name="tu_idtipousu")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipousu;
	
	@Column(name="tu_fechcreac")
	@Temporal(TemporalType.DATE)
	private Date fechCreac;
	
	@Column(name="tu_descripci")
	private String descripci;
	
	@Column(name="tu_estado")
	private String estado;
	
	@OneToMany(mappedBy = "idTipoUsuSist", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<UsuarioSistema> listaTipoUsuSist;

	public List<UsuarioSistema> getListaTipoUsuSist() {
		return listaTipoUsuSist;
	}

	public void setListaTipoUsuSist(List<UsuarioSistema> listaTipoUsuSist) {
		this.listaTipoUsuSist = listaTipoUsuSist;
	}

	public int getIdTipousu() {
		return idTipousu;
	}

	public void setIdTipousu(int idTipousu) {
		this.idTipousu = idTipousu;
	}

	public Date getFechCreac() {
		return fechCreac;
	}

	public void setFechCreac(Date fechCreac) {
		this.fechCreac = fechCreac;
	}

	public String getDescripci() {
		return descripci;
	}

	public void setDescripci(String descripci) {
		this.descripci = descripci;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
