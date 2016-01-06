package com.ekenzy.ndr.dao.entities.socialnt;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.ekenzy.ndr.dao.entities.Entreprise;


@Embeddable
public class AbonnementKey implements Serializable {
	
	@Column(name="idAbonnee")
	private Long abonnee ;
	
	@Column(name="idAbonne")
	private Long abonne ;

	public Long getAbonnee() {
		return abonnee;
	}

	public void setAbonnee(Long abonnee) {
		this.abonnee = abonnee;
	}

	public Long getAbonne() {
		return abonne;
	}

	public void setAbonne(Long abonne) {
		this.abonne = abonne;
	}

	public AbonnementKey(Long abonnee, Long abonne) {
		super();
		this.abonnee = abonnee;
		this.abonne = abonne;
	}

	public AbonnementKey() {
		super();
	}
	
	public boolean equals(Object other) {
        if (this == other) return true;
        if ( !(other instanceof AbonnementKey) ) return false;

        final AbonnementKey AbonKey = (AbonnementKey) other;

        if ( !AbonKey.getAbonne().equals( getAbonne() )  &&  !AbonKey.getAbonnee().equals( getAbonnee() )) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = getAbonne().hashCode();
        result = result + getAbonnee().hashCode() ;
        return result;
    }
	/*

	@Override
    public int hashCode() {
        HashCodeBuilder hcb = new HashCodeBuilder();
        hcb.append(id);
        return hcb.toHashCode();
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entreprise)) {
            return false;
        }
        Entreprise that = (Entreprise) obj;
        EqualsBuilder eb = new EqualsBuilder();
        eb.append(id, that.id);
        return eb.isEquals();
    }
*/


}
