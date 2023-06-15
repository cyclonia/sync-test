package com.synchrony.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.synchrony.test.entity.User;
import com.synchrony.test.repository.UserRepository;

@SpringBootApplication
public class SyncTestApplication {

	private User user;
	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUsers() {
		user = new User(123, "sunil", "sunil", "sunil@abc.com");
		List<User> users = new ArrayList<>();
		users.add(user);

		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SyncTestApplication.class, args);
	}
	

}
