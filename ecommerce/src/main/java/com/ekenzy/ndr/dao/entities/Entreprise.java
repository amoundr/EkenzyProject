package com.ekenzy.ndr.dao.entities;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.ekenzy.ndr.dao.entities.ecommerce.Produit;

@Entity
public class Entreprise implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id  ;
	private String nom ;
	private String description ;
	private String email ;
	private String password ;
	private boolean actived ;
	
	@Lob
	private byte[] coverImage ;
	
	@Lob
	private byte[]  profileImage ;
	
	private double note ;
	
	/******** Info sur l'entreprise **********/
	
	@ManyToOne
	@JoinColumn(name="idStatut")
	private StatutJuridique statut ;
	private boolean affStatut ;
	
	
	private Long capitalSocial ;
	private boolean affCaptitalSocial ;
	
	private String numTelephone ;
	private boolean affNumTelephone ;
	
	private String adresse ;
	private boolean affAdresse ;
	
	private String activiteEnDetail ;
	private boolean affActiviteEnDetail ;
	
	private int anneeCreation ;
	private boolean affAnneeCreation ;
	

	/******** Info sur l'entreprise **********/
	
	/******** Manager de  l'entreprise **********/
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Manager manager ;
	
	/******** Manager de  l'entreprise **********/
	
	
	@ManyToOne
	@JoinColumn(name="idRole")
	private Role role ;
	
	// ville
	@ManyToOne
	@JoinColumn(name="idVille")
	private Ville ville ;
	
	// Zone
	@ManyToOne
	@JoinColumn(name="idZone")
	private Zone zone ;
	
	// le secteur d'activite	
	@ManyToOne
	@JoinColumn(name="idSecteur")
	private SecteurActivite secteur ;
	
	
	
	
	
	public byte[] getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}


	public byte[] getCoverImage() {
		return coverImage;
	}


	public void setCoverImage(byte[] coverImage) {
		this.coverImage = coverImage;
	}


	public Zone getZone() {
		return zone;
	}


	public void setZone(Zone zone) {
		this.zone = zone;
	}


	public Manager getManager() {
		return manager;
	}


	public void setManager(Manager manager) {
		this.manager = manager;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActived() {
		return actived;
	}


	public void setActived(boolean actived) {
		this.actived = actived;
	}


	

	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public boolean isAffStatut() {
		return affStatut;
	}


	public void setAffStatut(boolean affStatut) {
		this.affStatut = affStatut;
	}


	public Ville getVille() {
		return ville;
	}


	public void setVille(Ville ville) {
		this.ville = ville;
	}


	public SecteurActivite getSecteur() {
		return secteur;
	}


	public void setSecteur(SecteurActivite secteur) {
		this.secteur = secteur;
	}
	
	
	public Entreprise(String nom, String description, String email, String password,
			boolean actived) {
		this.nom = nom;
		this.description = description;
		this.email = email;
		this.password = password;
		this.actived = actived;
	}


	public Entreprise() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	
	
	
	/******** Info sur l'entreprise **********/
	
	
	public Long getCapitalSocial() {
		return capitalSocial;
	}


	public void setCapitalSocial(Long capitalSocial) {
		this.capitalSocial = capitalSocial;
	}


	public boolean isAffCaptitalSocial() {
		return affCaptitalSocial;
	}


	public void setAffCaptitalSocial(boolean affCaptitalSocial) {
		this.affCaptitalSocial = affCaptitalSocial;
	}


	public String getNumTelephone() {
		return numTelephone;
	}


	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}


	public boolean isAffNumTelephone() {
		return affNumTelephone;
	}


	public void setAffNumTelephone(boolean affNumTelephone) {
		this.affNumTelephone = affNumTelephone;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public boolean isAffAdresse() {
		return affAdresse;
	}


	public void setAffAdresse(boolean affAdresse) {
		this.affAdresse = affAdresse;
	}


	public String getActiviteEnDetail() {
		return activiteEnDetail;
	}


	public void setActiviteEnDetail(String activiteEnDetail) {
		this.activiteEnDetail = activiteEnDetail;
	}


	public boolean isAffActiviteEnDetail() {
		return affActiviteEnDetail;
	}


	public void setAffActiviteEnDetail(boolean affActiviteEnDetail) {
		this.affActiviteEnDetail = affActiviteEnDetail;
	}


	public int getAnneeCreation() {
		return anneeCreation;
	}


	public void setAnneeCreation(int anneeCreation) {
		this.anneeCreation = anneeCreation;
	}


	public boolean isAffAnneeCreation() {
		return affAnneeCreation;
	}


	public void setAffAnneeCreation(boolean affAnneeCreation) {
		this.affAnneeCreation = affAnneeCreation;
	}


	public StatutJuridique getStatut() {
		return statut;
	}


	public void setStatut(StatutJuridique statut) {
		this.statut = statut;
	}


	public double getNote() {
		return note;
	}


	public void setNote(double note) {
		this.note = note;
	}
	
	
	
	/******** Produit **********/
	
	@OneToMany(mappedBy="entreprise")
	private Collection<Produit> produits ;

	public Collection<Produit> getProduits() {
		return produits;
	}


	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	
	
	
	
	
	
	
	
}
