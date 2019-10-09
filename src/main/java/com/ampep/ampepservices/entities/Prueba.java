package com.ampep.ampepservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_prueba")
public class Prueba 
{
	@Id
	@Column(name="pruebaid")
	@GeneratedValue(strategy  = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="nomprueba")	
	private String nombre;
	
	@Column(name="estadoprueba")	
	private int estado;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
