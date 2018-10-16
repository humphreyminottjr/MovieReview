package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Users;

@Repository
@Transactional
public interface UserRepo extends JpaRepository<Users, Integer>{

}
