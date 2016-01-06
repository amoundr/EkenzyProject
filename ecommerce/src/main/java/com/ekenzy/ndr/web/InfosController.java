package com.ekenzy.ndr.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import com.ekenzy.ndr.dao.IEcommerce;
import com.ekenzy.ndr.dao.entities.Entreprise;
import com.ekenzy.ndr.dao.entities.Manager;
import com.ekenzy.ndr.dao.entities.StatutJuridique;
import com.ekenzy.ndr.dao.entities.Ville;
import com.ekenzy.ndr.dao.entities.Zone;
import com.ekenzy.ndr.dao.entities.ecommerce.Produit;
import com.ekenzy.ndr.metier.IEcommerceMetier;
import com.ekenzy.ndr.metier.IekenzyMetier;

@Controller
@SessionAttributes("myentreprise")
public class InfosController {
	
	
	@Autowired
	private IekenzyMetier metier ;
	
	@Autowired
	private IEcommerceMetier	metierEcommerce ;
	
	
	
	@RequestMapping(value="/entreprise/infos")
	public String infos(Model model)
	{
		model.addAttribute("produits", metierEcommerce.produitsParCategorie(1L));				
		/**** List ville ***/
		List<Ville> villes =  new ArrayList<Ville>(metier.listVille()) ;
	    model.addAttribute("villes", villes);
	    
		/**** List statut ***/
		
		List<StatutJuridique> statuts =  new ArrayList<StatutJuridique>(metier.listStatuts()) ;
		
		/******* get entreprise *****/
		
		  User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      String name = user.getUsername().toString();       
	      Entreprise emp =  metier.getEntreprisebyNom(name);
	      
	      /**** Manager  ***/
			
		 Manager mymanager = emp.getManager();
		 
		Manager manager = new Manager();
		
		 metier.murgeManagerInofs(manager,  mymanager);
		 
		 
		 //System.out.println("manager id : " + manager.getIdManager().toString());
			
			
	     
	     System.out.println("id entreprise : "+ emp.getId());
	     
	     Entreprise entreprise = new Entreprise() ;
	    // entreprise.setManager(manager) ;
	     metier.murgeEntrepriseInofs(entreprise,emp) ;
	     
	     
	     
	     
	     
	 	//model.addAttribute("categories", metierEcommerce.listCategories());
	 	model.addAttribute("produit", metierEcommerce.getProduit(1L));
	 	
	    
	    
	     
	     model.addAttribute("manager", manager);
	     model.addAttribute("statuts",statuts);
	     model.addAttribute("myentreprise",emp);
	     model.addAttribute("entreprise" , entreprise);
		return "infos" ;
	}
	
	@RequestMapping(value="/entreprise/editinfose")
	public String modifierInfos(@ModelAttribute("entreprise") Entreprise entreprise ,BindingResult result, Model model  , SessionStatus status)
	{
							
		Entreprise myentreprise = (Entreprise ) model.asMap().get("myentreprise") ;		
		/**** modifier my entreprise *****/
		
		
		metier.murgeEntrepriseInofs(myentreprise,entreprise) ;
		
		metier.modifierEntreprise(myentreprise);
		
		List<StatutJuridique> statuts =  new ArrayList<StatutJuridique>(metier.listStatuts()) ;
		
	    model.addAttribute("statuts",statuts);
		model.addAttribute("entreprise" , entreprise) ;
		
		return "redirect:/entreprise/infos";
		//return infos(model);
		//return "entreprise/infos" ;
		
	}
	
	@RequestMapping(value="/entreprise/editmanager")
	public String modifierInfoManager(@ModelAttribute("entreprise") Entreprise entreprise ,BindingResult result, Model model , SessionStatus status )
	{
		Entreprise myentreprise = (Entreprise ) model.asMap().get("myentreprise") ;
		Manager mymanager = myentreprise.getManager();
		
		Manager manager = entreprise.getManager();
		metier.murgeManagerInofs(mymanager , manager);
		
		System.out.println("id manageeeeer : "+ mymanager.getIdManager());
		System.out.println("nom manageeeeer : "+ manager.getNameManager());
		System.out.println("Ville manageeeeer : "+ manager.getVilleActuelleManager());
		
		//manager.setEntrepriseManager(myentreprise) ;
		
		//myentreprise.setManager(manager);
		
		System.out.println("date naissance : "+ manager.getDateNaissance());
							
		metier.modifierManager(mymanager);
		
		return "redirect:/entreprise/infos";
		//return infos(model);
		
	}
	

}
