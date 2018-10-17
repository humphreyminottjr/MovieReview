package com.revature.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.revature.repositories.BookmarksRepo;

@Service
@Transactional
public class BookmarksService {
	
	@Autowired
	private BookmarksRepo repo;

}
