package com.example.demo.model.origin;

import com.example.demo.model.character.CharacterModel;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "origins")
public class OriginModel {
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private CharacterModel characterModel;

    private String url;

    public OriginModel() {
    }

    public CharacterModel getCharacterModel() {
        return characterModel;
    }

    public void setCharacterModel(CharacterModel characterModel) {
        this.characterModel = characterModel;
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

//    public List<CharacterModel> getCharacterModels() {
//        return characterModels;
//    }
//
//    public void setCharacterModels(List<CharacterModel> characterModels) {
//        this.characterModels = characterModels;
//    }

    @Override
    public String toString() {
        return "OriginModel{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", characterModels=" + characterModel +
                ", url='" + url + '\'' +
                '}';
    }
}
