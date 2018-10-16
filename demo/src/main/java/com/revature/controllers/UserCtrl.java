package com.revature.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.UserService;

@CrossOrigin
@RestController
public class UserCtrl {
	
	private UserService userService;

}
