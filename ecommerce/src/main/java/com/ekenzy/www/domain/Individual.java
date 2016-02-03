package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

//@XmlRootElement 
@SuppressWarnings("serial")
//@XmlAccessorType(value=FIELD)
@Entity
@DiscriminatorValue("I")
@PrimaryKeyJoinColumn(name = "userID")
public class Individual extends User implements Serializable{
   @GeneratedValue
   private String profileID;
   private String uuid;
   private String gender;
   private String title;
   private String specialty;
   private Date birthDate;
   
   /** @pdRoleInfo migr=no name=Rating assc=association8 mult=0..* side=A */
   @OneToMany(mappedBy="individual",fetch=FetchType.LAZY)
   private Set<Rating> rating = new HashSet<Rating>();
   /** @pdRoleInfo migr=no name=Purchase assc=association11 mult=0..* side=A */
   @OneToMany(mappedBy="customer",fetch=FetchType.LAZY)
   private Collection<Purchase> purchase = new HashSet<Purchase>();
   /** @pdRoleInfo migr=no name=Comment assc=association42 coll=List impl=ArrayList mult=0..* side=A */
   @OneToMany(mappedBy="individual",fetch=FetchType.LAZY)
   private List<Comment> comment;

/**
 * @return the profileID
 */
public String getProfileID() {
	return profileID;
}

/**
 * @param profileID the profileID to set
 */
public void setProfileID(String profileID) {
	this.profileID = profileID;
}

/**
 * @return the uuid
 */
public String getUuid() {
	return uuid;
}

/**
 * @param uuid the uuid to set
 */
public void setUuid(String uuid) {
	this.uuid = uuid;
}

/**
 * @return the gender
 */
public String getGender() {
	return gender;
}

/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
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
 * @return the specialty
 */
public String getSpecialty() {
	return specialty;
}

/**
 * @param specialty the specialty to set
 */
public void setSpecialty(String specialty) {
	this.specialty = specialty;
}

/**
 * @return the birthDate
 */
public Date getBirthDate() {
	return birthDate;
}

/**
 * @param birthDate the birthDate to set
 */
public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

/** @pdGenerated default getter */
   public Set<Rating> getRating() {
      return rating;
   }
   
   /** @pdGenerated default setter
     * @param newRating */
   public void setRating(Set<Rating> newRating) {
      this.rating = newRating;
   }
   /** @pdGenerated default getter */
   public Collection<Purchase> getPurchase() {
      return purchase;
   }
   
   /** @pdGenerated default setter
     * @param newPurchase */
   public void setPurchase(Collection<Purchase> newPurchase) {
      this.purchase = newPurchase;
   }
   /** @pdGenerated default getter */
   public List<Comment> getComment() {
      if (comment == null)
         comment = new ArrayList<Comment>();
      return comment;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorComment() {
      if (comment == null)
         comment = new ArrayList<Comment>();
      return comment.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newComment */
   public void setComment(List<Comment> newComment) {
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
         this.comment = new ArrayList<Comment>();
      if (!this.comment.contains(newComment))
      {
         this.comment.add(newComment);
         newComment.setIndividual(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldComment */
   public void removeComment(Comment oldComment) {
      if (oldComment == null)
         return;
      if (this.comment != null)
         if (this.comment.contains(oldComment))
         {
            this.comment.remove(oldComment);
            oldComment.setIndividual((Individual)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllComment() {
      if (comment != null)
      {
         Comment oldComment;
         for (Iterator iter = getIteratorComment(); iter.hasNext();)
         {
            oldComment = (Comment)iter.next();
            iter.remove();
            oldComment.setIndividual((Individual)null);
         }
      }
   }

}