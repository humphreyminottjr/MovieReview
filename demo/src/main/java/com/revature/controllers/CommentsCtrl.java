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

import com.revature.models.Comments;
import com.revature.services.CommentsService;

@CrossOrigin
@RestController
public class CommentsCtrl {
	
	@Autowired
	private CommentsService commentsService;

	@GetMapping(value="/comments/users/{id}")
	public ResponseEntity<List<Comments>> getCommentsByCreatorId(@PathVariable("id") int id){
		List<Comments> creatorIdComments = commentsService.getCommentsByCreatorId(id);
		if(creatorIdComments == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} return new ResponseEntity<>(creatorIdComments,HttpStatus.OK);
	}
	
	@PostMapping(value="/comments")
	public ResponseEntity<Comments> createComments(@RequestBody() Comments comments){
		Comments createComment = commentsService.createComment(comments);
			return new ResponseEntity<>(createComment, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value="/comments/{id}")
	public void deleteCommentById(@PathVariable("id") int id){
		commentsService.deleteCommentById(id);
	}
}
