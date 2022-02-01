package com.example.demo.model.episode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Entity
@Table(name = "episodes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EpisodeModel {

    private Date air_date;

//    @ManyToMany(mappedBy = "episodes")
//    @JsonManagedReference
//    private List<CharacterModel> characterModel;

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

    public void setAir_date(String air_date) {
        DateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd yyyy", Locale.US);
        Date newAirDate = null;
        try {
            newAirDate = simpleDateFormat.parse(air_date);
        } catch (ParseException e) {
            e.getMessage();
        }
        this.air_date = newAirDate;
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
                ", created='" + created + '\'' +
                ", episode='" + episode + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
