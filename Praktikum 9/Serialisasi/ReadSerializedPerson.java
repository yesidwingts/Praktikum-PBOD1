/*
* Nama File    : ReadSerializedPerson.java
* Nama Pembuat : Yesi Dwi Ningtias
* NIM          : 24060122120027
* Deskripsi    : Main file untuk membaca data dari serialisasi
* Tanggal      : 20 Juni 2024
*/

import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person p = null;
        try {
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Person) ois.readObject();
            ois.close();
            System.out.println("Serialized person name = "+p.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
