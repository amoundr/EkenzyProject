package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Area implements Serializable{
   @Id 
   @GeneratedValue
   private Integer areaID;
   private String name;
   private String code;
   
   /** @pdRoleInfo migr=no name=City assc=association32 coll=List impl=ArrayList mult=0..* */
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "area")
   private List<City> city;
   /** @pdRoleInfo migr=no name=Country assc=association31 mult=1..1 side=A */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "countryID", referencedColumnName = "countryID", nullable=false)
   private Country country;
   
   
   /**
 * @return the areaID
 */
public Integer getAreaID() {
	return areaID;
}

/**
 * @param areaID the areaID to set
 */
public void setAreaID(Integer areaID) {
	this.areaID = areaID;
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
   public List<City> getCity() {
      if (city == null)
         city = new ArrayList<City>();
      return city;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorCity() {
      if (city == null)
         city = new ArrayList<City>();
      return city.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCity */
   public void setCity(List<City> newCity) {
      removeAllCity();
      for (Iterator iter = newCity.iterator(); iter.hasNext();)
         addCity((City)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCity */
   public void addCity(City newCity) {
      if (newCity == null)
         return;
      if (this.city == null)
         this.city = new ArrayList<City>();
      if (!this.city.contains(newCity))
         this.city.add(newCity);
   }
   
   /** @pdGenerated default remove
     * @param oldCity */
   public void removeCity(City oldCity) {
      if (oldCity == null)
         return;
      if (this.city != null)
         if (this.city.contains(oldCity))
            this.city.remove(oldCity);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCity() {
      if (city != null)
         city.clear();
   }
   /** @pdGenerated default parent getter */
   public Country getCountry() {
      return country;
   }
   
   /** @pdGenerated default parent setter
     * @param newCountry */
   public void setCountry(Country newCountry) {
      if (this.country == null || !this.country.equals(newCountry))
      {
         if (this.country != null)
         {
            Country oldCountry = this.country;
            this.country = null;
            oldCountry.removeArea(this);
         }
         if (newCountry != null)
         {
            this.country = newCountry;
            this.country.addArea(this);
         }
      }
   }

}