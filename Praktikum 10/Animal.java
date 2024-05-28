/*Nama file : Animal.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class abstract Animal 
 */

abstract class Animal implements Flyer {
    void eat() {
        System.out.println("Lagi makan...");
    }

    public String toString() {
        return "Aku adalah hewan";
    }

    // Implementasi default dari metode interface Flyer
    public void takeOff() {}
    public void land() {}
    public void fly() {}
}