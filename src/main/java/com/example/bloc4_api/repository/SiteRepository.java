package com.example.bloc4_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bloc4_api.model.Site;

import java.util.Optional;

public interface SiteRepository extends JpaRepository<Site, Long> {
	Optional<Site> findByName(String name);
}