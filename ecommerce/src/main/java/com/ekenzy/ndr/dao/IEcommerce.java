package com.ekenzy.ndr.dao;

import java.util.List;

import com.ekenzy.ndr.dao.entities.ecommerce.Categorie;
import com.ekenzy.ndr.dao.entities.ecommerce.Produit;



public interface IEcommerce {
	
	public Long ajouterCategorie(Categorie c);
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public void supprimerCategrorie(Long idcat);
	public void modifierCategorie(Categorie c);
	public Long ajouterProduit(Produit p, Long idCat);
	public List<Produit> listproduits(); 
	public List<Produit> produitsParMotCle(String mc);
	public List<Produit> produitsParCategorie(Long idCat);
	public List<Produit> produitsSelectionnes();
	public Produit getProduit(Long idP);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p); 
	/*public void ajouterUser(User u);
	public void attribuerRole(Role r,Long userID);
	public Commande enregistrerCommande(Panier p,Client c);	*/

}
