package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.MovieService;

@CrossOrigin
@RestController
public class MoviesCtrl {
	
	@Autowired
	private MovieService movieService;

}
