package com.ekenzy.www.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class CategoriesLocalization implements Serializable{
   @Id 
   @GeneratedValue
   private Integer categoriesLocalizationID;
   private String lang;
   private String name;
   private String description;
/**
 * @return the categoriesLocalizationID
 */
public Integer getCategoriesLocalizationID() {
	return categoriesLocalizationID;
}
/**
 * @param categoriesLocalizationID the categoriesLocalizationID to set
 */
public void setCategoriesLocalizationID(Integer categoriesLocalizationID) {
	this.categoriesLocalizationID = categoriesLocalizationID;
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

}