package com.ekenzy.ndr.dao.entities.socialnt;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ekenzy.ndr.dao.entities.Entreprise;

@Entity
public class Conversation implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCnv;
	@ManyToOne
	@JoinColumn(name="idE1")
	private Entreprise E1;
	@ManyToOne
	@JoinColumn(name="idE2")
	private Entreprise E2;
	private Date dateCnv;
	
	
	public Long getIdCnv() {
		return idCnv;
	}
	public void setIdCnv(Long idCnv) {
		this.idCnv = idCnv;
	}
	public Conversation( Date dateCnv) {
		super();
		this.dateCnv = dateCnv;
	}
	public Conversation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Entreprise getE1() {
		return E1;
	}
	public void setE1(Entreprise e1) {
		E1 = e1;
	}
	public Entreprise getE2() {
		return E2;
	}
	public void setE2(Entreprise e2) {
		E2 = e2;
	}
	public Date getDateCnv() {
		return dateCnv;
	}
	public void setDateCnv(Date dateCnv) {
		this.dateCnv = dateCnv;
	}


}
