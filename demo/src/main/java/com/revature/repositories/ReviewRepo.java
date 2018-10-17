package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Review;

@Repository
@Transactional
public interface ReviewRepo extends JpaRepository<Review, Integer>{

	List<Review> findAllBycreator_id(int creator_id);
}
