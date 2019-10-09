package com.ampep.ampepservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_reprecole")
public class Representante 
{
	@Id
	@Column(name="rc_idrepcole")
	private int idRepresentante;
	
}
