package com.ekenzy.ndr.web;

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
import com.ekenzy.ndr.metier.IekenzyMetier;

@Controller
public class ProfileController {

	@Autowired
	private IekenzyMetier metier ;
	
	@RequestMapping(value="/profile/{idEntreprise}")
	public String indexbootstrap(@PathVariable("idEntreprise") Long idEntreprise ,Model model)
	{
		  /*get ID emp*/
		  User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      String name = user.getUsername().toString();       
	      Entreprise en =  metier.getEntreprisebyNom(name);
	      
	      if(en.getId() == idEntreprise) return "redirect:/entreprise/infos";
		
		Entreprise emp = metier.getEntreprise((Long)idEntreprise);
		List<Abonnement> abonnement = metier.getListAbonneeA(emp.getId());
	      
	      List<Abonnement> abonnee = metier.getListAbonneA(emp.getId());
	      
	      List<Abonnement>  nouveauAb = metier.getListNouvauxAbonneeA(emp.getId());
	      
	      
	      model.addAttribute("abonnement" , abonnement);
	      model.addAttribute("abonnee" , abonnee);
	      model.addAttribute("nouveauxabonnee" , nouveauAb);
	      
		
		return "pabonnement" ;
		
		//return "redirect:/entreprise/infos";
	}
	
	@RequestMapping(value = "/profile/ratenote/{idEntreprise}")
    @ResponseBody
    public double getRatingNote(@PathVariable("idEntreprise") Long idEntreprise) {
		
		/******* get My id *****
		
		  User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      String name = user.getUsername().toString();       
	      Entreprise emp =  metier.getEntreprisebyNom(name); */
		
		Entreprise emp = metier.getEntreprise((Long)idEntreprise); 
	      
		return  emp.getNote();
	}
	
	@RequestMapping(value = "/profile/rating/{idEntreprise}/{value}")
    @ResponseBody
    public double getMoyenneRating(@PathVariable("idEntreprise") Long idEntreprise, @PathVariable("value") double value) {
		System.out.println("la valeur rating : "+ (value));
		
		/******* get My id *****/
		
		  User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      String name = user.getUsername().toString();       
	      Entreprise emp =  metier.getEntreprisebyNom(name); 
	      
		metier.ajouterNote(emp.getId() , idEntreprise , value);
		return  metier.getEntreprise(idEntreprise).getNote();
	}
}
