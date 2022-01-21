package com.example.demo.repository;

import com.example.demo.model.character.CharacterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterModel, Long> {
}
