package com.things.academy.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.things.academy.userdept.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
}
