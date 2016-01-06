package com.ekenzy.ndr.web;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ekenzy.ndr.dao.entities.Entreprise;
import com.ekenzy.ndr.dao.entities.socialnt.Abonnement;
import com.ekenzy.ndr.metier.IEcommerceMetier;
import com.ekenzy.ndr.metier.IekenzyMetier;

@Controller
public class AbonneController {
	
	@Autowired
	private IekenzyMetier metier ;
	
	@Autowired
	private IEcommerceMetier	metierEcommerce ;
	
	
	/*@RequestMapping(value="/entreprise/tiles")
	public String tiles(Model model)
	{
		/******* get My id *****
		
		  User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      String name = user.getUsername().toString();       
	      Entreprise emp =  metier.getEntreprisebyNom(name);
	      
	      /******* récuprer liste entreprise abonnées chez moi *****
		
		//Entreprise emp = metier.getEntreprise(30L);
	      
	      //List<Entreprise> listE = metier.getListAbonne(emp.getId());
	      
	      List<Abonnement> abonnement = metier.getListAbonneeA(emp.getId());
	      
	      List<Abonnement> abonnee = metier.getListAbonneA(emp.getId());
	      
	      List<Abonnement>  nouveauAb = metier.getListNouvauxAbonneeA(emp.getId());
	      
	      
	      model.addAttribute("abonnement" , abonnement);
	      model.addAttribute("abonnee" , abonnee);
	      model.addAttribute("nouveauxabonnee" , nouveauAb);
	      
		
		return "mytiles";
	}*/
	
	@RequestMapping(value="/entreprise/abonnement")
	public String infos(Model model)
	{
		 /**** add products***/
		model.addAttribute("produits", metierEcommerce.produitsParCategorie(1L));		
		/******* get My id *****/
		
		  User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      String name = user.getUsername().toString();       
	      Entreprise emp =  metier.getEntreprisebyNom(name);
	      
	      /******* récuprer liste entreprise abonnées chez moi *****/ 
		
	      
	      //List<Entreprise> listE = metier.getListAbonne(emp.getId());
	      
	      List<Abonnement> abonnement = metier.getListAbonneeA(emp.getId());
	      
	      List<Abonnement> abonnee = metier.getListAbonneA(emp.getId());
	      
	      List<Abonnement>  nouveauAb = metier.getListNouvauxAbonneeA(emp.getId());
	      
	      
	      model.addAttribute("abonnement" , abonnement);
	      model.addAttribute("abonnee" , abonnee);
	      model.addAttribute("nouveauxabonnee" , nouveauAb);
	      
		
		return "abonnement" ;
	}
	
	
	
	@RequestMapping(value = "/entreprise/rating/{value}")
    @ResponseBody
    public Long getMoyenneRating(@PathVariable("value") Long value) {
		System.out.println("la valeur rating : "+ (value+1));
		return 1L;
	}
	
	@RequestMapping(value = "/entreprise/ratenote")
    @ResponseBody
    public double getRatingNote() {
		
		/******* get My id *****/
		
		  User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      String name = user.getUsername().toString();       
	      Entreprise emp =  metier.getEntreprisebyNom(name); 
		
		//Entreprise emp = metier.getEntreprise(emp.getNote()); 
	      
		return  emp.getNote();
	}

}
