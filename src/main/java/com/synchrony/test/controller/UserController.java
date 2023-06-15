package com.synchrony.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.synchrony.test.entity.User;
import com.synchrony.test.exception.UserAlreadyExistsException;
import com.synchrony.test.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

	/*
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 */

	@PostMapping("/register")
	public Boolean registerUser(@RequestBody User user) {

		// user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

		User saved = repository.findByUserName(user.getUserName());
		User saveInDB;
		if (saved != null && saved.getUserName().equalsIgnoreCase(user.getUserName())) {
			throw  new UserAlreadyExistsException("User already exists");
		}
		else {
			saveInDB = repository.save(user);
		}
		if (saveInDB != null && saveInDB.getUserName().equalsIgnoreCase(user.getUserName())) {
			return true;
		}

		return false;

	}

	@PostMapping("/getAll")
	public List<User> getAll() {

		return repository.findAll();

	}
}
