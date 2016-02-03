package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class PurchaseItem implements Serializable{
   @Id 
   @GeneratedValue
   private Integer purchaseItemID;
   private double unitPrice;
   private double amount;
   private double tax;
   private Integer quantity;
   private Date statusDate;
   private String status;
   /** @pdRoleInfo migr=yes name=Purchase assc=association9 mult=1..1 */
   @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
   @JoinColumn(name = "purchaseID", referencedColumnName = "purchaseID", nullable = false)
   private Purchase purchase;
   
   /** @pdRoleInfo migr=no name=Formula assc=association10 mult=1..1 */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "formulaID", referencedColumnName = "formulaID", nullable = false)
   private Formula formula;
   
   
   /**
 * @return the purchaseItemID
 */
public Integer getPurchaseItemID() {
	return purchaseItemID;
}

/**
 * @param purchaseItemID the purchaseItemID to set
 */
public void setPurchaseItemID(Integer purchaseItemID) {
	this.purchaseItemID = purchaseItemID;
}

/**
 * @return the unitPrice
 */
public double getUnitPrice() {
	return unitPrice;
}

/**
 * @param unitPrice the unitPrice to set
 */
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}

/**
 * @return the amount
 */
public double getAmount() {
	return amount;
}

/**
 * @param amount the amount to set
 */
public void setAmount(double amount) {
	this.amount = amount;
}

/**
 * @return the tax
 */
public double getTax() {
	return tax;
}

/**
 * @param tax the tax to set
 */
public void setTax(double tax) {
	this.tax = tax;
}

/**
 * @return the quantity
 */
public Integer getQuantity() {
	return quantity;
}

/**
 * @param quantity the quantity to set
 */
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

/**
 * @return the statusDate
 */
public Date getStatusDate() {
	return statusDate;
}

/**
 * @param statusDate the statusDate to set
 */
public void setStatusDate(Date statusDate) {
	this.statusDate = statusDate;
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

/** @pdGenerated default parent getter */
   public Purchase getPurchase() {
      return purchase;
   }
   
   /** @pdGenerated default parent setter
     * @param newPurchase */
   public void setPurchase(Purchase newPurchase) {
      this.purchase = newPurchase;
   }
   /** @pdGenerated default parent getter */
   public Formula getFormula() {
      return formula;
   }
   
   /** @pdGenerated default parent setter
     * @param newFormula */
   public void setFormula(Formula newFormula) {
      this.formula = newFormula;
   }

}