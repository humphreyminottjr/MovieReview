package com.revature.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Bookmarks;
import com.revature.repositories.BookmarksRepo;

/**
 * This class is the middleman between the ctrl and the repo. The methods of this class
 * will be called in the ctrl.
 * @author Tosino
 *
 */

@Service
@Transactional
public class BookmarksService {
	
	@Autowired
	private BookmarksRepo repo;
	
	/**
	 * 
	 * @param id
	 * @return This method is returning all the bookmarks associated with a user
	 */
	public List<Bookmarks> getBookmarksByUserid(int id){
		return repo.findByuserId(id);
	}
	
	/**
	 * 
	 * @param bookmarks
	 * @return This method is returning a bookmark that's created
	 */
	public Bookmarks createBookmarks(Bookmarks bookmarks) {
		return repo.save(bookmarks);
	}
	
	/**
	 * This method is deleting bookmarks by their id
	 * @param id
	 */
	public void deleteBookmarkById (int id) {
		repo.deleteById(id);
	}

}
