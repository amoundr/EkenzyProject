package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Country implements Serializable{
   @Id 
   @GeneratedValue
   private Integer countryID;
   private String name;
   private String code;
   
   /** @pdRoleInfo migr=no name=Area assc=association31 coll=List impl=ArrayList mult=0..* */
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
   private List<Area> area;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
   private Set<User> user;
   
   /**
 * @return the countryID
 */
public Integer getCountryID() {
	return countryID;
}

/**
 * @param countryID the countryID to set
 */
public void setCountryID(Integer countryID) {
	this.countryID = countryID;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the code
 */
public String getCode() {
	return code;
}

/**
 * @param code the code to set
 */
public void setCode(String code) {
	this.code = code;
}

/** @pdGenerated default getter */
   public List<Area> getArea() {
      if (area == null)
         area = new ArrayList<Area>();
      return area;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorArea() {
      if (area == null)
         area = new ArrayList<Area>();
      return area.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newArea */
   public void setArea(List<Area> newArea) {
      removeAllArea();
      for (Iterator iter = newArea.iterator(); iter.hasNext();)
         addArea((Area)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newArea */
   public void addArea(Area newArea) {
      if (newArea == null)
         return;
      if (this.area == null)
         this.area = new ArrayList<Area>();
      if (!this.area.contains(newArea))
      {
         this.area.add(newArea);
         newArea.setCountry(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldArea */
   public void removeArea(Area oldArea) {
      if (oldArea == null)
         return;
      if (this.area != null)
         if (this.area.contains(oldArea))
         {
            this.area.remove(oldArea);
            oldArea.setCountry((Country)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllArea() {
      if (area != null)
      {
         Area oldArea;
         for (Iterator iter = getIteratorArea(); iter.hasNext();)
         {
            oldArea = (Area)iter.next();
            iter.remove();
            oldArea.setCountry((Country)null);
         }
      }
   }

}