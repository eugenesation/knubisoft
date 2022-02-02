package com.example.demo.controller.character;

import com.example.demo.model.character.CharacterModel;
import com.example.demo.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping(value = "/getCharactersById")
    public List<CharacterModel> getLocationById(@RequestParam("id") List<String> id) {
        List<CharacterModel> characterModels = new ArrayList<>();
        for (String idElement : id) {
            characterModels.add(characterRepository.getById(Long.valueOf(idElement)));
        }
        return characterModels;
    }
}
