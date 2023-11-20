package com.things.academy.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.things.academy.userdept.entities.Department;
import com.things.academy.userdept.repositories.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	public DepartmentRepository repo;
	
	@GetMapping
	public List<Department> findAll() {
		List<Department> result = repo.findAll();
		return result;
		
	}

}
