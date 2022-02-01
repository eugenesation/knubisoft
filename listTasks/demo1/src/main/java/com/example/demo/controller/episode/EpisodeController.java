package com.example.demo.controller.episode;

import com.example.demo.model.episode.EpisodeModel;
import com.example.demo.repository.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/episodes")
public class EpisodeController {
    EpisodeRepository episodeRepository;

    @Autowired
    public EpisodeController(EpisodeRepository episodeRepository) {
        this.episodeRepository = episodeRepository;
    }

    @GetMapping(value = "/getepisodes")
    public List<EpisodeModel> getAll() {
        return episodeRepository.findAll();
    }

    @GetMapping(value = "/getepisodes/{id}")
    public EpisodeModel getLocationById(@PathVariable Long id) {
        return episodeRepository.getById(id);
    }
}
