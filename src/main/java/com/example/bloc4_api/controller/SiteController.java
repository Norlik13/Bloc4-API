package com.example.bloc4_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bloc4_api.model.Site;
import com.example.bloc4_api.service.SiteService;

import java.util.List;

@RestController
@RequestMapping("/api/sites")
public class SiteController {
	@Autowired
	private SiteService siteService;

	@GetMapping
	public List<Site> getAllSites() {
		return siteService.getAllSites();
	}

	@GetMapping("/{id}")
	public Site getSiteById(@PathVariable long id) {
		return siteService.getSiteById(id);
	}

	@PostMapping
	public Site createSite(@RequestBody Site site) {
		return siteService.saveSite(site);
	}

	@PutMapping("/{id}")
	public Site updateSite(@PathVariable Long id, @RequestBody Site site) {
		site.setId(id);
		return siteService.saveSite(site);
	}

	@DeleteMapping("/{id}")
	public void deleteSite(@PathVariable Long id) {
		siteService.deleteSite(id);
	}
}