package com.ekenzy.ndr.dao.entities.socialnt;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ekenzy.ndr.dao.entities.Entreprise;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMsg;
	@ManyToOne
	@JoinColumn(name="idEE")
	private Entreprise EE;
	@ManyToOne
	@JoinColumn(name="idER")
	private Entreprise ER;
	private String contenu;
	private Date dateMsg;
    @Column(name="vue", nullable=false, columnDefinition ="Boolean default false")
	private Boolean vue=false;
	
	public Boolean getVue() {
		return vue;
	}
	public void setVue(Boolean vue) {
		this.vue = vue;
	}
	public Entreprise getEE() {
		return EE;
	}
	public void setEE(Entreprise eE) {
		EE = eE;
	}
	public Entreprise getER() {
		return ER;
	}
	public void setER(Entreprise eR) {
		ER = eR;
	}
	public Date getDateMsg() {
		return dateMsg;
	}
	public void setDateMsg(Date dateMsg) {
		this.dateMsg = dateMsg;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Message(Date dateMsg, String contenu) {
		super();
		this.dateMsg = dateMsg;
		this.contenu = contenu;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdMsg() {
		return this.idMsg;}

}
