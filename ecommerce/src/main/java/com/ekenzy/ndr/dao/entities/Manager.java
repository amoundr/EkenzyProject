package com.ekenzy.ndr.dao.entities;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Manager implements Serializable {
	
	@GenericGenerator(name = "generator", strategy = "foreign", 
			parameters = @Parameter(name = "property", value = "entrepriseManager"))
	@Id
	@GeneratedValue(generator = "generator")
	private Long idManager ;
	
	private String nameManager ;
	private boolean affnameManager ;
	
	private boolean sexeManager ;
	private boolean affsexeManager ;
	
	@ManyToOne
	@JoinColumn(name="idVilleNassance")
	private Ville villeNassanceManager ;
	private boolean affvilleNassanceManager ;
	
	@ManyToOne
	@JoinColumn(name="idVilleActuelle")
	private Ville villeActuelleManager ;
	private boolean affvilleActuelleManager ;
	
	private String emailManager ;
	private boolean affemailManager ;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateNaissance ;
	private boolean affdateNaissance ;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Entreprise entrepriseManager ;

	

	public Manager(String nameManager, boolean affnameManager,
			boolean sexeManager, boolean affsexeManager,
			boolean affvilleNassanceManager, boolean affvilleActuelleManager,
			String emailManager, boolean affemailManager, Date dateNaissance,
			boolean affdateNaissance) {
		super();
		this.nameManager = nameManager;
		this.affnameManager = affnameManager;
		this.sexeManager = sexeManager;
		this.affsexeManager = affsexeManager;
		this.affvilleNassanceManager = affvilleNassanceManager;
		this.affvilleActuelleManager = affvilleActuelleManager;
		this.emailManager = emailManager;
		this.affemailManager = affemailManager;
		this.dateNaissance = dateNaissance;
		this.affdateNaissance = affdateNaissance;
	}

	
	public boolean isAffnameManager() {
		return affnameManager;
	}

	public void setAffnameManager(boolean affnameManager) {
		this.affnameManager = affnameManager;
	}

	public boolean isAffsexeManager() {
		return affsexeManager;
	}

	public void setAffsexeManager(boolean affsexeManager) {
		this.affsexeManager = affsexeManager;
	}

	public boolean isAffvilleNassanceManager() {
		return affvilleNassanceManager;
	}

	public void setAffvilleNassanceManager(boolean affvilleNassanceManager) {
		this.affvilleNassanceManager = affvilleNassanceManager;
	}

	public boolean isAffvilleActuelleManager() {
		return affvilleActuelleManager;
	}

	public void setAffvilleActuelleManager(boolean affvilleActuelleManager) {
		this.affvilleActuelleManager = affvilleActuelleManager;
	}

	public boolean isAffemailManager() {
		return affemailManager;
	}

	public void setAffemailManager(boolean affemailManager) {
		this.affemailManager = affemailManager;
	}

	public boolean isAffdateNaissance() {
		return affdateNaissance;
	}

	public void setAffdateNaissance(boolean affdateNaissance) {
		this.affdateNaissance = affdateNaissance;
	}

	public Manager() {
		super();
	}

	public Long getIdManager() {
		return idManager;
	}

	public void setIdManager(Long idManager) {
		this.idManager = idManager;
	}

	public String getNameManager() {
		return nameManager;
	}

	public void setNameManager(String nameManager) {
		this.nameManager = nameManager;
	}

	public boolean isSexeManager() {
		return sexeManager;
	}

	public void setSexeManager(boolean sexeManager) {
		this.sexeManager = sexeManager;
	}

	public Ville getVilleNassanceManager() {
		return villeNassanceManager;
	}

	public void setVilleNassanceManager(Ville villeNassanceManager) {
		this.villeNassanceManager = villeNassanceManager;
	}

	public Ville getVilleActuelleManager() {
		return villeActuelleManager;
	}

	public void setVilleActuelleManager(Ville villeActuelleManager) {
		this.villeActuelleManager = villeActuelleManager;
	}

	public String getEmailManager() {
		return emailManager;
	}

	public void setEmailManager(String emailManager) {
		this.emailManager = emailManager;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Entreprise getEntrepriseManager() {
		return entrepriseManager;
	}

	public void setEntrepriseManager(Entreprise entrepriseManager) {
		this.entrepriseManager = entrepriseManager;
	}
	
	
	
	

}
