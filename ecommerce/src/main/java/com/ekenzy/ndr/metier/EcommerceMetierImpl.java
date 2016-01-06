package com.ekenzy.ndr.metier;

import java.util.List;



import com.ekenzy.ndr.dao.IEcommerce;
import com.ekenzy.ndr.dao.entities.ecommerce.Categorie;
import com.ekenzy.ndr.dao.entities.ecommerce.Produit;

public class EcommerceMetierImpl implements IEcommerceMetier{
	
private IEcommerce dao;
	
	public void setDao(IEcommerce dao) {
		this.dao = dao;
		}
		@Override
		public List<Categorie> listCategories() {
		return dao.listCategories();
	}
	
		public Categorie getCategorie(Long idCat) {
			return dao.getCategorie(idCat);
		}
			@Override
		public List<Produit> listproduits() {
			return dao.listproduits();
		}
			@Override 
		public List<Produit> produitsParMotCle(String mc) {
			return dao.produitsParMotCle(mc);
		}
			@Override
		public List<Produit> produitsSelectionnes() {
			return dao.produitsSelectionnes();
		}	
		
		public Long ajouterCategorie(Categorie c) {
				return dao.ajouterCategorie(c);
		}
				@Override
		public void supprimerCategrorie(Long idcat) {
				// TODO Auto-generated method stub
				dao.supprimerCategrorie(idcat); 
		}
				@Override
		public void modifierCategorie(Categorie c) {
				// TODO Auto-generated method stub
				dao.modifierCategorie(c);
		}
				
		public Long ajouterProduit(Produit p, Long idCat) {
					return dao.ajouterProduit(p, idCat);
		}
					@Override
		public Produit getProduit(Long idP) {
					// TODO Auto-generated method stub // TODO Auto-generated method stub
					return dao.getProduit(idP);
		}
					@Override
		public void supprimerProduit(Long idP) {
					// TODO Auto-generated method stub
					dao.supprimerProduit(idP);
		}		
					
		public void modifierProduit(Produit p) {
						// TODO Auto-generated method stub
						dao.modifierProduit(p);
		}
						@Override
		public List<Produit> produitsParCategorie(Long idCat)  {
						// TODO Auto-generated method stub
						return dao.produitsParCategorie(idCat);
		}			

	
}
