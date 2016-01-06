package com.ekenzy.ndr.dao.entities.ecommerce;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Categorie implements Serializable {

	@Id
	@GeneratedValue
	private Long idCategorie;
	
	private String nomCategorie; 
	private String description;
	private String nomPhoto;
	
	@Lob
	private byte[] photo;
	
	@OneToMany(mappedBy="categorie")
	private Collection<Produit> produits=new ArrayList<Produit>();
	
	
	public Categorie(String nomCategorie, String description) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
	}
	public Long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNomPhoto() {
		return nomPhoto;
	}
	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
