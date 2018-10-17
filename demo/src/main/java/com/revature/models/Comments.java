package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Comments")
public class Comments implements Serializable {
	
	@Id
	@Column(name="COMMENT_ID")
	@SequenceGenerator(name = "INCREMENTOR", sequenceName="INCREMENTOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INCREMENTOR")
	private int commentId;
	
	@Column(name="CREATOR_ID")
	private int creatorId;
	
	@Column(name="REVIEW_ID")
	private int reviewId;
	
	@Column(name="COMMENT_BODY")
	private String commentBody;
	
	@ManyToOne
	@JoinColumn(name="CREATOR_ID", insertable= false, updatable= false)
	private Users commentUser;
	
	@ManyToOne
	@JoinColumn(name="REVIEW_ID", insertable= false, updatable= false)
	private Review review;
	
	public Comments () {}

	public Comments(int commentId, int creatorId, int reviewId, String commentBody, Users commentUser, Review review) {
		super();
		this.commentId = commentId;
		this.creatorId = creatorId;
		this.reviewId = reviewId;
		this.commentBody = commentBody;
		this.commentUser = commentUser;
		this.review = review;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getCommentBody() {
		return commentBody;
	}

	public void setCommentBody(String commentBody) {
		this.commentBody = commentBody;
	}

	public Users getCommentUser() {
		return commentUser;
	}

	public void setCommentUser(Users commentUser) {
		this.commentUser = commentUser;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commentBody == null) ? 0 : commentBody.hashCode());
		result = prime * result + commentId;
		result = prime * result + ((commentUser == null) ? 0 : commentUser.hashCode());
		result = prime * result + creatorId;
		result = prime * result + ((review == null) ? 0 : review.hashCode());
		result = prime * result + reviewId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comments other = (Comments) obj;
		if (commentBody == null) {
			if (other.commentBody != null)
				return false;
		} else if (!commentBody.equals(other.commentBody))
			return false;
		if (commentId != other.commentId)
			return false;
		if (commentUser == null) {
			if (other.commentUser != null)
				return false;
		} else if (!commentUser.equals(other.commentUser))
			return false;
		if (creatorId != other.creatorId)
			return false;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		if (reviewId != other.reviewId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comments [commentId=" + commentId + ", creatorId=" + creatorId + ", reviewId=" + reviewId
				+ ", commentBody=" + commentBody + ", commentUser=" + commentUser + ", review=" + review + "]";
	}


}
