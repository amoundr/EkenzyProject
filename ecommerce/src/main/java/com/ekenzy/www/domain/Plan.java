package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
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
public class Plan implements Serializable{
   @Id 
   @GeneratedValue
   private Integer planID;
   private String title;
   private String detail;
   /** @pdRoleInfo migr=yes name=Product assc=association16 mult=1..1 */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "productID", referencedColumnName = "productID")
   private Product product;
   /** @pdRoleInfo migr=no name=Promotion assc=association47 coll=Collection impl=HashSet mult=0..* */
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "plan",cascade=CascadeType.REMOVE)
   private Collection<Promotion> promotions;
   /** @pdRoleInfo migr=no name=Formula assc=association25 coll=Set impl=HashSet mult=0..* side=A */
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "plan",cascade=CascadeType.REMOVE)
   private Set<Formula> formulas;
   /** @pdRoleInfo migr=no name=ObjectLocalization assc=association15 mult=0..* */
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
   private Collection<ObjectLocalization> objectLocalizations;
   
   
   /**
 * @return the planID
 */
public Integer getPlanID() {
	return planID;
}

/**
 * @param planID the planID to set
 */
public void setPlanID(Integer planID) {
	this.planID = planID;
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
 * @return the detail
 */
public String getDetail() {
	return detail;
}

/**
 * @param detail the detail to set
 */
public void setDetail(String detail) {
	this.detail = detail;
}

/** @pdGenerated default getter */
   public Collection<ObjectLocalization> getObjectLocalization() {
      return objectLocalizations;
   }
   
   /** @pdGenerated default setter
     * @param newObjectLocalization */
   public void setObjectLocalization(Collection<ObjectLocalization> newObjectLocalization) {
      this.objectLocalizations = newObjectLocalization;
   }
   /** @pdGenerated default parent getter */
   public Product getProduct() {
      return product;
   }
   
   /** @pdGenerated default parent setter
     * @param newProduct */
   public void setProduct(Product newProduct) {
      if (this.product == null || !this.product.equals(newProduct))
      {
         if (this.product != null)
         {
            Product oldProduct = this.product;
            this.product = null;
            oldProduct.removePlan(this);
         }
         if (newProduct != null)
         {
            this.product = newProduct;
            this.product.addPlan(this);
         }
      }
   }
   
   
   /** @pdGenerated default getter */
   public Collection<Promotion> getPromotion() {
      if (promotions == null)
         promotions = new HashSet<Promotion>();
      return promotions;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorPromotion() {
      if (promotions == null)
         promotions = new HashSet<Promotion>();
      return promotions.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPromotion */
   public void setPromotion(Collection<Promotion> newPromotion) {
      removeAllPromotion();
      for (Iterator iter = newPromotion.iterator(); iter.hasNext();)
         addPromotion((Promotion)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPromotion */
   public void addPromotion(Promotion newPromotion) {
      if (newPromotion == null)
         return;
      if (this.promotions == null)
         this.promotions = new HashSet<Promotion>();
      if (!this.promotions.contains(newPromotion))
      {
         this.promotions.add(newPromotion);
         newPromotion.setPlan(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldPromotion */
   public void removePromotion(Promotion oldPromotion) {
      if (oldPromotion == null)
         return;
      if (this.promotions != null)
         if (this.promotions.contains(oldPromotion))
         {
            this.promotions.remove(oldPromotion);
            oldPromotion.setPlan((Plan)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPromotion() {
      if (promotions != null)
      {
         Promotion oldPromotion;
         for (Iterator iter = getIteratorPromotion(); iter.hasNext();)
         {
            oldPromotion = (Promotion)iter.next();
            iter.remove();
            oldPromotion.setPlan((Plan)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public Set<Formula> getFormula() {
      if (formulas == null)
         formulas = new HashSet<Formula>();
      return formulas;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorFormula() {
      if (formulas == null)
         formulas = new HashSet<Formula>();
      return formulas.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFormula */
   public void setFormula(Set<Formula> newFormula) {
      removeAllFormula();
      for (Iterator iter = newFormula.iterator(); iter.hasNext();)
         addFormula((Formula)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newFormula */
   public void addFormula(Formula newFormula) {
      if (newFormula == null)
         return;
      if (this.formulas == null)
         this.formulas = new HashSet<Formula>();
      if (!this.formulas.contains(newFormula))
      {
         this.formulas.add(newFormula);
         newFormula.setPlan(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldFormula */
   public void removeFormula(Formula oldFormula) {
      if (oldFormula == null)
         return;
      if (this.formulas != null)
         if (this.formulas.contains(oldFormula))
         {
            this.formulas.remove(oldFormula);
            oldFormula.setPlan((Plan)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFormula() {
      if (formulas != null)
      {
         Formula oldFormula;
         for (Iterator iter = getIteratorFormula(); iter.hasNext();)
         {
            oldFormula = (Formula)iter.next();
            iter.remove();
            oldFormula.setPlan((Plan)null);
         }
      }
   }

}