package com.example.bloc4_api.service;

import com.example.bloc4_api.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bloc4_api.model.Salarie;
import com.example.bloc4_api.repository.SalarieRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SalarieService {
	@Autowired
	private SalarieRepository salarieRepository;

	public List<Salarie> getAllSalaries() {
		Iterable<Salarie> iterable = salarieRepository.findAll();
		return StreamSupport.stream(iterable.spliterator(), false)
				.collect(Collectors.toList());
	}

	public Salarie getSalarieById(Long id) {
		return salarieRepository.findById(id).orElse(null);
	}

	@Transactional
	public Salarie saveSalarie(Salarie salarie) {
		return salarieRepository.save(salarie);
	}

	@Transactional
	public void deleteSalarie(Long id) {
		salarieRepository.deleteById(id);
	}
}
