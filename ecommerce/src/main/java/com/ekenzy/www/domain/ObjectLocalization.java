package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;

@SuppressWarnings("serial")
@Entity
public class ObjectLocalization implements Serializable {
   @Id 
   @GeneratedValue
   private Integer objectLocalizationID;
   private String lang;
   private Boolean published;
   private Boolean images;
   private Date createdAt;
   private Date updatedAt;
   @Column(columnDefinition="TEXT")
   private String shorte;
   private String title;
   @Column(columnDefinition="TEXT")
   private String body;
   @ElementCollection 
   @MapKeyColumn(name="additional_contents_key")
   @Column(name="additional_contents", columnDefinition="TEXT")
   @CollectionTable(name="object_additional_contents", joinColumns= @JoinColumn(name="ObjectLocalization"))
   private Map<String,String> additionalContents;
   
   /** @pdRoleInfo migr=no name=Product assc=association13 mult=0..1 side=A */
   @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productID", referencedColumnName = "productID", nullable = true)
   private Product product;
   /** @pdRoleInfo migr=no name=Plan assc=association15 mult=0..1 side=A */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "planID", referencedColumnName = "planID", nullable = true)
   private Plan plan;
   /** @pdRoleInfo migr=no name=Company assc=association18 mult=0..1 side=A */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "companyID", referencedColumnName = "userID", nullable = true)
   private Company company;
   
   
   /**
 * @return the objectLocalizationID
 */
public Integer getObjectLocalizationID() {
	return objectLocalizationID;
}

/**
 * @param objectLocalizationID the objectLocalizationID to set
 */
public void setObjectLocalizationID(Integer objectLocalizationID) {
	this.objectLocalizationID = objectLocalizationID;
}

/**
 * @return the lang
 */
public String getLang() {
	return lang;
}

/**
 * @param lang the lang to set
 */
public void setLang(String lang) {
	this.lang = lang;
}

/**
 * @return the published
 */
public Boolean getPublished() {
	return published;
}

/**
 * @param published the published to set
 */
public void setPublished(Boolean published) {
	this.published = published;
}

/**
 * @return the images
 */
public Boolean getImages() {
	return images;
}

/**
 * @param images the images to set
 */
public void setImages(Boolean images) {
	this.images = images;
}

/**
 * @return the createdAt
 */
public Date getCreatedAt() {
	return createdAt;
}

/**
 * @param createdAt the createdAt to set
 */
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

/**
 * @return the updatedAt
 */
public Date getUpdatedAt() {
	return updatedAt;
}

/**
 * @param updatedAt the updatedAt to set
 */
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}

/**
 * @return the shorte
 */
public String getShorte() {
	return shorte;
}

/**
 * @param shorte the shorte to set
 */
public void setShorte(String shorte) {
	this.shorte = shorte;
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
 * @return the body
 */
public String getBody() {
	return body;
}

/**
 * @param body the body to set
 */
public void setBody(String body) {
	this.body = body;
}

/**
 * @return the additionalContents
 */
public Map<String, String> getAdditionalContents() {
	return additionalContents;
}

/**
 * @param additionalContents the additionalContents to set
 */
public void setAdditionalContents(Map<String, String> additionalContents) {
	this.additionalContents = additionalContents;
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
   public Plan getPlan() {
      return plan;
   }
   
   /** @pdGenerated default parent setter
     * @param newPlan */
   public void setPlan(Plan newPlan) {
      this.plan = newPlan;
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

}