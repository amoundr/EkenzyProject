package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.PrimaryKeyJoinColumn;
@SuppressWarnings("serial")
@Entity
@SecondaryTable(name="COMPANY")
public class Company extends User implements Serializable { 
   //@GeneratedValue
   private String title;
   private Date existsSince;
   @Column(columnDefinition="TEXT")
   private String description;
   private String webSite;
   private Long altitude;
   private Long longitude;
   
   /** @pdRoleInfo migr=no name=ObjectLocalization assc=association18 mult=0..* */
   @OneToMany(mappedBy="company",fetch=FetchType.EAGER)
   private Collection<ObjectLocalization> objectLocalization = new HashSet<ObjectLocalization>();   
   
   /** @pdRoleInfo migr=no name=Comment assc=association46 coll=Collection impl=HashSet mult=0..* */
   @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   @OrderBy("commentDate DESC")
   private Collection<Comment> comment;
   /** @pdRoleInfo migr=no name=Product assc=association14 coll=Set impl=HashSet mult=0..* side=A */
   @OneToMany(mappedBy="company",fetch=FetchType.LAZY)
   private Set<Product> product;
   /** @pdRoleInfo migr=no name=LegalStatus assc=association35 mult=1..1 side=A */
   @OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "legalStatusID", referencedColumnName = "legalStatusID", nullable = false)
   private LegalStatus legalStatus;
   /** @pdRoleInfo migr=no name=ActivitySecor assc=association36 mult=1..1 side=A */
   @OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "activitySectorID", referencedColumnName = "activitySectorID", nullable = false)
   private ActivitySector activitySector;
   @OneToMany(mappedBy="company",fetch=FetchType.LAZY)
   private Set<Rating> rating;
   
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
 * @return the existsSince
 */
public Date getExistsSince() {
	return existsSince;
}

/**
 * @param existsSince the existsSince to set
 */
public void setExistsSince(Date existsSince) {
	this.existsSince = existsSince;
}

/**
 * @return the description
 */
public String getDescription() {
	return description;
}

/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}

/**
 * @return the webSite
 */
public String getWebSite() {
	return webSite;
}

/**
 * @param webSite the webSite to set
 */
public void setWebSite(String webSite) {
	this.webSite = webSite;
}

/**
 * @return the altitude
 */
public Long getAltitude() {
	return altitude;
}

/**
 * @param altitude the altitude to set
 */
public void setAltitude(Long altitude) {
	this.altitude = altitude;
}

/**
 * @return the longitude
 */
public Long getLongitude() {
	return longitude;
}

/**
 * @param longitude the longitude to set
 */
public void setLongitude(Long longitude) {
	this.longitude = longitude;
}

/**
 * @return the rating
 */
public Set<Rating> getRating() {
	return rating;
}

/**
 * @param rating the rating to set
 */
public void setRating(Set<Rating> rating) {
	this.rating = rating;
}

/** @pdGenerated default getter */
   public Collection<ObjectLocalization> getObjectLocalization() {
      return objectLocalization;
   }
   
   /** @pdGenerated default setter
     * @param newObjectLocalization */
   public void setObjectLocalization(Collection<ObjectLocalization> newObjectLocalization) {
      this.objectLocalization = newObjectLocalization;
   }
   
   /** @pdGenerated default getter */
   public Collection<Comment> getComment() {
      if (comment == null)
         comment = new HashSet<Comment>();
      return comment;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorComment() {
      if (comment == null)
         comment = new HashSet<Comment>();
      return comment.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newComment */
   public void setComment(Collection<Comment> newComment) {
      removeAllComment();
      for (Iterator iter = newComment.iterator(); iter.hasNext();)
         addComment((Comment)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newComment */
   public void addComment(Comment newComment) {
      if (newComment == null)
         return;
      if (this.comment == null)
         this.comment = new HashSet<Comment>();
      if (!this.comment.contains(newComment))
         this.comment.add(newComment);
   }
   
   /** @pdGenerated default remove
     * @param oldComment */
   public void removeComment(Comment oldComment) {
      if (oldComment == null)
         return;
      if (this.comment != null)
         if (this.comment.contains(oldComment))
            this.comment.remove(oldComment);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllComment() {
      if (comment != null)
         comment.clear();
   }
   /** @pdGenerated default getter */
   public Set<Product> getProduct() {
      if (product == null)
         product = new HashSet<Product>();
      return product;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorProduct() {
      if (product == null)
         product = new HashSet<Product>();
      return product.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProduct */
   public void setProduct(Set<Product> newProduct) {
      removeAllProduct();
      for (Iterator iter = newProduct.iterator(); iter.hasNext();)
         addProduct((Product)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProduct */
   public void addProduct(Product newProduct) {
      if (newProduct == null)
         return;
      if (this.product == null)
         this.product = new HashSet<Product>();
      if (!this.product.contains(newProduct))
      {
         this.product.add(newProduct);
         newProduct.setCompany(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldProduct */
   public void removeProduct(Product oldProduct) {
      if (oldProduct == null)
         return;
      if (this.product != null)
         if (this.product.contains(oldProduct))
         {
            this.product.remove(oldProduct);
            oldProduct.setCompany((Company)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProduct() {
      if (product != null)
      {
         Product oldProduct;
         for (Iterator iter = getIteratorProduct(); iter.hasNext();)
         {
            oldProduct = (Product)iter.next();
            iter.remove();
            oldProduct.setCompany((Company)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public LegalStatus getLegalStatus() {
      return legalStatus;
   }
   
   /** @pdGenerated default parent setter
     * @param newLegalStatus */
   public void setLegalStatus(LegalStatus newLegalStatus) {
      this.legalStatus = newLegalStatus;
   }
   /** @pdGenerated default parent getter */
   public ActivitySector getActivitySector() {
      return activitySector;
   }
   
   /** @pdGenerated default parent setter
     * @param newActivitySector */
   public void setActivitySector(ActivitySector newActivitySector) {
      this.activitySector = newActivitySector;
   }

}