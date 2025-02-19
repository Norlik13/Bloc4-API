package com.example.bloc4_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bloc4_api.model.Department;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	Optional<Department> findByName(String name);
}