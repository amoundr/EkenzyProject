package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Promotion implements Serializable{
   @Id 
   @GeneratedValue
   private Integer promotionID;
   private String title;
   @Column(columnDefinition="TEXT")
   private String details;
   private Double discount;
   private Double discounted;
   private Integer purchaseNumber;
   private Date expireDate;
   private Date startDate;
   private String coupon;
   
   /** @pdRoleInfo migr=no name=Plan assc=association47 mult=1..1 side=A */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "planID", referencedColumnName = "planID")
   private Plan plan;
   /**
 * @return the promotionID
 */
public Integer getPromotionID() {
	return promotionID;
}

/**
 * @param promotionID the promotionID to set
 */
public void setPromotionID(Integer promotionID) {
	this.promotionID = promotionID;
}

/**
 * @return the title
 */
public String getTitle() {
	return title;
}

/**
 * @param title the title to set
 */
public void setTitle(String title) {
	this.title = title;
}

/**
 * @return the details
 */
public String getDetails() {
	return details;
}

/**
 * @param details the details to set
 */
public void setDetails(String details) {
	this.details = details;
}

/**
 * @return the discount
 */
public Double getDiscount() {
	return discount;
}

/**
 * @param discount the discount to set
 */
public void setDiscount(Double discount) {
	this.discount = discount;
}

/**
 * @return the discounted
 */
public Double getDiscounted() {
	return discounted;
}

/**
 * @param discounted the discounted to set
 */
public void setDiscounted(Double discounted) {
	this.discounted = discounted;
}

/**
 * @return the purchaseNumber
 */
public Integer getPurchaseNumber() {
	return purchaseNumber;
}

/**
 * @param purchaseNumber the purchaseNumber to set
 */
public void setPurchaseNumber(Integer purchaseNumber) {
	this.purchaseNumber = purchaseNumber;
}

/**
 * @return the expireDate
 */
public Date getExpireDate() {
	return expireDate;
}

/**
 * @param expireDate the expireDate to set
 */
public void setExpireDate(Date expireDate) {
	this.expireDate = expireDate;
}

/**
 * @return the startDate
 */
public Date getStartDate() {
	return startDate;
}

/**
 * @param startDate the startDate to set
 */
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}

/**
 * @return the coupon
 */
public String getCoupon() {
	return coupon;
}

/**
 * @param coupon the coupon to set
 */
public void setCoupon(String coupon) {
	this.coupon = coupon;
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
            oldPlan.removePromotion(this);
         }
         if (newPlan != null)
         {
            this.plan = newPlan;
            this.plan.addPromotion(this);
         }
      }
   }

}