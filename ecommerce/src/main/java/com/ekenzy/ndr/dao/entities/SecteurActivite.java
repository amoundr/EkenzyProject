package com.ekenzy.ndr.dao.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SecteurActivite {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSecteur ;
	private String nomSecteur ;
	
	@OneToMany(mappedBy="secteur")
	private Collection<Entreprise> entreprises ;

	public SecteurActivite(String nomSecteur) {
		super();
		this.nomSecteur = nomSecteur;
	}

	public SecteurActivite() {
		super();
	}

	public Long getIdSecteur() {
		return idSecteur;
	}

	public void setIdSecteur(Long idSecteur) {
		this.idSecteur = idSecteur;
	}

	public String getNomSecteur() {
		return nomSecteur;
	}

	public void setNomSecteur(String nomSecteur) {
		this.nomSecteur = nomSecteur;
	}

	public Collection<Entreprise> getEntreprises() {
		return entreprises;
	}

	public void setEntreprises(Collection<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}
	
	
	

}
