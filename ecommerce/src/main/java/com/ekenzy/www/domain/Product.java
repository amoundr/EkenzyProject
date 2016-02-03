package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.GeneratedValue;

import com.ekenzy.www.domain.ObjectLocalization;

@SuppressWarnings("serial")
@Entity
public class Product implements Serializable {
   @Id 
   @GeneratedValue
   private Integer productID;
   private Boolean availability;
   private String demoLink;
   private Integer purchasesNumber;
   private Integer viewsNumber;
   /** @pdRoleInfo migr=yes name=Company assc=association14 mult=1..1 */
   @OneToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "companyID", referencedColumnName = "userID", nullable = false)
   private Company company;
   /** @pdRoleInfo migr=no name=Plan assc=association16 coll=Set impl=HashSet mult=0..* side=A */
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "product",cascade=CascadeType.REMOVE)
   private Set<Plan> plan;
   /** @pdRoleInfo migr=no name=Comment assc=association41 mult=0..* side=A */
   @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   @OrderBy("commentDate DESC")
   private Collection<Comment> comment = new HashSet<Comment>();
   /** @pdRoleInfo migr=no name=Media assc=association48 coll=Collection impl=HashSet mult=0..* */
   @OneToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
   private Collection<Media> media;
   private Integer kRating;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "product",cascade=CascadeType.REMOVE)
   private Set<Rating> ratings = new HashSet<Rating>();
   /** @pdRoleInfo migr=no name=ObjectLocalization assc=association13 mult=0..* */
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
   private Collection<ObjectLocalization> objectLocalization = new HashSet<ObjectLocalization>();
   
   
   /** @pdGenerated default getter */
   public Collection<ObjectLocalization> getObjectLocalization() {
      return objectLocalization;
   }
   
   /** @pdGenerated default setter
    * @param newObjectLocalization */
  public void setObjectLocalization(Collection<ObjectLocalization> newObjectLocalization) {
     this.objectLocalization = newObjectLocalization;
  }
  
   /**
 * @return the productID
 */
public Integer getProductID() {
	return productID;
}

/**
 * @param productID the productID to set
 */
public void setProductID(Integer productID) {
	this.productID = productID;
}

/**
 * @return the availability
 */
public Boolean getAvailability() {
	return availability;
}

/**
 * @param availability the availability to set
 */
public void setAvailability(Boolean availability) {
	this.availability = availability;
}

/**
 * @return the demoLink
 */
public String getDemoLink() {
	return demoLink;
}

/**
 * @param demoLink the demoLink to set
 */
public void setDemoLink(String demoLink) {
	this.demoLink = demoLink;
}

/**
 * @return the purchasesNumber
 */
public Integer getPurchasesNumber() {
	return purchasesNumber;
}

/**
 * @param purchasesNumber the purchasesNumber to set
 */
public void setPurchasesNumber(Integer purchasesNumber) {
	this.purchasesNumber = purchasesNumber;
}

/**
 * @return the viewsNumber
 */
public Integer getViewsNumber() {
	return viewsNumber;
}

/**
 * @param viewsNumber the viewsNumber to set
 */
public void setViewsNumber(Integer viewsNumber) {
	this.viewsNumber = viewsNumber;
}

/**
 * @return the comment
 */
public Collection<Comment> getComment() {
	return comment;
}

/**
 * @param comment the comment to set
 */
public void setComment(Collection<Comment> comment) {
	this.comment = comment;
}

/**
 * @return the kRating
 */
public Integer getkRating() {
	return kRating;
}

/**
 * @param kRating the kRating to set
 */
public void setkRating(Integer kRating) {
	this.kRating = kRating;
}

/**
 * @return the ratings
 */
public Set<Rating> getRatings() {
	return ratings;
}

/**
 * @param ratings the ratings to set
 */
public void setRatings(Set<Rating> ratings) {
	this.ratings = ratings;
}

   /** @pdGenerated default parent getter */
   public Company getCompany() {
      return company;
   }
   
   /** @pdGenerated default parent setter
     * @param newCompany */
   public void setCompany(Company newCompany) {
      if (this.company == null || !this.company.equals(newCompany))
      {
         if (this.company != null)
         {
            Company oldCompany = this.company;
            this.company = null;
            oldCompany.removeProduct(this);
         }
         if (newCompany != null)
         {
            this.company = newCompany;
            this.company.addProduct(this);
         }
      }
   }
      
   
   /** @pdGenerated default getter */
   public Collection<Media> getMedia() {
      if (media == null)
         media = new HashSet<Media>();
      return media;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorMedia() {
      if (media == null)
         media = new HashSet<Media>();
      return media.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMedia */
   public void setMedia(Collection<Media> newMedia) {
      removeAllMedia();
      for (Iterator iter = newMedia.iterator(); iter.hasNext();)
         addMedia((Media)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMedia */
   public void addMedia(Media newMedia) {
      if (newMedia == null)
         return;
      if (this.media == null)
         this.media = new HashSet<Media>();
      if (!this.media.contains(newMedia))
         this.media.add(newMedia);
   }
   
   /** @pdGenerated default remove
     * @param oldMedia */
   public void removeMedia(Media oldMedia) {
      if (oldMedia == null)
         return;
      if (this.media != null)
         if (this.media.contains(oldMedia))
            this.media.remove(oldMedia);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMedia() {
      if (media != null)
         media.clear();
   }
   /** @pdGenerated default getter */
   public Set<Plan> getPlan() {
      if (plan == null)
         plan = new HashSet<Plan>();
      return plan;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorPlan() {
      if (plan == null)
         plan = new HashSet<Plan>();
      return plan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPlan */
   public void setPlan(Set<Plan> newPlan) {
      removeAllPlan();
      for (Iterator iter = newPlan.iterator(); iter.hasNext();)
         addPlan((Plan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPlan */
   public void addPlan(Plan newPlan) {
      if (newPlan == null)
         return;
      if (this.plan == null)
         this.plan = new HashSet<Plan>();
      if (!this.plan.contains(newPlan))
      {
         this.plan.add(newPlan);
         newPlan.setProduct(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldPlan */
   public void removePlan(Plan oldPlan) {
      if (oldPlan == null)
         return;
      if (this.plan != null)
         if (this.plan.contains(oldPlan))
         {
            this.plan.remove(oldPlan);
            oldPlan.setProduct((Product)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPlan() {
      if (plan != null)
      {
         Plan oldPlan;
         for (Iterator iter = getIteratorPlan(); iter.hasNext();)
         {
            oldPlan = (Plan)iter.next();
            iter.remove();
            oldPlan.setProduct((Product)null);
         }
      }
   }

}