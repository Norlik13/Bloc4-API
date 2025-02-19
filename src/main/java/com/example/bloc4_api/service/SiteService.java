package com.example.bloc4_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bloc4_api.model.Site;
import com.example.bloc4_api.repository.SiteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SiteService {
	@Autowired
	private SiteRepository SiteRepository;

	public List<Site> getAllSites() {
		return SiteRepository.findAll();
	}

	public Site getSiteById(Long id) {
		return SiteRepository.findById(id).orElse(null);
	}

	public Site saveSite(Site Site) {
		Optional<Site> existingSite = SiteRepository.findByName(Site.getName());
		if (existingSite.isPresent()) {
			return existingSite.get();
		} else {
			return SiteRepository.save(Site);
		}
	}

	public void deleteSite(Long id) {
		SiteRepository.deleteById(id);
	}
}
