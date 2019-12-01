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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_usuasiste")
public class UsuarioSistema {

	@Id
	@Column(name="us_idususist")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsusist;
	
	@Column(name="us_fechcreac")
	@Temporal(TemporalType.DATE)
	private Date fechCreac;
	
	@Column(name="us_usuario")
	private String usuario;
	
	@Column(name="ut_feciniacc")
	@Temporal(TemporalType.DATE)
	private Date fecIniciacc;
	
	@Column(name="ut_horiniacc")
	@Temporal(TemporalType.DATE)
	private Date horIniciacc;
	
	@Column(name="ut_fecfinacc")
	@Temporal(TemporalType.DATE)
	private Date fecFinacc;
	
	@Column(name="ut_horfinacc")
	@Temporal(TemporalType.DATE)
	private Date horFinacc;
	
	@Column(name="us_contrasen")
	private String contrasen;
	
	@Column(name="us_estado")
	private String estado;
	
	@Column(name="us_idpersona")
	private int idPersona;
	
	@ManyToOne
	@JoinColumn(name="us_idtipousu")
	private TipoUsuario idTipoUsuSist;
	
	@OneToMany(mappedBy = "usuariosisAnuncio", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Anuncio> listaAnunciosUsuarioSistemas;


	public List<Anuncio> getListaAnunciosUsuarioSistemas() {
		return listaAnunciosUsuarioSistemas;
	}

	public void setListaAnunciosUsuarioSistemas(List<Anuncio> listaAnunciosUsuarioSistemas) {
		this.listaAnunciosUsuarioSistemas = listaAnunciosUsuarioSistemas;
	}

	public int getIdUsusist() {
		return idUsusist;
	}

	public void setIdUsusist(int idUsusist) {
		this.idUsusist = idUsusist;
	}

	public Date getFechCreac() {
		return fechCreac;
	}

	public void setFechCreac(Date fechCreac) {
		this.fechCreac = fechCreac;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getFecIniciacc() {
		return fecIniciacc;
	}

	public void setFecIniciacc(Date fecIniciacc) {
		this.fecIniciacc = fecIniciacc;
	}

	public Date getHorIniciacc() {
		return horIniciacc;
	}

	public void setHorIniciacc(Date horIniciacc) {
		this.horIniciacc = horIniciacc;
	}

	public Date getFecFinacc() {
		return fecFinacc;
	}

	public void setFecFinacc(Date fecFinacc) {
		this.fecFinacc = fecFinacc;
	}

	public Date getHorFinacc() {
		return horFinacc;
	}

	public void setHorFinacc(Date horFinacc) {
		this.horFinacc = horFinacc;
	}

	public String getContrasen() {
		return contrasen;
	}

	public void setContrasen(String contrasen) {
		this.contrasen = contrasen;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public TipoUsuario getIdTipoUsuSist() {
		return idTipoUsuSist;
	}

	public void setIdTipoUsuSist(TipoUsuario idTipoUsuSist) {
		this.idTipoUsuSist = idTipoUsuSist;
	}
}
