package com.example.bloc4_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bloc4_api.model.Department;
import com.example.bloc4_api.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@GetMapping
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartment();
	}

	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable Long id) {
		return departmentService.getDepartmentById(id);
	}

	@PostMapping
	public Department createDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}

	@PutMapping("/{id}")
	public Department updateDepartment(@PathVariable Long id, @RequestBody Department department) {
		department.setId(id);
		return departmentService.updateDepartment(department);
	}

	@DeleteMapping("/{id}")
	public void deleteDepartment(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
	}
}