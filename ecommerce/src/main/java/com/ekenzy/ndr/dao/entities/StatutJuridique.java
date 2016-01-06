package com.ekenzy.ndr.dao.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class StatutJuridique implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idStatut ;
	
	private String titreStatut ;
	
	public StatutJuridique(String titreStatut) {
		super();
		this.titreStatut = titreStatut;
	}

	public StatutJuridique() {
		super();
	}

	public Long getIdStatut() {
		return idStatut;
	}

	public void setIdStatut(Long idStatut) {
		this.idStatut = idStatut;
	}

	public String getTitreStatut() {
		return titreStatut;
	}

	public void setTitreStatut(String titreStatut) {
		this.titreStatut = titreStatut;
	}
	
	
	

}
