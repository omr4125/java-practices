package com.example.serialversionUid;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
         Employee employee = new Employee("xyz", "xyz@email");

        try {
            FileOutputStream fos = new FileOutputStream("emp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
