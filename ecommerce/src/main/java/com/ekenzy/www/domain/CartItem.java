package com.ekenzy.www.domain;

import java.io.Serializable;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
public class CartItem implements Serializable{
   private Integer discountID;
   private String discountInfo;
   private Integer quantity;
   private Double unitPrice;
   private Double amount;
   /** @pdRoleInfo migr=no name=Cart assc=association34 mult=1..1 */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "cartID", referencedColumnName = "cartID", nullable=false)
   private Cart cart;
   
   /**
 * @return the discountID
 */
public Integer getDiscountID() {
	return discountID;
}

/**
 * @param discountID the discountID to set
 */
public void setDiscountID(Integer discountID) {
	this.discountID = discountID;
}

/**
 * @return the discountInfo
 */
public String getDiscountInfo() {
	return discountInfo;
}

/**
 * @param discountInfo the discountInfo to set
 */
public void setDiscountInfo(String discountInfo) {
	this.discountInfo = discountInfo;
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
 * @return the unitPrice
 */
public Double getUnitPrice() {
	return unitPrice;
}

/**
 * @param unitPrice the unitPrice to set
 */
public void setUnitPrice(Double unitPrice) {
	this.unitPrice = unitPrice;
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

/** @pdGenerated default parent getter */
   public Cart getCart() {
      return cart;
   }
   
   /** @pdGenerated default parent setter
     * @param newCart */
   public void setCart(Cart newCart) {
      if (this.cart == null || !this.cart.equals(newCart))
      {
         if (this.cart != null)
         {
            Cart oldCart = this.cart;
            this.cart = null;
            oldCart.removeCartItem(this);
         }
         if (newCart != null)
         {
            this.cart = newCart;
            this.cart.addCartItem(this);
         }
      }
   }

}