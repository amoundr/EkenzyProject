package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
public class Purchase implements Serializable{
   @Id 
   @GeneratedValue
   private Integer purchaseID;
   private java.util.Date purchaseDate;
   private Double amount;
   private String purchaseInfo;
   private String status;
   @Transient
   private String purchaseType;
   private String invoiceNumber;
   /** @pdRoleInfo migr=no name=PurchaseItem assc=association9 mult=1..* side=A */   
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "purchase")
	private Set<PurchaseItem> purchaseItem = new HashSet<PurchaseItem>();
   /** @pdRoleInfo migr=yes name=Individual assc=association11 mult=1..1 */
   @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "individualID", referencedColumnName = "userID", nullable = false)
	private Individual customer;
   
   
   /**
 * @return the purchaseID
 */
public Integer getPurchaseID() {
	return purchaseID;
}

/**
 * @param purchaseID the purchaseID to set
 */
public void setPurchaseID(Integer purchaseID) {
	this.purchaseID = purchaseID;
}

/**
 * @return the purchaseDate
 */
public java.util.Date getPurchaseDate() {
	return purchaseDate;
}

/**
 * @param purchaseDate the purchaseDate to set
 */
public void setPurchaseDate(java.util.Date purchaseDate) {
	this.purchaseDate = purchaseDate;
}

/**
 * @return the amount
 */
public Double getAmount() {
	return amount;
}

/**
 * @param amount the amount to set
 */
public void setAmount(Double amount) {
	this.amount = amount;
}

/**
 * @return the purchaseInfo
 */
public String getPurchaseInfo() {
	return purchaseInfo;
}

/**
 * @param purchaseInfo the purchaseInfo to set
 */
public void setPurchaseInfo(String purchaseInfo) {
	this.purchaseInfo = purchaseInfo;
}

/**
 * @return the status
 */
public String getStatus() {
	return status;
}

/**
 * @param status the status to set
 */
public void setStatus(String status) {
	this.status = status;
}

/**
 * @return the purchaseType
 */
public String getPurchaseType() {
	return purchaseType;
}

/**
 * @param purchaseType the purchaseType to set
 */
public void setPurchaseType(String purchaseType) {
	this.purchaseType = purchaseType;
}

/**
 * @return the invoiceNumber
 */
public String getInvoiceNumber() {
	return invoiceNumber;
}

/**
 * @param invoiceNumber the invoiceNumber to set
 */
public void setInvoiceNumber(String invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
}

/** @pdGenerated default parent getter */
   public Individual getCustomer() {
      return customer;
   }
   
   /** @pdGenerated default parent setter
     * @param newIndividual */
   public void setCustomer(Individual newIndividual) {
      this.customer = newIndividual;
   }
   
   /** @pdGenerated default getter */
   public Set<PurchaseItem> getPurchaseItem() {
      return purchaseItem;
   }
   
   /** @pdGenerated default setter
     * @param newPurchaseItem */
   public void setPurchaseItem(Set<PurchaseItem> newPurchaseItem) {
      this.purchaseItem = newPurchaseItem;
   }

}