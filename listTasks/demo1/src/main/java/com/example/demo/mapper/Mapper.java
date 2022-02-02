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
                    "https://rickandmortyapi.com/api/location", Location.class);

            List<Location> locations = new ArrayList<>();

            while (true) {
                locations.add(location);
                location = restTemplate.getForObject(location.getInfo().getNext(), Location.class);

                if (location.getInfo().getNext() == null) {
                    locations.add(location);
                    break;
                }
            }

            List<LocationModel> locationModels = new ArrayList<>();
            locations.forEach(pageLocation -> {
                List<LocationResult> locationResults = pageLocation.getResults();
                locationResults.forEach(result -> {
                    LocationModel locationModel = modelMapper.map(result, LocationModel.class);
                    locationModels.add(locationModel);
                });
            });
            locationRepository.saveAll(locationModels);

            Episode episode = restTemplate.getForObject("https://rickandmortyapi.com/api/episode", Episode.class);

            List<Episode> episodes = new ArrayList<>();

            while (true) {
                episodes.add(episode);
                episode = restTemplate.getForObject(episode.getInfo().getNext(), Episode.class);

                if (episode.getInfo().getNext() == null) {
                    episodes.add(episode);
                    break;
                }
            }

            List<EpisodeModel> episodeModels = new ArrayList<>();
            episodes.forEach(pageEpisode -> {
                List<EpisodeResult> episodeResults = pageEpisode.getResults();
                episodeResults.forEach(result -> {
                    EpisodeModel episodeModel = modelMapper.map(result, EpisodeModel.class);
                    episodeModels.add(episodeModel);
                });
            });
            episodeRepository.saveAll(episodeModels);


            Character character = restTemplate.getForObject("https://rickandmortyapi.com/api/character", Character.class);

            List<Character> characterList = new ArrayList<>();

            while (true) {
                characterList.add(character);
                character = restTemplate.getForObject(character.getInfo().getNext(), Character.class);

                if (character.getInfo().getNext() == null) {
                    characterList.add(character);
                    break;
                }
            }

            List<CharacterModel> characterModels = new ArrayList<>();
            characterList.forEach(pageCharacter -> {
                List<CharacterResult> characterResults = pageCharacter.getResults();
                characterResults.forEach(result -> {
                    CharacterModel characterModel = modelMapper.map(result, CharacterModel.class);
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

                    result.getEpisode().forEach(url -> {

                        Optional<EpisodeModel> episodeModel = episodeRepository.findByUrl(url);
                        episodeModel.ifPresent(episodeList::add);

                    });
                    characterModel.setEpisodes(episodeList);
                    characterModels.add(characterModel);
                });
            });
            characterRepository.saveAll(characterModels);
        };
    }

}
