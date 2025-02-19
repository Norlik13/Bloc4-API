package com.example.bloc4_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bloc4_api.model.Department;
import com.example.bloc4_api.repository.DepartmentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepartment() {
		return departmentRepository.findAll();
	}

	public Department getDepartmentById(Long id) {
		return departmentRepository.findById(id).orElse(null);
	}

	public Department saveDepartment(Department department) {
		Optional<Department> existingDepartment = departmentRepository.findByName(department.getName());
		if (existingDepartment.isPresent()) {
			return existingDepartment.get();
		} else {
			return departmentRepository.save(department);
		}
	}

	public void deleteDepartment(Long id) {
		departmentRepository.deleteById(id);
	}
}