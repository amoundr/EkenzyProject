package com.ekenzy.ndr.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ekenzy.ndr.dao.entities.Entreprise;
import com.ekenzy.ndr.metier.IekenzyMetier;
import com.ekenzy.ndr.web.model.Tag;

@Controller
public class SearchController {
	
	@Autowired
	private IekenzyMetier metier ;
	
	List<Tag> data = new ArrayList<Tag>();
	
	@RequestMapping("/chercherEntreprise") 
	public String chercherProduits(@RequestParam String name,Model model){
	
	Entreprise e = metier.getEntrByName(name);
	
	System.out.println("the name is :" + name + e.getNom() +" the id is :"+e.getId());
	return "redirect:/profile/"+e.getId();
	}

	
	
	@RequestMapping(value = "/getTags", method = RequestMethod.GET)
	public @ResponseBody
	List<Tag> getTags(@RequestParam String tagName) {
 
		return simulateSearchResult(tagName);
 
	}
	
	private List<Tag> simulateSearchResult(String tagName) {
		 
		List<Tag> result = new ArrayList<Tag>();
		
		String mc = "m";
		
		List<Entreprise> ents = metier.entrepriseParMotCle(tagName);
		
		for (Entreprise e : ents)
			result.add(new Tag(e.getId(), e.getNom()));
 
		/* iterate a list and filter by tagName
		for (Tag tag : data) {
			if (tag.getTagName().contains(tagName)) {
				result.add(tag);
			}
		}*/
 
		return result;
	}
}
