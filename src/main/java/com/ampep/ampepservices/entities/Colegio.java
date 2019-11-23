package com.ampep.ampepservices.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_colegio")
@NamedStoredProcedureQueries(value={
	@NamedStoredProcedureQuery(name="usp_validar_colegio",procedureName="usp_validar_registro",parameters={
			@StoredProcedureParameter(mode=ParameterMode.IN, name="it_codmodular",type = String.class),
			@StoredProcedureParameter(mode=ParameterMode.OUT,name="existe_registro",type = Integer.class)
	})	
})
public class Colegio 
{
	public List<Alumno> getListaAlumnoColegio() {
		return listaAlumnoColegio;
	}

	public void setListaAlumnoColegio(List<Alumno> listaAlumnoColegio) {
		this.listaAlumnoColegio = listaAlumnoColegio;
	}

	@Id
	@Column(name="co_idcolegio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@OneToMany(mappedBy = "colegioApoderado", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Apoderado> listaApoderadoColegio;
	
	@OneToMany(mappedBy = "colegioRepresentante", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Representante> listaRepresentanteColegio;
	
	@OneToMany(mappedBy = "colegioAnioEscolar", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<AnioEscolar> listaAnioEscolarColegio;
	
	@OneToMany(mappedBy = "colegioGradoEscolar", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<GradoEscolar> listaGradoEscolarColegio;
	
	@OneToMany(mappedBy = "colegioAlumno", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Alumno> listaAlumnoColegio;
	
	@OneToMany(mappedBy = "colegioSeccion", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<SeccionEscolar> listaSeccionEscolarColegio;

	@OneToMany(mappedBy = "colegioMatricula", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Matricula> listaMatriculaColegio;
	
	@OneToMany(mappedBy = "colegioDocumetoRequesitoColegio", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<DocumentoRequisitoColegio> listaDocumentoRequisitoColegiodeColegio;
	
	@OneToMany(mappedBy = "colegioAnteriorMatricula", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<AnteriorMatricula> listaAnteriorMatriculaColegio;
	
	public List<Matricula> getListaMatriculaColegio() {
		return listaMatriculaColegio;
	}

	public void setListaMatriculaColegio(List<Matricula> listaMatriculaColegio) {
		this.listaMatriculaColegio = listaMatriculaColegio;
	}
	
	public List<SeccionEscolar> getListaSeccionEscolarColegio() {
		return listaSeccionEscolarColegio;
	}

	public void setListaSeccionEscolarColegio(List<SeccionEscolar> listaSeccionEscolarColegio) {
		this.listaSeccionEscolarColegio = listaSeccionEscolarColegio;
	}

	public List<Representante> getListaRepresentanteColegio() {
		return listaRepresentanteColegio;
	}

	public void setListaRepresentanteColegio(List<Representante> listaRepresentanteColegio) {
		this.listaRepresentanteColegio = listaRepresentanteColegio;
	}

	public List<AnioEscolar> getListaAnioEscolarColegio() {
		return listaAnioEscolarColegio;
	}

	public void setListaAnioEscolarColegio(List<AnioEscolar> listaAnioEscolarColegio) {
		this.listaAnioEscolarColegio = listaAnioEscolarColegio;
	}

	public List<GradoEscolar> getListaGradoEscolarColegio() {
		return listaGradoEscolarColegio;
	}

	public void setListaGradoEscolarColegio(List<GradoEscolar> listaGradoEscolarColegio) {
		this.listaGradoEscolarColegio = listaGradoEscolarColegio;
	}

	public List<Apoderado> getListaApoderadoColegio() {
		return listaApoderadoColegio;
	}

	public void setListaApoderadoColegio(List<Apoderado> listaApoderadoColegio) {
		this.listaApoderadoColegio = listaApoderadoColegio;
	}

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
