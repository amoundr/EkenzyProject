package com.ekenzy.www.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContactUsMessage {
   @Id 
   @GeneratedValue
   private Integer messageID;
   private String name;
   private String fromAddress;
   private String subject;
   private java.util.Date date;
   private Boolean reade;
   @Column(columnDefinition="TEXT")
   private String message;
/**
 * @return the messageID
 */
public Integer getMessageID() {
	return messageID;
}
/**
 * @param messageID the messageID to set
 */
public void setMessageID(Integer messageID) {
	this.messageID = messageID;
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
 * @return the fromAddress
 */
public String getFromAddress() {
	return fromAddress;
}
/**
 * @param fromAddress the fromAddress to set
 */
public void setFromAddress(String fromAddress) {
	this.fromAddress = fromAddress;
}
/**
 * @return the subject
 */
public String getSubject() {
	return subject;
}
/**
 * @param subject the subject to set
 */
public void setSubject(String subject) {
	this.subject = subject;
}
/**
 * @return the date
 */
public java.util.Date getDate() {
	return date;
}
/**
 * @param date the date to set
 */
public void setDate(java.util.Date date) {
	this.date = date;
}
/**
 * @return the reade
 */
public Boolean getReade() {
	return reade;
}
/**
 * @param reade the reade to set
 */
public void setReade(Boolean reade) {
	this.reade = reade;
}
/**
 * @return the message
 */
public String getMessage() {
	return message;
}
/**
 * @param message the message to set
 */
public void setMessage(String message) {
	this.message = message;
}

}