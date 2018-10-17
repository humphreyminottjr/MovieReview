package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Bookmarks;
import com.revature.services.BookmarksService;

@CrossOrigin
@RestController
public class BookmarksCtrl {
	
	@Autowired
	private BookmarksService bkService;
	
	/**
	 * This method will get all bookmarks in the database by user id.
	 */
	@GetMapping(value="/bookmarks/users/{id}")
	public ResponseEntity<List<Bookmarks>> getBookmarksByUid(@PathVariable("id") int id){
		List<Bookmarks> userIdBookmarks = bkService.getBookmarksByUserid(id);
		if(userIdBookmarks == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} return new ResponseEntity<>(userIdBookmarks,HttpStatus.OK);
	}
	
	/**
	 * This method will create bookmarks in the database.
	 */
	@PostMapping(value="/bookmarks")
	public ResponseEntity<Bookmarks> createBookmarks(@RequestBody() Bookmarks bookmarks){
		Bookmarks createBookmarks = bkService.createBookmarks(bookmarks);
			return new ResponseEntity<>(createBookmarks, HttpStatus.CREATED);
	}
	
	/**
	 * This method will delete bookmarks in the database by bookmark id.
	 */
	@DeleteMapping(value="/bookmarks/{id}")
	public void deleteBookmarkById(@PathVariable("id") int id){
		bkService.deleteBookmarkById(id);
	}

}