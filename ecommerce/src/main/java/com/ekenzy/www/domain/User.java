package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

//@XmlRootElement
//@XmlAccessorType(value=FIELD)
@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="USER_CLASS", discriminatorType = DiscriminatorType.CHAR)
public class User implements Serializable{
   @Id 
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer userID;
   private String userName;
   private String firstName;
   private String lastName;
   private String password;
   private Boolean enabled;
   @Transient
   private String actualPassword;
   private String phone;
   private String adress;
   private String zipCode;
   private String email;
   private String ipAddress;
   private String code;
   private Date connectedAt;
   private Date createdAt;
   private Date updatedAt;
   private String forgotPasswordToken;
   private Integer lastRegistrationStep;
   /** @pdOid @pdRoleInfo migr=yes name=UserType assc=association38 */
   @Enumerated(EnumType.STRING)
   private UserType userType;
   
   /** @pdRoleInfo migr=no name=Media assc=association39 mult=0..1 */
   @OneToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
   private Collection<Media> logoAvatarMedia = new HashSet<Media>();
   
   /** @pdRoleInfo migr=no name=City assc=association30 mult=0..1 */
   @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "cityID", referencedColumnName = "cityID")
   private City city;
   /** @pdRoleInfo migr=no name=Country assc=association33 mult=0..1 */
   @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "countryID", referencedColumnName = "countryID")
   private Country country;
   /** @pdRoleInfo migr=no name=Role assc=association29 coll=Set impl=HashSet mult=1..* side=A */
   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(name = "role", joinColumns = { @JoinColumn(name = "userID", referencedColumnName = "userID") }, inverseJoinColumns = { @JoinColumn(name = "roleID", referencedColumnName = "roleID") })
   private Set<Role> roles;
   
   /**
 * @return the userID
 */
public Integer getUserID() {
	return userID;
}

/**
 * @param userID the userID to set
 */
public void setUserID(Integer userID) {
	this.userID = userID;
}

/**
 * @return the userName
 */
public String getUserName() {
	return userName;
}

/**
 * @param userName the userName to set
 */
public void setUserName(String userName) {
	this.userName = userName;
}

/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @return the password
 */
public String getPassword() {
	return password;
}

/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}

/**
 * @return the enabled
 */
public Boolean getEnabled() {
	return enabled;
}

/**
 * @param enabled the enabled to set
 */
public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
}

/**
 * @return the actualPassword
 */
public String getActualPassword() {
	return actualPassword;
}

/**
 * @param actualPassword the actualPassword to set
 */
public void setActualPassword(String actualPassword) {
	this.actualPassword = actualPassword;
}

/**
 * @return the phone
 */
public String getPhone() {
	return phone;
}

/**
 * @param phone the phone to set
 */
public void setPhone(String phone) {
	this.phone = phone;
}

/**
 * @return the adress
 */
public String getAdress() {
	return adress;
}

/**
 * @param adress the adress to set
 */
public void setAdress(String adress) {
	this.adress = adress;
}

/**
 * @return the zipCode
 */
public String getZipCode() {
	return zipCode;
}

/**
 * @param zipCode the zipCode to set
 */
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * @return the ipAddress
 */
public String getIpAddress() {
	return ipAddress;
}

/**
 * @param ipAddress the ipAddress to set
 */
public void setIpAddress(String ipAddress) {
	this.ipAddress = ipAddress;
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
 * @return the connectedAt
 */
public Date getConnectedAt() {
	return connectedAt;
}

/**
 * @param connectedAt the connectedAt to set
 */
public void setConnectedAt(Date connectedAt) {
	this.connectedAt = connectedAt;
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
 * @return the forgotPasswordToken
 */
public String getForgotPasswordToken() {
	return forgotPasswordToken;
}

/**
 * @param forgotPasswordToken the forgotPasswordToken to set
 */
public void setForgotPasswordToken(String forgotPasswordToken) {
	this.forgotPasswordToken = forgotPasswordToken;
}

/**
 * @return the lastRegistrationStep
 */
public Integer getLastRegistrationStep() {
	return lastRegistrationStep;
}

/**
 * @param lastRegistrationStep the lastRegistrationStep to set
 */
public void setLastRegistrationStep(Integer lastRegistrationStep) {
	this.lastRegistrationStep = lastRegistrationStep;
}

/**
 * @return the roles
 */
public Set<Role> getRoles() {
	return roles;
}

/**
 * @param roles the roles to set
 */
public void setRoles(Set<Role> roles) {
	this.roles = roles;
}

/** @pdGenerated default parent getter */
   public UserType getUserType() {
      return userType;
   }
   
   /** @pdGenerated default parent setter
     * @param newUserType */
   public void setUserType(UserType newUserType) {
      this.userType = newUserType;
   }
   /** @pdGenerated default parent getter */
   public Collection<Media> getLogoAvatarMedia() {
      return logoAvatarMedia;
   }
   
   /** @pdGenerated default parent setter
     * @param newMedia */
   public void setLogoAvatarMedia(Collection<Media> newMedia) {
      this.logoAvatarMedia = newMedia;
   }   
   
   /** @pdGenerated default parent getter */
   public City getCity() {
      return city;
   }
   
   /** @pdGenerated default parent setter
     * @param newCity */
   public void setCity(City newCity) {
      this.city = newCity;
   }
   /** @pdGenerated default parent getter */
   public Country getCountry() {
      return country;
   }
   
   /** @pdGenerated default parent setter
     * @param newCountry */
   public void setCountry(Country newCountry) {
      this.country = newCountry;
   }
   /** @pdGenerated default getter */
   public Set<Role> getRole() {
      if (roles == null)
         roles = new HashSet<Role>();
      return roles;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorRole() {
      if (roles == null)
         roles = new HashSet<Role>();
      return roles.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRole */
   public void setRole(Set<Role> newRole) {
      removeAllRole();
      for (Iterator iter = newRole.iterator(); iter.hasNext();)
         addRole((Role)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRole */
   public void addRole(Role newRole) {
      if (newRole == null)
         return;
      if (this.roles == null)
         this.roles = new HashSet<Role>();
      if (!this.roles.contains(newRole))
      {
         this.roles.add(newRole);
         newRole.addUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldRole */
   public void removeRole(Role oldRole) {
      if (oldRole == null)
         return;
      if (this.roles != null)
         if (this.roles.contains(oldRole))
         {
            this.roles.remove(oldRole);
            oldRole.removeUser(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRole() {
      if (roles != null)
      {
         Role oldRole;
         for (Iterator iter = getIteratorRole(); iter.hasNext();)
         {
            oldRole = (Role)iter.next();
            iter.remove();
            oldRole.removeUser(this);
         }
      }
   }

}