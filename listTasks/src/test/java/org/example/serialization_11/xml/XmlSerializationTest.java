package org.example.serialization_11.xml;

import org.example.serialization_11.object.SerializableObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XmlSerializationTest {

    @Test
    void serialize() {
        SerializableObject serializableObject = new SerializableObject();
        serializableObject.setName("Pupa");
        serializableObject.setId(10);

        String xml = "<SerializableObject><id>10</id><name>Pupa</name><surname/></SerializableObject>";

        Assertions.assertTrue(XmlSerialization.serialize(serializableObject).equals(xml));

        String failXml = "<SerializableObject><id>10</id><name>Pupa</name>";
        Assertions.assertFalse(XmlSerialization.serialize(serializableObject).equals(failXml));
    }

    @Test
    void deSerialize() {
        SerializableObject serializableObject = new SerializableObject();
        serializableObject.setName("Pupa");
        serializableObject.setId(10);

        String xml = "<SerializableObject><id>10</id><name>Pupa</name><surname/></SerializableObject>";

        Assertions.assertEquals(serializableObject.toString(), XmlSerialization.deSerialize(xml).toString());
    }
}