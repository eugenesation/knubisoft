package com.example.demo.model.character;

import com.example.demo.entity.character.Origin;
import com.example.demo.model.episode.EpisodeModel;
import com.example.demo.model.location.LocationModel;
import com.example.demo.model.origin.OriginModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "characters")
public class CharacterModel {
    private String created;

    @ManyToMany
    private List<EpisodeModel> episodes;

    private String gender;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;

    @ManyToOne
    private LocationModel locationModel;

    private String name;

    @OneToOne
    private OriginModel originModel;

    private String species;

    private String status;

    private String type;

    private String url;

    public CharacterModel() {
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
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

    public LocationModel getLocationModel() {
        return locationModel;
    }

    public void setLocationModel(LocationModel locationModel) {
        this.locationModel = locationModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OriginModel getOriginModel() {
        return originModel;
    }

    public void setOriginModel(OriginModel originModel) {
        this.originModel = originModel;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CharacterModel{" +
                "created='" + created + '\'' +
                ", episodes=" + episodes +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", image='" + image + '\'' +
                ", locationModel=" + locationModel +
                ", name='" + name + '\'' +
                ", originModel=" + originModel +
                ", species='" + species + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
