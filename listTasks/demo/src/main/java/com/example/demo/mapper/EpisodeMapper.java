package com.example.demo.mapper;

import com.example.demo.entity.character.Character;
import com.example.demo.entity.character.CharacterResult;
import com.example.demo.entity.episode.Episode;
import com.example.demo.entity.episode.EpisodeResult;
import com.example.demo.model.character.CharacterModel;
import com.example.demo.model.episode.EpisodeModel;
import com.example.demo.repository.EpisodeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class EpisodeMapper {

    EpisodeRepository episodeRepository;

    @Autowired
    public EpisodeMapper(EpisodeRepository episodeRepository) {
        this.episodeRepository = episodeRepository;
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Episode episode = restTemplate.getForObject(
                    "https://rickandmortyapi.com/api/character", Episode.class);

            List<EpisodeResult> episodeResults = episode.getResults();

            for (EpisodeResult episodeResult : episodeResults) {
                EpisodeModel episodeModel = new EpisodeModel();
                ModelMapper mapper = new ModelMapper();
                mapper.map(episodeResult, episodeModel);
                episodeRepository.save(episodeModel);
            }
            System.out.println(episodeResults);
        };
    }

}
