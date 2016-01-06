package com.ekenzy.ndr.web;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ekenzy.ndr.dao.IEcommerce;
import com.ekenzy.ndr.dao.entities.Entreprise;
import com.ekenzy.ndr.dao.entities.ecommerce.Produit;
import com.ekenzy.ndr.metier.IekenzyMetier;

@Controller
public class PhotoController {
	
	@Autowired
	private IekenzyMetier metier ;
	
	@Autowired
	private IEcommerce	metierEcommerce ;
	
	
	@RequestMapping(value="/photo")
	public String enregietrer(Model model, MultipartFile file) throws Exception{
	
	if(!file.isEmpty()){
	BufferedImage bi=ImageIO.read(file.getInputStream());
	System.out.println("le nom de l'image :" +file.getOriginalFilename());
	
	Entreprise e = metier.getEntreprise(30L);
	
	e.setCoverImage(file.getBytes());
	
	metier.modifierEntreprise(e);
	//c.setNomPhoto(file.getOriginalFilename()); c.setPhoto(file.getBytes()); 
	}
	else{ 
		System.out.println("empty image");
	}
	
	return "redirect:/";
	}
	
	@RequestMapping(value="/photoprofile")
	public String PhotoProfile(Model model, MultipartFile file) throws Exception{
	
	if(!file.isEmpty()){
	BufferedImage bi=ImageIO.read(file.getInputStream());
	System.out.println("le nom de l'image :" +file.getOriginalFilename());
	
	Entreprise e = metier.getEntreprise(30L);
	
	e.setProfileImage(file.getBytes());
	
	metier.modifierEntreprise(e);
	//c.setNomPhoto(file.getOriginalFilename()); c.setPhoto(file.getBytes()); 
	}
	else{ 
		System.out.println("empty image");
	}
	
	return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping(value="/photoCover",produces=MediaType.IMAGE_JPEG_VALUE)
	public byte[] photo(@RequestParam(value="idE")Long idE)throws IOException{
	///Categorie c=metier.getCategorie(idCat);
		Entreprise e = metier.getEntreprise(30L);	
	return IOUtils.toByteArray(new ByteArrayInputStream(e.getCoverImage()));
	}
	
	@ResponseBody
	@RequestMapping(value="/photoProfile",produces=MediaType.IMAGE_JPEG_VALUE)
	public byte[] photoProfile(@RequestParam(value="idE")Long idE)throws IOException{
	///Categorie c=metier.getCategorie(idCat);
		Entreprise e = metier.getEntreprise(30L);	
	return IOUtils.toByteArray(new ByteArrayInputStream(e.getProfileImage()));
	}
	
	@ResponseBody
	@RequestMapping(value="/photoProduit",produces=MediaType.IMAGE_JPEG_VALUE)
	public byte[] photoProd(@RequestParam(value="idP")Long idP)throws IOException{
	///Categorie c=metier.getCategorie(idCat);
		Entreprise e = metier.getEntreprise(30L);	
		Produit p =  metierEcommerce.getProduit(idP);
	return IOUtils.toByteArray(new ByteArrayInputStream(p.getPhoto()));
	}
	

}
