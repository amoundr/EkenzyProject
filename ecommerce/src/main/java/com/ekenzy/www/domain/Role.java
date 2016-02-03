package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
@Entity 
//@javax.xml.bind.annotation.XmlRootElement(name="role")
//@javax.xml.bind.annotation.XmlAccessorType(value=FIELD)
public class Role implements Serializable {
   @Id 
   @GeneratedValue
   private Integer roleID;
   private String authority;
   /** @pdRoleInfo migr=no name=User assc=association29 coll=Set impl=HashSet mult=0..* */
   @ManyToMany(mappedBy = "roles")
   private Set<User> user;
   
   /**
 * @return the roleID
 */
public Integer getRoleID() {
	return roleID;
}

/**
 * @param roleID the roleID to set
 */
public void setRoleID(Integer roleID) {
	this.roleID = roleID;
}

/**
 * @return the authority
 */
public String getAuthority() {
	return authority;
}

/**
 * @param authority the authority to set
 */
public void setAuthority(String authority) {
	this.authority = authority;
}

/** @pdGenerated default getter */
   public Set<User> getUser() {
      if (user == null)
         user = new HashSet<User>();
      return user;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorUser() {
      if (user == null)
         user = new HashSet<User>();
      return user.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUser */
   public void setUser(Set<User> newUser) {
      removeAllUser();
      for (Iterator iter = newUser.iterator(); iter.hasNext();)
         addUser((User)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUser */
   public void addUser(User newUser) {
      if (newUser == null)
         return;
      if (this.user == null)
         this.user = new HashSet<User>();
      if (!this.user.contains(newUser))
      {
         this.user.add(newUser);
         newUser.addRole(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldUser */
   public void removeUser(User oldUser) {
      if (oldUser == null)
         return;
      if (this.user != null)
         if (this.user.contains(oldUser))
         {
            this.user.remove(oldUser);
            oldUser.removeRole(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUser() {
      if (user != null)
      {
         User oldUser;
         for (Iterator iter = getIteratorUser(); iter.hasNext();)
         {
            oldUser = (User)iter.next();
            iter.remove();
            oldUser.removeRole(this);
         }
      }
   }

}