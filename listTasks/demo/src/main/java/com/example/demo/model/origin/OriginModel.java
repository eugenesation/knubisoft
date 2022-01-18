package com.example.demo.model.origin;

import com.example.demo.model.character.CharacterModel;

import javax.persistence.OneToOne;

public class OriginModel {
    private String name;

    @OneToOne
    private CharacterModel characterModel;

    private String url;

    public OriginModel() {
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

    public CharacterModel getCharacterModel() {
        return characterModel;
    }

    public void setCharacterModel(CharacterModel characterModel) {
        this.characterModel = characterModel;
    }

    @Override
    public String toString() {
        return "OriginModel{" +
                "name='" + name + '\'' +
                ", characterModel=" + characterModel +
                ", url='" + url + '\'' +
                '}';
    }
}
