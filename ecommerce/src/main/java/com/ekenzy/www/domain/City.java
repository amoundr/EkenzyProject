package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class City implements Serializable{
   @Id 
   @GeneratedValue
   private Integer cityID;
   private String name;
   private String code;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "areaID", referencedColumnName = "areaID")
   private Area area;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
   private Set<User> user;
/**
 * @return the cityID
 */
public Integer getCityID() {
	return cityID;
}
/**
 * @param cityID the cityID to set
 */
public void setCityID(Integer cityID) {
	this.cityID = cityID;
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
/**
 * @return the area
 */
public Area getArea() {
	return area;
}
/**
 * @param area the area to set
 */
public void setArea(Area area) {
	this.area = area;
};
}