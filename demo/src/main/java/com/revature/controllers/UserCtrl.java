package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Users;
import com.revature.services.UserService;

@CrossOrigin
@RestController
public class UserCtrl {
	
	private UserService userService;

	@GetMapping(value="/users")
	public ResponseEntity<List<Users>> getAllUsers(){
		List<Users> users = userService.getAllUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@PostMapping(value="/login")
	public ResponseEntity<Users> getUserByUsernameAndPassword(@RequestBody() Users user){
		Users loginUser = userService.getUserByUsernameAndPassword(user.getUsername(),user.getPassword());
		return new ResponseEntity<>(loginUser,HttpStatus.OK);
	}
	
	@GetMapping(value="/users/{id}")
	public ResponseEntity<Optional<Users>> getUserById(@PathVariable("id") int id){
		Optional<Users> user = userService.getUserById(id);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
	@PostMapping(value="/users")
	public ResponseEntity<Users> createUser(@RequestBody() Users user){
		Users newUser = userService.createUser(user);
		return new ResponseEntity<>(newUser,HttpStatus.OK);
	}
}
