package com.example.demo.mapper;

import com.example.demo.entity.character.Character;
import com.example.demo.entity.character.CharacterResult;
import com.example.demo.entity.episode.Episode;
import com.example.demo.entity.episode.EpisodeResult;
import com.example.demo.entity.location.Location;
import com.example.demo.entity.location.LocationResult;
import com.example.demo.model.character.CharacterModel;
import com.example.demo.model.episode.EpisodeModel;
import com.example.demo.model.location.LocationModel;
import com.example.demo.repository.CharacterRepository;
import com.example.demo.repository.EpisodeRepository;
import com.example.demo.repository.LocationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class Mapper {

    CharacterRepository characterRepository;
    LocationRepository locationRepository;
    EpisodeRepository episodeRepository;

    @Autowired
    public Mapper(CharacterRepository characterRepository, LocationRepository locationRepository, EpisodeRepository episodeRepository) {
        this.characterRepository = characterRepository;
        this.locationRepository = locationRepository;
        this.episodeRepository = episodeRepository;
    }

    @Bean
    public CommandLineRunner runLocationMapping(RestTemplate restTemplate) {
        return args -> {

            ModelMapper modelMapper = new ModelMapper();

            Location location = restTemplate.getForObject(
                    "https://rickandmortyapi.com/api/location/", Location.class);

            List<LocationResult> locationResults = location.getResults();

            while (true) {
                if (location.getInfo().getNext() == null) {
                    location = restTemplate.getForObject(location.getInfo().getNext(), Location.class);
                    locationResults = location.getResults();

                    for (LocationResult locationResult : locationResults) {
                        locationRepository.save(modelMapper.map(locationResult, LocationModel.class));
                    }
                    break;
                } else {
                    location = restTemplate.getForObject(location.getInfo().getNext(), Location.class);
                    locationResults = location.getResults();

                    for (LocationResult locationResult : locationResults) {
                        locationRepository.save(modelMapper.map(locationResult, LocationModel.class));
                    }
                }
            }

            Episode episode = restTemplate.getForObject("https://rickandmortyapi.com/api/episode", Episode.class);

            List<EpisodeResult> episodeResults;

            while (true) {
                if (episode.getInfo().getNext() == null) {
                    episode = restTemplate.getForObject(episode.getInfo().getNext(), Episode.class);
                    episodeResults = episode.getResults();

                    for (EpisodeResult episodeResult : episodeResults) {
                        episodeRepository.save(modelMapper.map(episodeResult, EpisodeModel.class));
                    }
                    break;
                } else {
                    episode = restTemplate.getForObject(episode.getInfo().getNext(), Episode.class);
                    episodeResults = episode.getResults();

                    for (EpisodeResult episodeResult : episodeResults) {
                        episodeRepository.save(modelMapper.map(episodeResult, EpisodeModel.class));
                    }
                    continue;
                }
            }

            Character character = restTemplate.getForObject("https://rickandmortyapi.com/api/character", Character.class);

            List<CharacterResult> characterResults = character.getResults();

            for (CharacterResult characterResult : characterResults) {
                CharacterModel characterModel = modelMapper.map(characterResult, CharacterModel.class);
                // location
                Optional<LocationModel> optionalLocationModel = locationRepository.findByName(characterModel.getLocation().getName());
                if (optionalLocationModel.isPresent()) {
                    characterModel.setLocation(optionalLocationModel.get());
                } else {
                    characterModel.setLocation(null);
                }

                Optional<LocationModel> optionalOriginModel = locationRepository.findByName(characterModel.getOrigin().getName());
                if (optionalOriginModel.isPresent()) {
                    characterModel.setOrigin(optionalOriginModel.get());
                } else {
                    characterModel.setOrigin(null);
                }

                ArrayList<EpisodeModel> episodeList = new ArrayList<>();

                characterResult.getEpisode().forEach(url -> {

                    Optional<EpisodeModel> episodeModel = episodeRepository.findByUrl(url);
                    episodeModel.ifPresent(episodeList::add);

                });
                characterModel.setEpisodes(episodeList);

                characterRepository.save(characterModel);
            }

        };
    }

}
