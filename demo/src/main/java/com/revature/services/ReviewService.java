package com.revature.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Review;
import com.revature.repositories.ReviewRepo;

@Service
@Transactional
public class ReviewService {

	@Autowired
	private ReviewRepo repo;
	
	public List<Review> getAllReviews(){
		return repo.findAll();
	}
	
	public Optional<Review> getReviewById(int id) {
		return repo.findById(id);
	}
	
	public Review createReview(Review review) {
		return repo.save(review);
	}
	
	public void deleteReviewById(int id) {
		repo.deleteById(id);
	}
	
	public List<Review> getAllReviewsByCreatorId(int creator_id){
		return repo.findAllBycreator_id(creator_id);
	}
}
