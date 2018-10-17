package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Comments;

@Repository
@Transactional
public interface CommentsRepo extends JpaRepository<Comments, Integer> {
	
	List<Comments> findBycreatorId(int creatorId);

}
