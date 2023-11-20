package com.things.academy.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.things.academy.userdept.entities.Department;
import com.things.academy.userdept.entities.User;
import com.things.academy.userdept.repositories.DepartmentRepository;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	public DepartmentRepository repo;
	
	@GetMapping
	public List<Department> findAll() {
		List<Department> result = repo.findAll();
		return result;
		
	}
	
	@GetMapping("/{id}")
	public Department findById(@PathVariable Long id) {
		Department result = repo.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Department insert(@RequestBody Department department) {
		Department result = repo.save(department);
		return department;
	}

}
