package com.ekenzy.www.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

//@XmlRootElement 
//@XmlAccessorType(value=FIELD)
@SuppressWarnings("serial")
@Entity
public class Media implements Serializable {
   @Id 
   @GeneratedValue
   private Integer mediaID;
   private String title;
   private String mediaFilePath;
   @Column(name="DESCRIPTION", columnDefinition="TEXT")
   private String description;
   private String mediaFileSize;
   private String mediaContentType;
   /** @pdRoleInfo migr=yes name=MediaType assc=association21 */
   @Enumerated(EnumType.STRING)
   private MediaType mediaType;
   //@XmlTransient 
   @Transient
   private CommonsMultipartFile fileData;
   
   
   /**
 * @return the mediaID
 */
public Integer getMediaID() {
	return mediaID;
}

/**
 * @param mediaID the mediaID to set
 */
public void setMediaID(Integer mediaID) {
	this.mediaID = mediaID;
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
 * @return the mediaFilePath
 */
public String getMediaFilePath() {
	return mediaFilePath;
}

/**
 * @param mediaFilePath the mediaFilePath to set
 */
public void setMediaFilePath(String mediaFilePath) {
	this.mediaFilePath = mediaFilePath;
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
 * @return the mediaFileSize
 */
public String getMediaFileSize() {
	return mediaFileSize;
}

/**
 * @param mediaFileSize the mediaFileSize to set
 */
public void setMediaFileSize(String mediaFileSize) {
	this.mediaFileSize = mediaFileSize;
}

/**
 * @return the mediaContentType
 */
public String getMediaContentType() {
	return mediaContentType;
}

/**
 * @param mediaContentType the mediaContentType to set
 */
public void setMediaContentType(String mediaContentType) {
	this.mediaContentType = mediaContentType;
}

/**
 * @return the fileData
 */
public CommonsMultipartFile getFileData() {
	return fileData;
}

/**
 * @param fileData the fileData to set
 */
public void setFileData(CommonsMultipartFile fileData) {
	this.fileData = fileData;
}

/** @pdGenerated default parent getter */
   public MediaType getMediaType() {
      return mediaType;
   }
   
   /** @pdGenerated default parent setter
     * @param newMediaType */
   public void setMediaType(MediaType newMediaType) {
      this.mediaType = newMediaType;
   }

}