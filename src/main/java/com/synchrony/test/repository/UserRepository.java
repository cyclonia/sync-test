package com.synchrony.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synchrony.test.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserName(String username);

}
