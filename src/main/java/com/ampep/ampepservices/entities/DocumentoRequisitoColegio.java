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
@Table(name="tb_apoderado")
public class DocumentoRequisitoColegio 
{
	@Id
	@Column(name="dr_idcolegio")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDocumetoRequesitoColegio;
	
	@ManyToOne
	@JoinColumn(name ="dr_fechregis")
	private Colegio colegioApoderado;
	
	@Column(name="dr_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregistroDocumentoRequesitoColegio;
}
