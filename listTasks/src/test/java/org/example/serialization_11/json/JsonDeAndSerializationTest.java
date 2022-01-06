package org.example.serialization_11.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.serialization_11.object.SerializableObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonDeAndSerializationTest {

    @Test
    void serialize() throws JsonProcessingException {
        SerializableObject serializableObject = new SerializableObject();
        serializableObject.setId(10);
        serializableObject.setName("Pupa");

        String json = "{\"id\":10,\"name\":\"Pupa\",\"surname\":null}";
        Assertions.assertEquals(json, JsonDeAndSerialization.serialize(serializableObject));

        String failJson = "{\"id\":10,\"name\":\"Pupa\"}";
        Assertions.assertFalse(JsonDeAndSerialization.serialize(serializableObject) == failJson);
    }

    @Test
    void deSerialize() throws IOException {
        String json = "{\"id\":10,\"name\":\"Pupa\",\"surname\":null}";

        SerializableObject serializableObject = new SerializableObject();
        serializableObject.setId(10);
        serializableObject.setName("Pupa");

        Assertions.assertEquals(serializableObject.toString(), JsonDeAndSerialization.deSerialize(json).toString());
    }
}