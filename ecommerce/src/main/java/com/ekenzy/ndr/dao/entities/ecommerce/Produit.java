package com.ekenzy.ndr.dao.entities.ecommerce;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

import com.ekenzy.ndr.dao.entities.Entreprise;

@Entity
public class Produit implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	@NotEmpty
	private String designation;  
	private String description; 
	private String specification;
	private double prix;  
	
	@Lob
	private byte[] photo;
	private int quantite;  
	private boolean selectionne;
	
	@ManyToOne
	@JoinColumn(name="ID_CAT")
	private Categorie categorie ;
	
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	
	@ManyToOne
	@JoinColumn(name="ID_ENTREPRISE")
	private Entreprise entreprise ;
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise e) {
		this.entreprise = e;
	}
	
	
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public boolean isSelectionne() {
		return selectionne;
	}
	public void setSelectionne(boolean selectionne) {
		this.selectionne = selectionne;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}