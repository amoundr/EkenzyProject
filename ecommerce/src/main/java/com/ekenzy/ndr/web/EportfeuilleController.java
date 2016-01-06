package com.ekenzy.ndr.web;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import com.ekenzy.ndr.dao.IEcommerce;
import com.ekenzy.ndr.dao.entities.Entreprise;
import com.ekenzy.ndr.dao.entities.Manager;
import com.ekenzy.ndr.dao.entities.StatutJuridique;
import com.ekenzy.ndr.dao.entities.Ville;
import com.ekenzy.ndr.dao.entities.Zone;
import com.ekenzy.ndr.dao.entities.ecommerce.Categorie;
import com.ekenzy.ndr.dao.entities.ecommerce.Produit;
import com.ekenzy.ndr.metier.IEcommerceMetier;
import com.ekenzy.ndr.metier.IekenzyMetier;

@Controller
public class EportfeuilleController {
	
	
	@Autowired
	private IekenzyMetier metier ;
	
	@Autowired
	private IEcommerceMetier	metierEcommerce ;
	
	
	@RequestMapping(value="/entreprise/eportefeuille")
	public String eportfeuille(Model model)
	{
		
		/* charger les produits d'une categorie**/
		
		model.addAttribute("produits", metierEcommerce.produitsParCategorie(1L));
		
		
		
		model.addAttribute("categories", metierEcommerce.listCategories());
		//model.addAttribute("categorie", new Categorie());
		model.addAttribute("produitARemplir", new Produit()); 
		
		return "eportefeuille" ;
	}
	
	
	
	@RequestMapping(value="/entreprise/ajouterProduit")
	public String ajouterProduit(@ModelAttribute("produitARemplir") Produit p ,Categorie categorie ,Model model , MultipartFile file) throws Exception
	{
		
		
		if(!file.isEmpty()){
			BufferedImage bi=ImageIO.read(file.getInputStream());
			System.out.println("le nom de l'image :" +file.getOriginalFilename());
		}
		
		/******* get My id *****/
		
		  User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      String name = user.getUsername().toString();       
	      Entreprise emp =  metier.getEntreprisebyNom(name);
	      
	      p.setPhoto(file.getBytes());
	      p.setEntreprise(emp);
	      
		
		metierEcommerce.ajouterProduit(p, p.getCategorie().getIdCategorie()); 
		
		return "redirect:/entreprise/eportefeuille" ;
	}
	
	
	

}
