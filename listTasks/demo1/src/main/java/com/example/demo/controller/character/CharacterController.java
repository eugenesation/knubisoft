package com.example.demo.controller.character;

import com.example.demo.model.character.CharacterModel;
import com.example.demo.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/characters")
public class CharacterController {
    CharacterRepository characterRepository;

    @Autowired
    public CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @GetMapping(value = "/getCharacters")
    public List<CharacterModel> getAll() {
        return characterRepository.findAll();
    }

    @GetMapping(value = "/getCharacters/{id}")
    public CharacterModel getLocationById(@PathVariable Long id) {
        return characterRepository.getById(id);
    }
}
