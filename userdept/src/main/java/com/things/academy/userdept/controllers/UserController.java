package com.things.academy.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.things.academy.userdept.entities.User;
import com.things.academy.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	public UserRepository repo;
	
	@GetMapping
	public List<User> findAll() {
		List<User> result = repo.findAll();
		return result;
		
	}
}
