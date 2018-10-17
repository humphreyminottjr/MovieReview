package com.revature.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Movies;
import com.revature.repositories.MoviesRepo;

@Service
@Transactional
public class MovieService {
	
	@Autowired
	private MoviesRepo repo;
	
	public List<Movies> findAllMovies(){
		return repo.findAll();
	}
	
	public Movies createMovie(Movies movie) {
		return repo.save(movie);
	}
	
	public Optional<Movies> getMovieById(int id) {
		return repo.findById(id);
	}

}
