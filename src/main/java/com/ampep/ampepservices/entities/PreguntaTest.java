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
@Table(name="tb_pretespsi")
public class PreguntaTest 
{
	@Id
	@Column(name="pt_idpregunt")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPreguntaTest;
	
	@Column(name="pt_descripci")
	private String descripcionPreguntaTest;
	
	@Column(name="pt_estado")
	private int estadoPreguntaTest;
	
	@Column(name="pt_fechregis")
	@Temporal(TemporalType.DATE)
	private Date fecregPreguntaTest;

	public int getIdPreguntaTest() {
		return idPreguntaTest;
	}

	public void setIdPreguntaTest(int idPreguntaTest) {
		this.idPreguntaTest = idPreguntaTest;
	}

	public String getDescripcionPreguntaTest() {
		return descripcionPreguntaTest;
	}

	public void setDescripcionPreguntaTest(String descripcionPreguntaTest) {
		this.descripcionPreguntaTest = descripcionPreguntaTest;
	}

	public int getEstadoPreguntaTest() {
		return estadoPreguntaTest;
	}

	public void setEstadoPreguntaTest(int estadoPreguntaTest) {
		this.estadoPreguntaTest = estadoPreguntaTest;
	}

	public Date getFecregPreguntaTest() {
		return fecregPreguntaTest;
	}

	public void setFecregPreguntaTest(Date fecregPreguntaTest) {
		this.fecregPreguntaTest = fecregPreguntaTest;
	}
	
}
