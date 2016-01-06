package com.ekenzy.ndr.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ekenzy.ndr.dao.entities.Entreprise;
import com.ekenzy.ndr.dao.entities.SecteurActivite;
import com.ekenzy.ndr.dao.entities.Ville;
import com.ekenzy.ndr.dao.entities.Zone;
import com.ekenzy.ndr.metier.IEcommerceMetier;
import com.ekenzy.ndr.metier.IekenzyMetier;
import com.ekenzy.ndr.web.model.AjaxList;
import com.ekenzy.ndr.web.model.FormEntreprise;

@Controller
public class EkenzyConroller {
	
	@Autowired
	private IekenzyMetier metier ;
	
	@Autowired
	private IEcommerceMetier	metierEcommerce ;
	
	
	
	@RequestMapping(value="/entreprise/bootstrap")
	public String indexbootstrap(Model model)
	{
	   
		  User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      String name = user.getUsername().toString(); //get logged in username
	      System.out.println("le nom " + name);
	      
	     Entreprise emp =  metier.getEntreprisebyNom(name);
	     
	     System.out.println("id : "+ emp.getId());
		return "entreprise/bootstrap" ;
		
		
	}
	
	
	@RequestMapping(value="/")
	public String index(Model model)
	{
		
		/**** add products***/
		model.addAttribute("produits", metierEcommerce.produitsParCategorie(1L));				
		// list metier.listZone() => Hashmap 
		
		/*User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      String name = user.getUsername().toString();       
	      Entreprise emp =  metier.getEntreprisebyNom(name);*/
	      
		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	      if( authentication != null && !(authentication instanceof AnonymousAuthenticationToken) && authentication.isAuthenticated()) return "redirect:/entreprise/infos";
	     

		//list metier.listZone() => Hashmap 
		//List<Zone> zones =  new ArrayList<Zone>(metier.listZone()) ;
	      List<Zone> zones =  new ArrayList<Zone>() ;
		
	    List<Ville> villes =  new ArrayList<Ville>(metier.listVille()) ;
			
	    List<SecteurActivite> secteurs =  new ArrayList<SecteurActivite>(metier.listSecteur()) ;
				
		model.addAttribute("zones", zones);
		model.addAttribute("villes", villes);
		model.addAttribute("secteurs", secteurs);
		
		//model.addAttribute("formentreprise" , new FormEntreprise());
		model.addAttribute("entreprise" , new Entreprise());
		return "index" ;
	}
	
	@RequestMapping(value="/ajouter")
	public String ajouter(Entreprise e , Zone zone,Model model)
	{
		//metier.addEntreprise(e);
		/*Zone z = metier.getZone(new Long(1));
		SecteurActivite sect = metier.getSecteur(new Long(1));
		
		Entreprise e = new Entreprise("Ekenzy1", "description", "email", "password", true);
		metier.addEntreprise(e, metier.getZone(new Long(1)).getIdZone(), metier.getSecteur(new Long(1)).getIdSecteur());*/
		
		System.out.println("/*******************************************************/");

		System.out.println("zone :"+e.getZone().getIdZone());
		System.out.println("ville :"+e.getVille().getIdVille());
		System.out.println("secteur :"+e.getSecteur().getIdSecteur());
		System.out.println("nom :"+e.getNom());
		System.out.println("/*******************************************************/");
		metier.addEntreprise(e, e.getZone().getIdZone(),e.getSecteur().getIdSecteur());
		model.addAttribute("entreprise" , new Entreprise());
		return "entreprise/index" ;
	}
	
	@RequestMapping(value="/ajouter1")
	public String ajouter(FormEntreprise formentreprise , Zone zone,Model model)
	{ 
		
		
		FormEntreprise frent = new FormEntreprise() ;
		if(!formentreprise.getPassTest().equals(formentreprise.getEntreprise().getPassword()))
		{
			
			frent.setErrorPass("erreur");
			
		}else{
			metier.addEntreprise(formentreprise.getEntreprise(), formentreprise.getEntreprise().getZone().getIdZone(),formentreprise.getEntreprise().getSecteur().getIdSecteur());
		}	
		model.addAttribute("formentreprise" , frent);
		return "index" ;
	}
	
	@RequestMapping(value = "/getJSON/{firstName}", method = RequestMethod.GET)
    @ResponseBody
    public Map<Long, String> findByName(@PathVariable("firstName") String first) {
		long l = Long.parseLong(first);
		//Zone v = metier.getZone(l);
		//System.out.println(v.getNomZone());
		Map<Long, String> zoneee = new HashMap<Long, String>();
		
		List<Zone> z= new ArrayList<Zone>(metier.listZone(l));
		
		for (Zone zn : z)
		zoneee.put(zn.getIdZone(), zn.getNomZone());
        return zoneee;
    }
	
	@RequestMapping(value = "/ville/{value}")
    @ResponseBody
    public Zone getMoyenneRating(@PathVariable("value") Long value) {
		System.out.println("daaazzzzzzzzzzzzzz");
		
		
		
		List<Zone> zons = (List<Zone>) metier.getVille(value).getZones();
		Zone z = metier.getZone(1L);
		//AjaxList ob = new AjaxList();
		//ob.setZones(zons);
		return z;
	}
	
}
