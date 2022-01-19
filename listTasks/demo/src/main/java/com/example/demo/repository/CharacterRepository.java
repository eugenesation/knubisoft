package com.example.demo.repository;

import com.example.demo.model.character.CharacterModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterModel, Long> {
}
