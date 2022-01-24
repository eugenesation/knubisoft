
package com.example.demo.entity.episode;

import java.util.List;

public class EpisodeResult {

    private String air_date;

    private List<String> characters;

    private String created;

    private String episode;

    private Long id;

    private String name;

    private String url;

    public String getAirDate() {
        return air_date;
    }

    public void setAirDate(String air_date) {
        this.air_date = air_date;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

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
        return "EpisodeResult{" +
                "air_date='" + air_date + '\'' +
                ", characters=" + characters +
                ", created='" + created + '\'' +
                ", episode='" + episode + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
