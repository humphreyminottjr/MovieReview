package com.revature.services;


import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.revature.repositories.CommentsRepo;


@Service
@Transactional
public class CommentsService {
	
	
	@Autowired
	private CommentsRepo repo;

}
