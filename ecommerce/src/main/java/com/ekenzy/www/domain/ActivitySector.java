package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;

//@javax.xml.bind.annotation.XmlRootElement 
//@javax.xml.bind.annotation.XmlAccessorType(value=FIELD)
@SuppressWarnings("serial")
@Entity
public class ActivitySector implements Serializable {
	@Id
	@GeneratedValue
	private Integer activitySectorID;
	private String defaultName;

	/** @pdRoleInfo migr=no name=ActivitySector assc=association43 coll=Set impl=HashSet mult=0..* */
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "activitySectorA")
	private Set<ActivitySector> activitySector;
	
	/** @pdRoleInfo migr=no name=ActivitySector assc=association43 mult=0..1  side=A */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parentASID", referencedColumnName = "activitySectorID", nullable = true)
	private ActivitySector activitySectorA;
	
	/** @pdRoleInfo migr=no name=CategoriesLocalization assc=association44 coll=Set impl=HashSet mult=1..* */
	@OneToMany(cascade = CascadeType.ALL)
	private Set<CategoriesLocalization> categoriesLocalization;

	/**
	 * @return the activitySectorID
	 */
	public synchronized Integer getActivitySectorID() {
		return activitySectorID;
	}

	/**
	 * @param activitySectorID
	 *            the activitySectorID to set
	 */
	public synchronized void setActivitySectorID(Integer activitySectorID) {
		this.activitySectorID = activitySectorID;
	}

	/**
	 * @return the defaultName
	 */
	public synchronized String getDefaultName() {
		return defaultName;
	}

	/**
	 * @param defaultName
	 *            the defaultName to set
	 */
	public synchronized void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}

	/**
	 * @pdGenerated default getter
	 */
	public Set<ActivitySector> getActivitySector() {
		if (activitySector == null)
			activitySector = new HashSet<ActivitySector>();
		return activitySector;
	}

	/**
	 * @pdGenerated default iterator getter
	 */
	public Iterator getIteratorActivitySector() {
		if (activitySector == null)
			activitySector = new HashSet<ActivitySector>();
		return activitySector.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newActivitySector
	 */
	public void setActivitySector(Set<ActivitySector> newActivitySector) {
		removeAllActivitySector();
		for (Iterator iter = newActivitySector.iterator(); iter.hasNext();)
			addActivitySector((ActivitySector) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newActivitySector
	 */
	public void addActivitySector(ActivitySector newActivitySector) {
		if (newActivitySector == null)
			return;
		if (this.activitySector == null)
			this.activitySector = new HashSet<ActivitySector>();
		if (!this.activitySector.contains(newActivitySector)) {
			this.activitySector.add(newActivitySector);
			newActivitySector.setActivitySectorA(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldActivitySector
	 */
	public void removeActivitySector(ActivitySector oldActivitySector) {
		if (oldActivitySector == null)
			return;
		if (this.activitySector != null)
			if (this.activitySector.contains(oldActivitySector)) {
				this.activitySector.remove(oldActivitySector);
				oldActivitySector.setActivitySectorA((ActivitySector) null);
			}
	}

	/**
	 * @pdGenerated default removeAll
	 */
	public void removeAllActivitySector() {
		if (activitySector != null) {
			ActivitySector oldActivitySector;
			for (Iterator iter = getIteratorActivitySector(); iter.hasNext();) {
				oldActivitySector = (ActivitySector) iter.next();
				iter.remove();
				oldActivitySector.setActivitySectorA((ActivitySector) null);
			}
		}
	}

	/**
	 * @pdGenerated default getter
	 */
	public Set<CategoriesLocalization> getCategoriesLocalization() {
		if (categoriesLocalization == null)
			categoriesLocalization = new HashSet<CategoriesLocalization>();
		return categoriesLocalization;
	}

	/**
	 * @pdGenerated default iterator getter
	 */
	public Iterator getIteratorCategoriesLocalization() {
		if (categoriesLocalization == null)
			categoriesLocalization = new HashSet<CategoriesLocalization>();
		return categoriesLocalization.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newCategoriesLocalization
	 */
	public void setCategoriesLocalization(Set<CategoriesLocalization> newCategoriesLocalization) {
		removeAllCategoriesLocalization();
		for (Iterator iter = newCategoriesLocalization.iterator(); iter.hasNext();)
			addCategoriesLocalization((CategoriesLocalization) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newCategoriesLocalization
	 */
	public void addCategoriesLocalization(CategoriesLocalization newCategoriesLocalization) {
		if (newCategoriesLocalization == null)
			return;
		if (this.categoriesLocalization == null)
			this.categoriesLocalization = new HashSet<CategoriesLocalization>();
		if (!this.categoriesLocalization.contains(newCategoriesLocalization))
			this.categoriesLocalization.add(newCategoriesLocalization);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldCategoriesLocalization
	 */
	public void removeCategoriesLocalization(CategoriesLocalization oldCategoriesLocalization) {
		if (oldCategoriesLocalization == null)
			return;
		if (this.categoriesLocalization != null)
			if (this.categoriesLocalization.contains(oldCategoriesLocalization))
				this.categoriesLocalization.remove(oldCategoriesLocalization);
	}

	/**
	 * @pdGenerated default removeAll
	 */
	public void removeAllCategoriesLocalization() {
		if (categoriesLocalization != null)
			categoriesLocalization.clear();
	}

	/**
	 * @pdGenerated default parent getter
	 */
	public ActivitySector getActivitySectorA() {
		return activitySectorA;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newActivitySector
	 */
	public void setActivitySectorA(ActivitySector newActivitySector) {
		if (this.activitySectorA == null || !this.activitySectorA.equals(newActivitySector)) {
			if (this.activitySectorA != null) {
				ActivitySector oldActivitySector = this.activitySectorA;
				this.activitySectorA = null;
				oldActivitySector.removeActivitySector(this);
			}
			if (newActivitySector != null) {
				this.activitySectorA = newActivitySector;
				this.activitySectorA.addActivitySector(this);
			}
		}
	}

}