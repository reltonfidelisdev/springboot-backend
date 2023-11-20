package com.things.academy.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.things.academy.userdept.entities.Department;
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
		return result;
	}
	@PutMapping
	public Department update(@RequestBody Department department) {
		Department result = repo.saveAndFlush(department);
		return result;
	}
	
	@DeleteMapping
	public void remove(@RequestBody Department department) {
		try { // try to remove a department. It's possible only if not associated to one or more users
			repo.delete(department);
		} catch (Exception e) {
			System.err.println("{'error':'true'}, {'message':'Can\'t remove department. Please verify if it\'s contains an associated foreign key'}");
			System.err.println("Exception:");
			System.err.println(e.getMessage() + " : \n" + e.getClass());
		}
	}

}
