package com.example.demo.model.character;

import com.example.demo.model.episode.EpisodeModel;
import com.example.demo.model.location.LocationModel;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "characters")
public class CharacterModel {

    private LocalDateTime created;

    @ManyToMany
    private List<EpisodeModel> episodes;

    private String gender;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationModel location;

    @ManyToOne
    @JoinColumn(name = "origin_id")
    private LocationModel origin;

    private String name;

    private String species;

    private String status;

    private String type;

    public CharacterModel() {
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public List<EpisodeModel> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodeModel> episodes) {
        this.episodes = episodes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

    public LocationModel getOrigin() {
        return origin;
    }

    public void setOrigin(LocationModel origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CharacterModel{" +
                "created='" + created + '\'' +
                ", episodes=" + episodes +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", image='" + image + '\'' +
                ", locationModel=" + location +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public enum CharacterStatus {
        ALIVE,
        DEAD,
        UNKNOWN
    }

    public enum CharacterGender {
        FEMALE,
        MALE,
        GENDERLESS,
        UNKNOWN
    }
}


