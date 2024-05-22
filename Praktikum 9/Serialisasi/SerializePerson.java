/*
* Nama File    : SerializePerson.java
* Nama Pembuat : Yesi Dwi Ningtias
* NIM          : 24060122120027
* Deskripsi    : Main file untuk menyimpan data melalui serialisasi
* Tanggal      : 20 Mei 2024
*/
import java.io.*;

class Person implements Serializable {
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person p = new Person("Panji");
        try {
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            System.out.println("Selesai menulis objek person");
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
