
package com.example.demo.entity.location;

import java.util.List;
import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Location {

    private Info info;

    private List<LocationResult> results;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<LocationResult> getResults() {
        return results;
    }

    public void setResults(List<LocationResult> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Location{" +
                "info=" + info +
                ", results=" + results +
                '}';
    }
}
