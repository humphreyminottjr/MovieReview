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
@Table(name="REVIEW")
public class Review implements Serializable{
	
	@Id
	@Column(name="REVIEW_ID")
	@SequenceGenerator(name = "INCREMENTOR", sequenceName="INCREMENTOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INCREMENTOR")
	private int reviewId;
	
	@Column(name="CREATOR_ID")
	private int creatorId;
	
	@Column(name="MOVIE_ID")
	private int movieId;
	
	@Column(name="REVIEW_TITLE")
	private String reviewTitle;
	
	@Column(name="REVIEW_BODY")
	private String reviewBody;
	
	@ManyToOne
	@JoinColumn(name="CREATOR_ID", insertable= false, updatable= false)
	private Users user;
	
	@ManyToOne
	@JoinColumn(name="MOVIE_ID", insertable= false, updatable= false)
	private Movies movie;
	
	public Review () {}

	public Review(int reviewId, int creatorId, int movieId, String reviewTitle, String reviewBody, Users user,
			Movies movie) {
		super();
		this.reviewId = reviewId;
		this.creatorId = creatorId;
		this.movieId = movieId;
		this.reviewTitle = reviewTitle;
		this.reviewBody = reviewBody;
		this.user = user;
		this.movie = movie;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Movies getMovie() {
		return movie;
	}

	public void setMovie(Movies movie) {
		this.movie = movie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + creatorId;
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + movieId;
		result = prime * result + ((reviewBody == null) ? 0 : reviewBody.hashCode());
		result = prime * result + reviewId;
		result = prime * result + ((reviewTitle == null) ? 0 : reviewTitle.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Review other = (Review) obj;
		if (creatorId != other.creatorId)
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (movieId != other.movieId)
			return false;
		if (reviewBody == null) {
			if (other.reviewBody != null)
				return false;
		} else if (!reviewBody.equals(other.reviewBody))
			return false;
		if (reviewId != other.reviewId)
			return false;
		if (reviewTitle == null) {
			if (other.reviewTitle != null)
				return false;
		} else if (!reviewTitle.equals(other.reviewTitle))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", creatorId=" + creatorId + ", movieId=" + movieId + ", reviewTitle="
				+ reviewTitle + ", reviewBody=" + reviewBody + ", user=" + user + ", movie=" + movie + "]";
	}

	

}
