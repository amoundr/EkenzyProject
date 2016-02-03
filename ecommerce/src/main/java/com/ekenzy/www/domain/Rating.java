package com.ekenzy.www.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Rating implements Serializable{
   @Id 
   @GeneratedValue
   private Integer ratingID;
   /** @pdRoleInfo migr=yes name=Product assc=association7 mult=1..1 */
   @ManyToOne(fetch= FetchType.LAZY)
   @JoinColumn(name = "productID", referencedColumnName = "productID")
   private Product product;
   /** @pdRoleInfo migr=yes name=Individual assc=association8 mult=1..1 */
   @ManyToOne(fetch= FetchType.LAZY)
   @JoinColumn(name = "individualID", referencedColumnName = "individualID")
   private Individual individual;
   /** @pdRoleInfo migr=no name=Company assc=association45 mult=1..1 */
   @ManyToOne(fetch= FetchType.LAZY)
   @JoinColumn(name = "companyID", referencedColumnName = "companyID")
   private Company company;
   private Double points;
   
   
   public Integer getRatingID() {
	return ratingID;
}

public void setRatingID(Integer ratingID) {
	this.ratingID = ratingID;
}

/** @pdGenerated default parent getter */
   public Product getProduct() {
      return product;
   }
   
   /** @pdGenerated default parent setter
     * @param newProduct */
   public void setProduct(Product newProduct) {
      this.product = newProduct;
   }
   /** @pdGenerated default parent getter */
   public Individual getIndividual() {
      return individual;
   }
   
   /** @pdGenerated default parent setter
     * @param newIndividual */
   public void setIndividual(Individual newIndividual) {
      this.individual = newIndividual;
   }
   
   
   /** @pdGenerated default parent getter */
   public Company getCompany() {
      return company;
   }
   
   /** @pdGenerated default parent setter
     * @param newCompany */
   public void setCompany(Company newCompany) {
      this.company = newCompany;
   }

   public Double getPoints() {
		return points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}
}