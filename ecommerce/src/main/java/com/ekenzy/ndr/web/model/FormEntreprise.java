package com.ekenzy.ndr.web.model;

import com.ekenzy.ndr.dao.entities.Entreprise;

public class FormEntreprise {

	private Entreprise  entreprise ;
	
	private String passTest ;
	private String errorPass ;

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public String getPassTest() {
		return passTest;
	}

	public void setPassTest(String passTest) {
		this.passTest = passTest;
	}

	public String getErrorPass() {
		return errorPass;
	}

	public void setErrorPass(String errorPass) {
		this.errorPass = errorPass;
	}
	
	

}
