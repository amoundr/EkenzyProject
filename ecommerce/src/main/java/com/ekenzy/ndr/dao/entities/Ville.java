package com.ekenzy.ndr.dao.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ville {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVille ;
	private String nomVille ;
	
	@OneToMany(mappedBy="ville")
	private Collection<Entreprise> entreprises ;
	
	@OneToMany(mappedBy="ville")
	private Collection<Zone> zones ;

	
	

	public Collection<Zone> getZones() {
		return zones;
	}


	public void setZones(Collection<Zone> zones) {
		this.zones = zones;
	}


	public Ville(String nomVille) {
		super();
		this.nomVille = nomVille;
	}


	public Ville() {
		super();
	}


	public Long getIdVille() {
		return idVille;
	}


	public void setIdVille(Long idVille) {
		this.idVille = idVille;
	}


	public String getNomVille() {
		return nomVille;
	}


	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}


	public Collection<Entreprise> getEntreprises() {
		return entreprises;
	}


	public void setEntreprises(Collection<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}
	
}



/*

<s:authentication-provider>
<s:jdbc-user-service data-source-ref="datasource" users-by-username-query="select nom , password , actived from entreprise where nom" 

 authorities-by-username-query="select u.nom ,r.roleName from entreprise u , role r where u.id = r.entrprise_id  and nom =?" />
</s:authentication-provider>*/