package com.example.demo.repository;

import com.example.demo.model.episode.EpisodeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EpisodeRepository extends JpaRepository<EpisodeModel, Long> {
    public Optional<EpisodeModel> findByUrl(String urlName);
}
