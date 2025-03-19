package com.example.bloc4_api.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.bloc4_api.model.Department;

import java.util.Optional;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
	Optional<Department> findByName(String name);
}