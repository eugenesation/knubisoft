package org.example.serialization_11.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.serialization_11.object.SerializableObject;

import java.io.IOException;

public class XmlSerialization {
    public static String serialize(SerializableObject serializableObject) {
        XmlMapper xmlMapper = new XmlMapper();

        String xmlString = null;
        try {
            xmlString = xmlMapper.writeValueAsString(serializableObject);
        } catch (JsonProcessingException e) {
            e.getMessage();
        }

        System.out.println(xmlString);

        return xmlString;
    }

    public static SerializableObject deSerialize(String xml) {
        XmlMapper xmlMapper = new XmlMapper();

        try {
            SerializableObject serializableObject = xmlMapper.readValue(xml, SerializableObject.class);
            System.out.println(serializableObject);
            return serializableObject;
        } catch (IOException e) {
            e.getMessage();
        }
        return null;

    }
}
