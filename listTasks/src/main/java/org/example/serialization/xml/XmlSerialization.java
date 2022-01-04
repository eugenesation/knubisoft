package org.example.serialization.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.serialization.object.SerializableObject;

import java.io.IOException;

public class XmlSerialization {
    public static void serialize() {
        XmlMapper xmlMapper = new XmlMapper();

        SerializableObject serializableObject = new SerializableObject();
        serializableObject.setId(1);
        serializableObject.setName("Kolyan");
        serializableObject.setSurname("Vovan");

        String xmlString = null;
        try {
            xmlString = xmlMapper.writeValueAsString(serializableObject);
        } catch (JsonProcessingException e) {
            e.getMessage();
        }

        System.out.println(xmlString);

    }

    public static void deSerialize() {
        XmlMapper xmlMapper = new XmlMapper();

        String xml = "<SerializableObject><id>1</id><name>Kolyan</name><surname>Vovan</surname></SerializableObject>";
        try {
            SerializableObject object = xmlMapper.readValue(xml, SerializableObject.class);
            System.out.println(object);
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
