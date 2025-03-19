package com.example.bloc4_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bloc4_api.model.Site;
import com.example.bloc4_api.repository.SiteRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SiteService {
	@Autowired
	private SiteRepository SiteRepository;

	public List<Site> getAllSites() {
		Iterable<Site> iterable = SiteRepository.findAll();
		return StreamSupport.stream(iterable.spliterator(), false)
				.collect(Collectors.toList());
	}

	public Site getSiteById(Long id) {
		return SiteRepository.findById(id).orElse(null);
	}

	@Transactional
	public Site saveSite(Site Site) {
		return SiteRepository.save(Site);
	}

	@Transactional
	public void deleteSite(Long id) {
		SiteRepository.deleteById(id);
	}
}
