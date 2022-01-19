package com.example.demo.model.episode;

import com.example.demo.model.character.CharacterModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "episodes")
public class EpisodeModel {
    private String air_date;

    @ManyToOne
    private CharacterModel characterModel;

    private String created;

    private String episode;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String url;

    public EpisodeModel() {
    }

    public String getAir_date() {
        return air_date;
    }

    public void setAir_date(String air_date) {
        this.air_date = air_date;
    }

    public CharacterModel getCharacterModel() {
        return characterModel;
    }

    public void setCharacterModel(CharacterModel characterModel) {
        this.characterModel = characterModel;
    }

    //    public List<CharacterModel> getCharacters() {
//        return characters;
//    }
//
//    public void setCharacters(List<CharacterModel> characters) {
//        this.characters = characters;
//    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "EpisodeModel{" +
                "air_date='" + air_date + '\'' +
                ", characters=" + characterModel +
                ", created='" + created + '\'' +
                ", episode='" + episode + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
