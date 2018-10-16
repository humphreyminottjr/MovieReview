package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.CommentsService;

@CrossOrigin
@RestController
public class CommentsCtrl {
	
	@Autowired
	private CommentsService commentsService;

}
