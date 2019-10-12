package com.ampep.ampepservices.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_menu")
public class Menu {

	@Id
	@Column(name="me_idmenu")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int idMenu;
	
	@Column(name="me_fechcreac")
	@Temporal(TemporalType.DATE)
	private Date fechCreac;
	
	@Column(name="me_descripci")
	private String descripci;
	
	@Column(name="me_estado")
	private String estado;
	
	@Column(name="me_menuasoci")
	private String menuAsoci;
	
	@Column(name="me_link")
	private String link;

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
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

	public String getMenuAsoci() {
		return menuAsoci;
	}

	public void setMenuAsoci(String menuAsoci) {
		this.menuAsoci = menuAsoci;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}	
}
