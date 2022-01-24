
package com.example.demo.entity.episode;

import java.util.List;
import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Episode {

    private Info info;

    private List<EpisodeResult> results;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<EpisodeResult> getResults() {
        return results;
    }

    public void setResults(List<EpisodeResult> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "info=" + info +
                ", results=" + results +
                '}';
    }
}
