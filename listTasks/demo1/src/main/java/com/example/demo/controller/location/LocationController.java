package com.example.demo.controller.location;

import com.example.demo.model.location.LocationModel;
import com.example.demo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/locs")
public class LocationController {
    LocationRepository locationRepository;

    @Autowired
    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping(value = "/getlocs")
    @Cacheable("locations")
    public List<LocationModel> getAll() {
        return locationRepository.findAll();
    }

    @GetMapping(value = "/getLocation/{id}")
    @Cacheable("oneLocation")
    public LocationModel getLocationById(@PathVariable Long id) {
        return locationRepository.getById(id);
    }
}
