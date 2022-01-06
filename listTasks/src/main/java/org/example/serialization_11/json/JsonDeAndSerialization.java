package org.example.serialization_11.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.serialization_11.object.SerializableObject;

import java.io.IOException;

public class JsonDeAndSerialization {
    public static String serialize(SerializableObject serializableObject) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(serializableObject);
        System.out.println(json);
        return json;
    }

    public static SerializableObject deSerialize(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        SerializableObject serializableObject = objectMapper.readValue(json, SerializableObject.class);
        System.out.println(serializableObject);
        return serializableObject;
    }
}
