package com.example.bloc4_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bloc4_api.model.Department;
import com.example.bloc4_api.repository.DepartmentRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepartment() {
		Iterable<Department> iterable = departmentRepository.findAll();
		return StreamSupport.stream(iterable.spliterator(), false)
				.collect(Collectors.toList());
	}

	public Department getDepartmentById(Long id) {
		return departmentRepository.findById(id).orElse(null);
	}

	@Transactional
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Transactional
	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Transactional
	public void deleteDepartment(Long id) {
		departmentRepository.deleteById(id);
	}
}