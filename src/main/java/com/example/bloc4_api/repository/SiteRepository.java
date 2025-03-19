package com.example.bloc4_api.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.bloc4_api.model.Site;

import java.util.Optional;

public interface SiteRepository extends CrudRepository<Site, Long> {
	Optional<Site> findByName(String name);
}