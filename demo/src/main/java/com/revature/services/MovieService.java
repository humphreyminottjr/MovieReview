package com.revature.services;


import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.revature.repositories.MoviesRepo;

@Service
@Transactional
public class MovieService {
	
	@Autowired
	private MoviesRepo repo;

}
