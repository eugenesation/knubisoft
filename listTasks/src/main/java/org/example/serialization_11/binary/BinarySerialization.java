package org.example.serialization_11.binary;

import org.example.serialization_11.object.SerializableObject;

import java.io.*;

public class BinarySerialization {
    public static void serializeAndDeserialize() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);


        SerializableObject serializableObject = new SerializableObject();
        serializableObject.setSurname("Mamed");
        serializableObject.setName("Dog");
        serializableObject.setId(13);

        oos.writeObject(serializableObject);
        oos.flush();

        System.out.println("After serialization: ");
        byte[] bytes = baos.toByteArray();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }


        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        SerializableObject serializableObject1 = (SerializableObject) ois.readObject();

        System.out.println("After deserialization: " + serializableObject1.getId() + ", "
                + serializableObject1.getName() + ", " + serializableObject1.getSurname());
    }

}
