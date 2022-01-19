package com.example.demo.repository;

import com.example.demo.model.location.LocationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationModel, Long> {
}
