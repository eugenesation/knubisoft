package com.example.demo.mapper;

import com.example.demo.entity.character.Character;
import com.example.demo.entity.character.CharacterResult;
import com.example.demo.model.character.CharacterModel;
import com.example.demo.repository.CharacterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class CharacterMapper {

    CharacterRepository characterRepository;

    @Autowired
    public CharacterMapper(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Character character = restTemplate.getForObject(
                    "https://rickandmortyapi.com/api/character", Character.class);

            List<CharacterResult> characterResults = character.getResults();

            for (CharacterResult characterResult : characterResults) {
                ModelMapper mapper = new ModelMapper();
                characterRepository.save(mapper.map(characterResult, CharacterModel.class));
            }
            System.out.println(characterResults);
        };
    }

}
