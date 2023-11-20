package com.things.academy.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		User result = repo.findById(id).get();
		return result;
		
	}

	@PostMapping()
	public User insert(@RequestBody User user) {
		User result = repo.save(user); 
		return user;
	}
	
	@PostMapping("/remove")
	public void remove(@RequestBody User user) {
		try {			
			repo.delete(user);
		} catch (Exception e) {
			System.err.println("* Falha ao remover usuario \n" + e);
		}
	}
}
