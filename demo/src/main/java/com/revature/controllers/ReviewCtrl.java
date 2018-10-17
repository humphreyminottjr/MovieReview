package com.revature.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.revature.models.Review;
import com.revature.services.ReviewService;

@CrossOrigin
@RestController
public class ReviewCtrl {
	
	@Autowired
	private ReviewService reviewService;
	
	@GetMapping(value="/reviews")
	public ResponseEntity<List<Review>> getAllReviews(){
		List<Review> reviews = reviewService.getAllReviews();
		return new ResponseEntity<>(reviews,HttpStatus.OK);
	}
	
	@GetMapping(value="/reviews/{id}")
	public ResponseEntity<Optional<Review>> getReviewById(@PathVariable("id") int id){
		Optional<Review> review = reviewService.getReviewById(id);
		return new ResponseEntity<>(review,HttpStatus.OK);
	}
	
	@GetMapping(value="/reviews/users/{id}")
	public ResponseEntity<List<Review>> getAllReviewsByCreatorId(int creator_id){
		List<Review> reviews = reviewService.getAllReviewsByCreatorId(creator_id);
		return new ResponseEntity<>(reviews,HttpStatus.OK);
	}
	
	@PostMapping(value="/reviews")
	public ResponseEntity<Review> createReview(@RequestBody() Review review){
		Review createdReview = reviewService.createReview(review);
		return new ResponseEntity<>(createdReview,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/reviews/{id}")
	public void deleteReviewById(@PathVariable("id") int id) {
		reviewService.deleteReviewById(id);
	}

}
