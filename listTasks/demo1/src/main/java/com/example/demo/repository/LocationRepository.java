package com.example.demo.repository;

import com.example.demo.model.location.LocationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<LocationModel, Long> {

    List<LocationModel> findAll();

    Optional<LocationModel> findByName(String name);

    LocationModel getById(Long id);
}
