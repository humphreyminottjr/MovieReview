package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Movies;
import com.revature.services.MovieService;

@CrossOrigin
@RestController
public class MoviesCtrl {
	
	@Autowired
	private MovieService movieService;
	
	
	@GetMapping(value="/movies")
	public ResponseEntity<List<Movies>> getAllMovies(){
		List<Movies> movies = movieService.findAllMovies();
		return new ResponseEntity<>(movies,HttpStatus.OK);
	}
	
	@GetMapping(value="/movies/{id}")
	public ResponseEntity<Optional<Movies>> getMovieById(@PathVariable("id") int id){
		Optional<Movies> movie = movieService.getMovieById(id);
		if(movie == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(movie,HttpStatus.OK);
	}
	
	@PostMapping(value="/movies")
	public ResponseEntity<Movies> createMovie(@RequestBody() Movies movie){
		Movies createdMovie = movieService.createMovie(movie);
		return new ResponseEntity<>(createdMovie,HttpStatus.CREATED);
	}

}
