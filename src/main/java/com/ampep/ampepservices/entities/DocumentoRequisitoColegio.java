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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_docreqcol")
public class DocumentoRequisitoColegio 
{
	@Id
	@Column(name="dr_iddocreqco")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDocumetoRequesitoColegio;
	
	@Column(name="dr_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregisDocumetoRequesitoColegio;
	
	@Column(name="dr_estadodoc")
	private int estadoDocumetoRequesitoColegio;
	
	@ManyToOne
	@JoinColumn(name ="dr_idcolegio")
	private Colegio colegioDocumetoRequesitoColegio;
	
	@ManyToOne
	@JoinColumn(name ="dr_iddocrequ")
	private DocumentoRequerido drDocumetoRequesitoColegio;

	public int getIdDocumetoRequesitoColegio() {
		return idDocumetoRequesitoColegio;
	}

	public void setIdDocumetoRequesitoColegio(int idDocumetoRequesitoColegio) {
		this.idDocumetoRequesitoColegio = idDocumetoRequesitoColegio;
	}

	public Date getFecregisDocumetoRequesitoColegio() {
		return fecregisDocumetoRequesitoColegio;
	}

	public void setFecregisDocumetoRequesitoColegio(Date fecregisDocumetoRequesitoColegio) {
		this.fecregisDocumetoRequesitoColegio = fecregisDocumetoRequesitoColegio;
	}

	public int getEstadoDocumetoRequesitoColegio() {
		return estadoDocumetoRequesitoColegio;
	}

	public void setEstadoDocumetoRequesitoColegio(int estadoDocumetoRequesitoColegio) {
		this.estadoDocumetoRequesitoColegio = estadoDocumetoRequesitoColegio;
	}

	public Colegio getColegioDocumetoRequesitoColegio() {
		return colegioDocumetoRequesitoColegio;
	}

	public void setColegioDocumetoRequesitoColegio(Colegio colegioDocumetoRequesitoColegio) {
		this.colegioDocumetoRequesitoColegio = colegioDocumetoRequesitoColegio;
	}

	public DocumentoRequerido getDrDocumetoRequesitoColegio() {
		return drDocumetoRequesitoColegio;
	}

	public void setDrDocumetoRequesitoColegio(DocumentoRequerido drDocumetoRequesitoColegio) {
		this.drDocumetoRequesitoColegio = drDocumetoRequesitoColegio;
	}
	
}
