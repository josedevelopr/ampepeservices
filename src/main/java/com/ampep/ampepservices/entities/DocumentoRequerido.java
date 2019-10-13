package com.ampep.ampepservices.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_docsrequ")
public class DocumentoRequerido 
{
	@Id
	@Column(name="dr_iddocrequ")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDocumentoRequerido;	
	
	@Column(name="dr_descripci")
	private String descripcionDocRequerido;
	
	@Column(name="dr_formato")
	private String formatoDocRequerido;
	
	@Column(name="dr_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregistroDocRequerido;
	
	@Column(name="dr_estadodoc")
	private int estadoDocRequerido;

	public int getIdDocumentoRequisito() {
		return idDocumentoRequerido;
	}

	public void setIdDocumentoRequisito(int idDocumentoRequisito) {
		this.idDocumentoRequerido = idDocumentoRequisito;
	}

	public String getDescripcionDocRequerido() {
		return descripcionDocRequerido;
	}

	public void setDescripcionDocRequerido(String descripcionDocRequerido) {
		this.descripcionDocRequerido = descripcionDocRequerido;
	}

	public String getFormatoDocRequerido() {
		return formatoDocRequerido;
	}

	public void setFormatoDocRequerido(String formatoDocRequerido) {
		this.formatoDocRequerido = formatoDocRequerido;
	}

	public Date getFecregistroDocRequerido() {
		return fecregistroDocRequerido;
	}

	public void setFecregistroDocRequerido(Date fecregistroDocRequerido) {
		this.fecregistroDocRequerido = fecregistroDocRequerido;
	}

	public int getEstadoDocRequerido() {
		return estadoDocRequerido;
	}

	public void setEstadoDocRequerido(int estadoDocRequerido) {
		this.estadoDocRequerido = estadoDocRequerido;
	}

}
