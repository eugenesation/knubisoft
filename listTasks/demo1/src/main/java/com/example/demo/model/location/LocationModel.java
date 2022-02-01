package com.example.demo.model.location;

import com.example.demo.model.character.CharacterModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "locations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LocationModel {

    @Temporal(TemporalType.DATE)
    private Date created;

    private String dimension;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<CharacterModel> characterModels;

    private String name;

    private String type;

    public LocationModel() {
    }

    public List<CharacterModel> getCharacterModels() {
        return characterModels;
    }

    public void setCharacterModels(List<CharacterModel> characterModels) {
        this.characterModels = characterModels;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
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

    @Override
    public String toString() {
        return "LocationModel{" +
                "created='" + created + '\'' +
                ", dimension='" + dimension + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
