package com.formation.api.persistence.repository;

import com.formation.api.persistence.entity.POI;
import org.springframework.data.jpa.repository.JpaRepository;

public interface POIRepository extends JpaRepository<POI, Long> {
}
