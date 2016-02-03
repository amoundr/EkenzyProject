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


@SuppressWarnings("serial")
@Entity
public class Formula implements Serializable{
   @Id 
   @GeneratedValue
   private Integer formulaID;
   private Integer factor;
   private String frequency;
   private String currency;
   private String choice;
   private Double price;
   private java.util.Date date;
   /** @pdRoleInfo migr=yes name=Plan assc=association25 mult=1..1 */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "planID", referencedColumnName = "planID")
   private Plan plan;
   /** @pdRoleInfo migr=no name=PurchaseItem assc=association10 mult=0..* side=A */
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "formula")
   private Set<PurchaseItem> purchaseItem = new HashSet<PurchaseItem>();

   
   /**
 * @return the formulaID
 */
public Integer getFormulaID() {
	return formulaID;
}

/**
 * @param formulaID the formulaID to set
 */
public void setFormulaID(Integer formulaID) {
	this.formulaID = formulaID;
}

/**
 * @return the factor
 */
public Integer getFactor() {
	return factor;
}

/**
 * @param factor the factor to set
 */
public void setFactor(Integer factor) {
	this.factor = factor;
}

/**
 * @return the frequency
 */
public String getFrequency() {
	return frequency;
}

/**
 * @param frequency the frequency to set
 */
public void setFrequency(String frequency) {
	this.frequency = frequency;
}

/**
 * @return the currency
 */
public String getCurrency() {
	return currency;
}

/**
 * @param currency the currency to set
 */
public void setCurrency(String currency) {
	this.currency = currency;
}

/**
 * @return the choice
 */
public String getChoice() {
	return choice;
}

/**
 * @param choice the choice to set
 */
public void setChoice(String choice) {
	this.choice = choice;
}

/**
 * @return the price
 */
public Double getPrice() {
	return price;
}

/**
 * @param price the price to set
 */
public void setPrice(Double price) {
	this.price = price;
}

/**
 * @return the date
 */
public java.util.Date getDate() {
	return date;
}

/**
 * @param date the date to set
 */
public void setDate(java.util.Date date) {
	this.date = date;
}

/** @pdGenerated default parent getter */
   public Plan getPlan() {
      return plan;
   }
   
   /** @pdGenerated default parent setter
     * @param newPlan */
   public void setPlan(Plan newPlan) {
      if (this.plan == null || !this.plan.equals(newPlan))
      {
         if (this.plan != null)
         {
            Plan oldPlan = this.plan;
            this.plan = null;
            oldPlan.removeFormula(this);
         }
         if (newPlan != null)
         {
            this.plan = newPlan;
            this.plan.addFormula(this);
         }
      }
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