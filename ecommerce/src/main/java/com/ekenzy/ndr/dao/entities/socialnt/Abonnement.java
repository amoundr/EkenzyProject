package com.ekenzy.ndr.dao.entities.socialnt;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ekenzy.ndr.dao.entities.Entreprise;

@Entity
public class Abonnement implements Serializable {
	
	
	@EmbeddedId
	private AbonnementKey idAbonnement ;
	
	private Date dateAbonnement ;
	
	@ManyToOne
	@JoinColumn(name="idAbonnee" , insertable = false, updatable = false)
	private Entreprise abonnee ;
	
	@ManyToOne
	@JoinColumn(name="idAbonne" , insertable = false, updatable = false)
	private Entreprise abonne ;

	public Abonnement(Date dateAbonnement, Entreprise abonnee, Entreprise abonne) {
		super();
		this.dateAbonnement = dateAbonnement;
		this.abonnee = abonnee;
		this.abonne = abonne;
	}

	public Abonnement() {
		super();
	}

	public AbonnementKey getIdAbonnement() {
		return idAbonnement;
	}

	public void setIdAbonnement(AbonnementKey idAbonnement) {
		this.idAbonnement = idAbonnement;
	}

	public Date getDateAbonnement() {
		return dateAbonnement;
	}

	public void setDateAbonnement(Date dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}

	public Entreprise getAbonnee() {
		return abonnee;
	}

	public void setAbonnee(Entreprise abonnee) {
		this.abonnee = abonnee;
	}

	public Entreprise getAbonne() {
		return abonne;
	}

	public void setAbonne(Entreprise abonne) {
		this.abonne = abonne;
	}
	
	

}
