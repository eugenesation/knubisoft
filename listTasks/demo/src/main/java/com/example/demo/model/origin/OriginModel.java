package com.example.demo.model.origin;

import com.example.demo.model.character.CharacterModel;

import javax.persistence.*;

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
