package com.example.bloc4_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bloc4_api.model.Salarie;
import com.example.bloc4_api.service.SalarieService;

import java.util.List;

@RestController
@RequestMapping("/api/salaries")
public class SalarieController {
	@Autowired
	private SalarieService salarieService;

	@GetMapping
	public List<Salarie> getAllSalaries() {
		return salarieService.getAllSalaries();
	}

	@GetMapping("/{id}")
	public Salarie getSalarieById(@PathVariable Long id) {
		return salarieService.getSalarieById(id);
	}

	@PostMapping
	public Salarie createSalarie(@RequestBody Salarie salarie) {
		return salarieService.saveSalarie(salarie);
	}

	@PutMapping("/{id}")
	public Salarie updateSalarie(@PathVariable int id, @RequestBody Salarie salarie) {
		salarie.setId(id);
		return salarieService.saveSalarie(salarie);
	}

	@DeleteMapping("/{id}")
	public void deleteSalarie(@PathVariable Long id) {
		salarieService.deleteSalarie(id);
	}
}