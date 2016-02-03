package com.ekenzy.www.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Comment implements Serializable{
	@Id
	@GeneratedValue
	private Integer commentID;
	@Column(columnDefinition = "TEXT")
	private String text;
	private java.util.Date commentDate;
	/**
	 * @pdRoleInfo migr=no name=Comment assc=association40 coll=Set impl=HashSet
	 *             mult=0..*
	 */
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "comment")
	private Set<Comment> comments;

	/**
	 * @pdRoleInfo migr=no name=Comment assc=association40 mult=0..1 side=A
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parentCID", referencedColumnName = "commentID", nullable = true)
	private Comment comment;
	private Boolean buyer;
	/**
	 * @pdRoleInfo migr=yes name=Individual assc=association42 mult=1..1
	 */
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "individualID", referencedColumnName = "individualID")
	private Individual individual;
	private Boolean published;
	private String author;

	/**
	 * @return the commentID
	 */
	public Integer getCommentID() {
		return commentID;
	}

	/**
	 * @param commentID the commentID to set
	 */
	public void setCommentID(Integer commentID) {
		this.commentID = commentID;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the commentDate
	 */
	public java.util.Date getCommentDate() {
		return commentDate;
	}

	/**
	 * @param commentDate the commentDate to set
	 */
	public void setCommentDate(java.util.Date commentDate) {
		this.commentDate = commentDate;
	}

	/**
	 * @return the comments
	 */
	public Set<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * @return the buyer
	 */
	public Boolean getBuyer() {
		return buyer;
	}

	/**
	 * @param buyer the buyer to set
	 */
	public void setBuyer(Boolean buyer) {
		this.buyer = buyer;
	}

	/**
	 * @return the published
	 */
	public Boolean getPublished() {
		return published;
	}

	/**
	 * @param published the published to set
	 */
	public void setPublished(Boolean published) {
		this.published = published;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @pdGenerated default parent getter
	 */
	public Comment getComment() {
		return comment;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newComment
	 */
	public void setComment(Comment newComment) {
		this.comment = newComment;
	}

	/**
	 * @pdGenerated default parent getter
	 */
	public Individual getIndividual() {
		return individual;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newIndividual
	 */
	public void setIndividual(Individual newIndividual) {
		if (this.individual == null || !this.individual.equals(newIndividual)) {
			if (this.individual != null) {
				Individual oldIndividual = this.individual;
				this.individual = null;
				oldIndividual.removeComment(this);
			}
			if (newIndividual != null) {
				this.individual = newIndividual;
				this.individual.addComment(this);
			}
		}
	}

}