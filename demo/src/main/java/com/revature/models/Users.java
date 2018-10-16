package com.revature.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="USERS")
public class Users implements Serializable {
	
	@Id
	@Column(name="USER_ID")
	@SequenceGenerator(name = "INCREMENTOR", sequenceName="INCREMENTOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INCREMENTOR")
	private int userId;
	
	@Column(name="FNAME")
	private String fname;
	
	@Column(name="LNAME")
	private String lname;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private Set<Review> reviews = new HashSet<>();
	
	@OneToMany(mappedBy="commentUser", fetch=FetchType.LAZY)
	private Set<Comments> comments = new HashSet<>();
	
	@OneToMany(mappedBy="usersBookmark", fetch=FetchType.EAGER)
	private Set<Bookmarks> bookmarks = new HashSet<>();

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userId, String fname, String lname, String email, String username, String password,
			Set<Review> reviews, Set<Comments> comments, Set<Bookmarks> bookmarks) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.reviews = reviews;
		this.comments = comments;
		this.bookmarks = bookmarks;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	public Set<Comments> getComments() {
		return comments;
	}

	public void setComments(Set<Comments> comments) {
		this.comments = comments;
	}

	public Set<Bookmarks> getBookmarks() {
		return bookmarks;
	}

	public void setBookmarks(Set<Bookmarks> bookmarks) {
		this.bookmarks = bookmarks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookmarks == null) ? 0 : bookmarks.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((reviews == null) ? 0 : reviews.hashCode());
		result = prime * result + userId;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Users other = (Users) obj;
		if (bookmarks == null) {
			if (other.bookmarks != null)
				return false;
		} else if (!bookmarks.equals(other.bookmarks))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (reviews == null) {
			if (other.reviews != null)
				return false;
		} else if (!reviews.equals(other.reviews))
			return false;
		if (userId != other.userId)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", username="
				+ username + ", password=" + password + ", reviews=" + reviews + ", comments=" + comments
				+ ", bookmarks=" + bookmarks + "]";
	}
	

}

