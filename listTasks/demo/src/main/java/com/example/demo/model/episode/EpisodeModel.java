package com.example.demo.model.episode;

import com.example.demo.model.character.CharacterModel;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "episodes")
public class EpisodeModel {

    @Temporal(TemporalType.DATE)
    private Date air_date;

    @ManyToMany(mappedBy = "characters")
    private List<CharacterModel> characterModel;

    @Temporal(TemporalType.DATE)
    private Date created;

    private String episode;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "episode_id")
    private Long id;

    private String name;

    private String url;

    public EpisodeModel() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getAir_date() {
        return air_date;
    }

    public void setAir_date(Date air_date) {
        this.air_date = air_date;
    }

    public List<CharacterModel> getCharacterModel() {
        return characterModel;
    }

    public void setCharacterModel(List<CharacterModel> characterModel) {
        this.characterModel = characterModel;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
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

    @Override
    public String toString() {
        return "EpisodeModel{" +
                "air_date='" + air_date + '\'' +
                ", characters=" + characterModel +
                ", created='" + created + '\'' +
                ", episode='" + episode + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
