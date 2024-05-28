/*Nama file : Superman.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class Superman, turunan dari Kryptonian
 */
public class Superman extends Kryptonian {
    String name;

    Superman(String name) {
        this.name = name;
    }

    public void takeOff() {
        System.out.println(name + " mengambil ancang-ancang untuk terbang");
    }

    public void land() {
        System.out.println(name + " mendarat");
    }

    public void fly() {
        System.out.println(name + " terbang");
    }

    public void leapBuilding() {
        System.out.println(name + " melompati gedung");
    }

    public void stopBullet() {
        System.out.println(name + " menghentikan peluru");
    }
}