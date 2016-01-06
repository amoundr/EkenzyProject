package com.ekenzy.ndr.dao.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Zone implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idZone ;
	private String nomZone ;
	
	@ManyToOne
	@JoinColumn(name="idVille")
	private Ville ville ;
	
	@OneToMany(mappedBy="zone")
	private Collection<Entreprise> entreprises ;

	public Zone(String nomZone) {
		super();
		this.nomZone = nomZone;
	}

	public Long getIdZone() {
		return idZone;
	}

	public void setIdZone(Long idZone) {
		this.idZone = idZone;
	}

	public String getNomZone() {
		return nomZone;
	}

	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Zone() {
		super();
	}
	

	
}
