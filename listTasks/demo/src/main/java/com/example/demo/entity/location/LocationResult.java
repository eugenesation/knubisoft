
package com.example.demo.entity.location;

import java.util.List;

public class LocationResult {

    private String created;

    private String dimension;

    private Long id;

    private String name;

    private List<String> residents;

    private String type;

    private String url;

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

    public List<String> getResidents() {
        return residents;
    }

    public void setResidents(List<String> residents) {
        this.residents = residents;
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
        return "LocationResult{" +
                "created='" + created + '\'' +
                ", dimension='" + dimension + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", residents=" + residents +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
