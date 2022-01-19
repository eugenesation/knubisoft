package com.example.demo.repository;

import com.example.demo.model.episode.EpisodeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<EpisodeModel, Long> {
}
