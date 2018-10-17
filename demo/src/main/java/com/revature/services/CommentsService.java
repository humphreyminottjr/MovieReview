package com.revature.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Comments;
import com.revature.repositories.CommentsRepo;


@Service
@Transactional
public class CommentsService {
	
	
	@Autowired
	private CommentsRepo repo;
	
	public List<Comments> getCommentsByCreatorId (int id) {
		return repo.findBycreatorId(id);
	}

	public Comments createComment (Comments comments) {
		return repo.save(comments);
	}
	
	public void deleteCommentById (int id) {
		repo.deleteById(id);
	}
}