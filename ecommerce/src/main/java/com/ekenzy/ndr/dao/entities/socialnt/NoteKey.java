package com.ekenzy.ndr.dao.entities.socialnt;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NoteKey  implements Serializable {

	@Column(name="quiNote")
	private Long quiNote ;
	
	@Column(name="notee")
	private Long notee ;

	public Long getQuiNote() {
		return quiNote;
	}

	public void setQuiNote(Long quiNote) {
		this.quiNote = quiNote;
	}

	public Long getNotee() {
		return notee;
	}

	public void setNotee(Long notee) {
		this.notee = notee;
	}

	public NoteKey(Long quiNote, Long notee) {
		super();
		this.quiNote = quiNote;
		this.notee = notee;
	}

	public NoteKey() {
		super();
	}
	
	public boolean equals(Object other) {
        if (this == other) return true;
        if ( !(other instanceof NoteKey) ) return false;

        final NoteKey NKey = (NoteKey) other;

        if ( !NKey.getQuiNote().equals( getNotee() )  &&  !NKey.getNotee().equals( getQuiNote() )) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = getQuiNote().hashCode();
        result = result + getNotee().hashCode() ;
        return result;
    }
	
	

}
