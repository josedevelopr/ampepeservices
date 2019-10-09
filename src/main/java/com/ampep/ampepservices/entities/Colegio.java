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
@Table(name="tb_colegio")

public class Colegio 
{
	@Id
	@Column(name="co_idcolegio")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int idColegio;
	
	@Column(name="co_idmodular")	
	private String idModularColegio;
	
	@Column(name="co_idlocal")	
	private String idLocalColegio;
	
	@Column(name="co_nomcpmine")	
	private String nombrecpMineduColegio;
	
	@Column(name="co_idcpmined")	
	private String idcpMineduColegio;
	
	@Column(name="co_nombre")	
	private String nomColegio;
	
	@Column(name="co_turno")	
	private String turnoColegio;
	
	@Column(name="co_tipo")	
	private String tipoColegio;
	
	@Column(name="co_telefono")	
	private String telfColegio;
	
	@Column(name="co_director")	
	private String directorColegio;
	
	@Column(name="co_gestdepen")	
	private String gestionDepenColegio;
	
	@Column(name="co_fechregis")	
	@Temporal(TemporalType.DATE)
	private Date fecRegistroColegio;
	
	@Column(name="co_fundador")	
	private String fundadorColegio;
	
	@Column(name="co_direccion")	
	private String direccionColegio;
	
	@Column(name="co_linkfb")	
	private String linkFacebookColegio;
	
	@Column(name="co_linkimg")	
	private String linkImagenColegio;	
	
	@ManyToOne
	@JoinColumn(name="co_iddistrit")
	private Distrito distritoColegio;
	
	@ManyToOne
	@JoinColumn(name="co_idugel")
	private Ugel idUgelColegio;	
	
	public Ugel getIdUgelColegio() {
		return idUgelColegio;
	}

	public void setIdUgelColegio(Ugel idUgelColegio) {
		this.idUgelColegio = idUgelColegio;
	}

	public int getIdColegio() {
		return idColegio;
	}

	public void setIdColegio(int idColegio) {
		this.idColegio = idColegio;
	}

	public String getIdModularColegio() {
		return idModularColegio;
	}

	public void setIdModularColegio(String idModularColegio) {
		this.idModularColegio = idModularColegio;
	}

	public String getIdLocalColegio() {
		return idLocalColegio;
	}

	public void setIdLocalColegio(String idLocalColegio) {
		this.idLocalColegio = idLocalColegio;
	}

	public String getNombrecpMineduColegio() {
		return nombrecpMineduColegio;
	}

	public void setNombrecpMineduColegio(String nombrecpMineduColegio) {
		this.nombrecpMineduColegio = nombrecpMineduColegio;
	}

	public String getIdcpMineduColegio() {
		return idcpMineduColegio;
	}

	public void setIdcpMineduColegio(String idcpMineduColegio) {
		this.idcpMineduColegio = idcpMineduColegio;
	}

	public String getNomColegio() {
		return nomColegio;
	}

	public void setNomColegio(String nomColegio) {
		this.nomColegio = nomColegio;
	}

	public String getTurnoColegio() {
		return turnoColegio;
	}

	public void setTurnoColegio(String turnoColegio) {
		this.turnoColegio = turnoColegio;
	}

	public String getTipoColegio() {
		return tipoColegio;
	}

	public void setTipoColegio(String tipoColegio) {
		this.tipoColegio = tipoColegio;
	}

	public String getTelfColegio() {
		return telfColegio;
	}

	public void setTelfColegio(String telfColegio) {
		this.telfColegio = telfColegio;
	}

	public String getDirectorColegio() {
		return directorColegio;
	}

	public void setDirectorColegio(String directorColegio) {
		this.directorColegio = directorColegio;
	}

	public String getGestionDepenColegio() {
		return gestionDepenColegio;
	}

	public void setGestionDepenColegio(String gestionDepenColegio) {
		this.gestionDepenColegio = gestionDepenColegio;
	}

	public Date getFecRegistroColegio() {
		return fecRegistroColegio;
	}

	public void setFecRegistroColegio(Date fecRegistroColegio) {
		this.fecRegistroColegio = fecRegistroColegio;
	}

	public String getFundadorColegio() {
		return fundadorColegio;
	}

	public void setFundadorColegio(String fundadorColegio) {
		this.fundadorColegio = fundadorColegio;
	}

	public String getDireccionColegio() {
		return direccionColegio;
	}

	public void setDireccionColegio(String direccionColegio) {
		this.direccionColegio = direccionColegio;
	}

	public String getLinkFacebookColegio() {
		return linkFacebookColegio;
	}

	public void setLinkFacebookColegio(String linkFacebookColegio) {
		this.linkFacebookColegio = linkFacebookColegio;
	}

	public String getLinkImagenColegio() {
		return linkImagenColegio;
	}

	public void setLinkImagenColegio(String linkImagenColegio) {
		this.linkImagenColegio = linkImagenColegio;
	}

	public Distrito getDistritoColegio() {
		return distritoColegio;
	}

	public void setDistritoColegio(Distrito distritoColegio) {
		this.distritoColegio = distritoColegio;
	}
}