package org.example.serialization.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.serialization.object.SerializableObject;

import java.io.IOException;

public class JsonDeAndSerialization {
    public static void serialize() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        SerializableObject student = new SerializableObject();
        student.setId(1);
        student.setName("Apchihba");
        student.setSurname("Obama");

        String json = objectMapper.writeValueAsString(student);
        System.out.println(json);
    }

    public static void deSerialize() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"id\":1,\"name\":\"Apchihba\",\"surname\":\"Obama\"}";
        SerializableObject student = objectMapper.readValue(json, SerializableObject.class);
        System.out.println(student);
    }
}
