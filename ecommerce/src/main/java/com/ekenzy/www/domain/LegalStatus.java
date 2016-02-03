package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@SuppressWarnings("serial")
@Entity
public class LegalStatus implements Serializable{
   @Id 
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer legalStatusID;
   private String defaultName;
   
   /** @pdRoleInfo migr=no name=CategoriesLocalization assc=association37 coll=Set impl=HashSet mult=1..* */
   @OneToMany(cascade = CascadeType.ALL)
   private Set<CategoriesLocalization> categoriesLocalization;
   
   /**
 * @return the legalStatusID
 */
public Integer getLegalStatusID() {
	return legalStatusID;
}

/**
 * @param legalStatusID the legalStatusID to set
 */
public void setLegalStatusID(Integer legalStatusID) {
	this.legalStatusID = legalStatusID;
}

/**
 * @return the defaultName
 */
public String getDefaultName() {
	return defaultName;
}

/**
 * @param defaultName the defaultName to set
 */
public void setDefaultName(String defaultName) {
	this.defaultName = defaultName;
}

/** @pdGenerated default getter */
   public Set<CategoriesLocalization> getCategoriesLocalization() {
      if (categoriesLocalization == null)
         categoriesLocalization = new HashSet<CategoriesLocalization>();
      return categoriesLocalization;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorCategoriesLocalization() {
      if (categoriesLocalization == null)
         categoriesLocalization = new HashSet<CategoriesLocalization>();
      return categoriesLocalization.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCategoriesLocalization */
   public void setCategoriesLocalization(Set<CategoriesLocalization> newCategoriesLocalization) {
      removeAllCategoriesLocalization();
      for (Iterator iter = newCategoriesLocalization.iterator(); iter.hasNext();)
         addCategoriesLocalization((CategoriesLocalization)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCategoriesLocalization */
   public void addCategoriesLocalization(CategoriesLocalization newCategoriesLocalization) {
      if (newCategoriesLocalization == null)
         return;
      if (this.categoriesLocalization == null)
         this.categoriesLocalization = new HashSet<CategoriesLocalization>();
      if (!this.categoriesLocalization.contains(newCategoriesLocalization))
         this.categoriesLocalization.add(newCategoriesLocalization);
   }
   
   /** @pdGenerated default remove
     * @param oldCategoriesLocalization */
   public void removeCategoriesLocalization(CategoriesLocalization oldCategoriesLocalization) {
      if (oldCategoriesLocalization == null)
         return;
      if (this.categoriesLocalization != null)
         if (this.categoriesLocalization.contains(oldCategoriesLocalization))
            this.categoriesLocalization.remove(oldCategoriesLocalization);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCategoriesLocalization() {
      if (categoriesLocalization != null)
         categoriesLocalization.clear();
   }

}