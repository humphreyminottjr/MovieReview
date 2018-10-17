package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Bookmarks;
/**
 * This class acts as the dao therefore it communicates with the database. It uses
 * java objects where you can perform basic crud operations
 * @author Tosino
 *
 */


@Repository
@Transactional
public interface BookmarksRepo extends JpaRepository<Bookmarks, Integer>{

	List<Bookmarks> findByuserId(int userId);
	
	
}
