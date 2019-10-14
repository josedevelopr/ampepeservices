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
@Table(name="tb_docpresen")
public class DocumentosPresentado 
{
	@Id
	@Column(name="dp_iddocpres")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDocumentosPresentado;
	
	@Column(name="dp_detdocpre")
	private String detalleDocumentosPresentado;
	
	@Column(name="dp_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregDocumentosPresentado;
	
	@Column(name="dp_estado")
	private int estadoDocumentosPresentado;
	
	@ManyToOne
	@JoinColumn(name ="dp_idcolegio")
	private Colegio colegioDocumentosPresentado;
	
	@ManyToOne
	@JoinColumn(name ="dp_idsolmatr")
	private SolicitudMatricula solicitudmatDocumentosPresentado;
	
	@ManyToOne
	@JoinColumn(name = "dp_idapodera")
	private Apoderado apoderadoDocumentosPresentado;

	public int getIdDocumentosPresentado() {
		return idDocumentosPresentado;
	}

	public void setIdDocumentosPresentado(int idDocumentosPresentado) {
		this.idDocumentosPresentado = idDocumentosPresentado;
	}

	public String getDetalleDocumentosPresentado() {
		return detalleDocumentosPresentado;
	}

	public void setDetalleDocumentosPresentado(String detalleDocumentosPresentado) {
		this.detalleDocumentosPresentado = detalleDocumentosPresentado;
	}

	public Date getFecregDocumentosPresentado() {
		return fecregDocumentosPresentado;
	}

	public void setFecregDocumentosPresentado(Date fecregDocumentosPresentado) {
		this.fecregDocumentosPresentado = fecregDocumentosPresentado;
	}

	public int getEstadoDocumentosPresentado() {
		return estadoDocumentosPresentado;
	}

	public void setEstadoDocumentosPresentado(int estadoDocumentosPresentado) {
		this.estadoDocumentosPresentado = estadoDocumentosPresentado;
	}

	public Colegio getColegioDocumentosPresentado() {
		return colegioDocumentosPresentado;
	}

	public void setColegioDocumentosPresentado(Colegio colegioDocumentosPresentado) {
		this.colegioDocumentosPresentado = colegioDocumentosPresentado;
	}

	public SolicitudMatricula getSolicitudmatDocumentosPresentado() {
		return solicitudmatDocumentosPresentado;
	}

	public void setSolicitudmatDocumentosPresentado(SolicitudMatricula solicitudmatDocumentosPresentado) {
		this.solicitudmatDocumentosPresentado = solicitudmatDocumentosPresentado;
	}

	public Apoderado getApoderadoDocumentosPresentado() {
		return apoderadoDocumentosPresentado;
	}

	public void setApoderadoDocumentosPresentado(Apoderado apoderadoDocumentosPresentado) {
		this.apoderadoDocumentosPresentado = apoderadoDocumentosPresentado;
	}
}
