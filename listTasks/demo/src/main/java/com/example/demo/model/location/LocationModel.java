package com.example.demo.model.location;

import com.example.demo.model.character.CharacterModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locations")
public class LocationModel {

    private String created;

    private String dimension;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    private String url;

    @OneToMany
    private List<CharacterModel> characterModels;

    public LocationModel() {
    }

    public List<CharacterModel> getCharacterModels() {
        return characterModels;
    }

    public void setCharacterModels(List<CharacterModel> characterModels) {
        this.characterModels = characterModels;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "LocationModel{" +
                "created='" + created + '\'' +
                ", dimension='" + dimension + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", characterModels=" + characterModels +
                '}';
    }
}
