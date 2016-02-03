package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
public class Cart implements Serializable{
   private java.lang.String password;
   private java.lang.Double amount;
   private java.lang.String purchaseType;
   private java.lang.Double credit;
   /** @pdRoleInfo migr=no name=CartItem assc=association34 coll=Set impl=HashSet mult=1..* type=Composition side=A */
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "cart")
   private Set<CartItem> cartItem;
   
   /**
 * @return the password
 */
public java.lang.String getPassword() {
	return password;
}

/**
 * @param password the password to set
 */
public void setPassword(java.lang.String password) {
	this.password = password;
}

/**
 * @return the amount
 */
public java.lang.Double getAmount() {
	return amount;
}

/**
 * @param amount the amount to set
 */
public void setAmount(java.lang.Double amount) {
	this.amount = amount;
}

/**
 * @return the purchaseType
 */
public java.lang.String getPurchaseType() {
	return purchaseType;
}

/**
 * @param purchaseType the purchaseType to set
 */
public void setPurchaseType(java.lang.String purchaseType) {
	this.purchaseType = purchaseType;
}

/**
 * @return the credit
 */
public java.lang.Double getCredit() {
	return credit;
}

/**
 * @param credit the credit to set
 */
public void setCredit(java.lang.Double credit) {
	this.credit = credit;
}

/** @pdGenerated default getter */
   public Set<CartItem> getCartItem() {
      if (cartItem == null)
         cartItem = new HashSet<CartItem>();
      return cartItem;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorCartItem() {
      if (cartItem == null)
         cartItem = new HashSet<CartItem>();
      return cartItem.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCartItem */
   public void setCartItem(Set<CartItem> newCartItem) {
      removeAllCartItem();
      for (Iterator iter = newCartItem.iterator(); iter.hasNext();)
         addCartItem((CartItem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCartItem */
   public void addCartItem(CartItem newCartItem) {
      if (newCartItem == null)
         return;
      if (this.cartItem == null)
         this.cartItem = new HashSet<CartItem>();
      if (!this.cartItem.contains(newCartItem))
      {
         this.cartItem.add(newCartItem);
         newCartItem.setCart(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCartItem */
   public void removeCartItem(CartItem oldCartItem) {
      if (oldCartItem == null)
         return;
      if (this.cartItem != null)
         if (this.cartItem.contains(oldCartItem))
         {
            this.cartItem.remove(oldCartItem);
            oldCartItem.setCart((Cart)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCartItem() {
      if (cartItem != null)
      {
         CartItem oldCartItem;
         for (Iterator iter = getIteratorCartItem(); iter.hasNext();)
         {
            oldCartItem = (CartItem)iter.next();
            iter.remove();
            oldCartItem.setCart((Cart)null);
         }
      }
   }

}