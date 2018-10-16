package com.revature.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.repositories.ReviewRepo;

@Service
@Transactional
public class ReviewService {

	@Autowired
	private ReviewRepo repo;
}
