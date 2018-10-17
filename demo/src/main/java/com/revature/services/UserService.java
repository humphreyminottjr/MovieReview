package com.revature.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Users;
import com.revature.repositories.UserRepo;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public List<Users> getAllUsers(){
		return repo.findAll();
	}
	
	public Optional<Users> getUserById(int id) {
		return repo.findById(id);
	}
	
	public Users createUser(Users user) {
		return repo.save(user);
	}
	
	public Users getUserByUsernameAndPassword(String username, String password) {
		return repo.findByusernameAndPassword(username, password);
	}
	
	
}
