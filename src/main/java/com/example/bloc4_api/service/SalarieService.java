package com.example.bloc4_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bloc4_api.model.Salarie;
import com.example.bloc4_api.repository.SalarieRepository;

import java.util.List;

@Service
public class SalarieService {
	@Autowired
	private SalarieRepository salarieRepository;

	public List<Salarie> getAllSalaries() {
		return salarieRepository.findAll();
	}

	public Salarie getSalarieById(Long id) {
		return salarieRepository.findById(id).orElse(null);
	}

	public Salarie saveSalarie(Salarie salarie) {
		return salarieRepository.save(salarie);
	}

	public void deleteSalarie(Long id) {
		salarieRepository.deleteById(id);
	}
}
