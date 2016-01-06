package com.ekenzy.ndr.dao.entities.socialnt;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ekenzy.ndr.dao.entities.Entreprise;

@Entity
public class Note {

	@EmbeddedId
	private NoteKey notekey ;
	
	private double note ;
	
	@ManyToOne
	@JoinColumn(name="quiNote", insertable = false, updatable = false)
	private Entreprise quiNote ;
	
	@ManyToOne
	@JoinColumn(name="notee", insertable = false, updatable = false)
	private Entreprise notee ;

	public NoteKey getNotekey() {
		return notekey;
	}

	public void setNotekey(NoteKey notekey) {
		this.notekey = notekey;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public Entreprise getQuiNote() {
		return quiNote;
	}

	public void setQuiNote(Entreprise quiNote) {
		this.quiNote = quiNote;
	}

	public Entreprise getNotee() {
		return notee;
	}

	public void setNotee(Entreprise notee) {
		this.notee = notee;
	}

	public Note( double note, Entreprise quiNote,
			Entreprise notee) {
		super();
		this.note = note;
		this.quiNote = quiNote;
		this.notee = notee;
	}

	public Note() {
		super();
	}
	
	
	
	

}
