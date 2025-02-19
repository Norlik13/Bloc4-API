package com.example.bloc4_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bloc4_api.model.Salarie;

public interface SalarieRepository extends JpaRepository<Salarie, Long> {
}
