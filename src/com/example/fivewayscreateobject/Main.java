package com.example.fivewayscreateobject;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //1.Way -- using keyword
        A a = new A();

        //2.Way -- using new instance --> is known as reflective ways of creating objects, internally use 3.Way.
        A a2 = A.class.newInstance();

        //3.Way -- using newInstance() --> is known as reflective ways of creating objects
        A a3 = A.class.getConstructor().newInstance();

        //4. Way -- using clone() from Object class
        // creates a copy of an existing object
        //to use, we have to implement Cloneable interface
        A a4 = (A) a.clone();

        //5.Way -- deserialization

    }
}
class A implements Cloneable, Serializable {

    public A() {
        System.out.println("created object of class A");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private static void serialization() throws IOException {
        A serialA = null;
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("demo.txt"));
        out.writeObject(serialA);
    }

    //deSerialA Object will be created after deserialization process
    private static void deserialization() throws IOException, ClassNotFoundException {
        A deSerialA = null;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("demo.txt"));
        deSerialA = (A)in.readObject();
    }

}
