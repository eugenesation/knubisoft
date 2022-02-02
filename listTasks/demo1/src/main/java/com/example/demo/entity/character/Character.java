
package com.example.demo.entity.character;

import org.springframework.stereotype.Component;

import javax.annotation.Generated;
import java.util.List;

@Component
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Character {

    private Info info;

    private List<CharacterResult> results;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<CharacterResult> getResults() {
        return results;
    }

    public void setResults(List<CharacterResult> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Character{" +
                "info=" + info +
                ", results=" + results +
                '}';
    }
}
