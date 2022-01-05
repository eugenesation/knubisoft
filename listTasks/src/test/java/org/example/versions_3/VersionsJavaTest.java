package org.example.versions_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class VersionsJavaTest {

    @Test
    void getVersions() {
        String example = "ggwp = Java 3, Java     4, Java 5, Java 15";
        List<String> strings = new ArrayList<>();
        Assertions.assertEquals(4, VersionsJava.getVersions(strings, example).size());

        Assertions.assertEquals("Java15", VersionsJava.getVersions(strings, example).get(strings.size() - 1));
    }
}