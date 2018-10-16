package com.revature.services;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.repositories.UserRepo;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepo repo;
}
