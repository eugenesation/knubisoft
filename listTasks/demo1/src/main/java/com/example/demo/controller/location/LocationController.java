package com.example.demo.controller.location;

import com.example.demo.model.location.LocationModel;
import com.example.demo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping(value = "/getLocation/{ids}")
    @Cacheable("oneLocation")
    public List<LocationModel> getLocationById(@PathVariable("ids") List<String> id) {
        List<LocationModel> locationModels = new ArrayList<>();
        for (String idElement : id) {
            locationModels.add(locationRepository.getById(Long.valueOf(idElement)));
        }
        return locationModels;
    }
}
