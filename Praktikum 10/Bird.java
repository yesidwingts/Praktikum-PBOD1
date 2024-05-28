/*Nama file : Bird.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class Bird dan extend dari class Animal
 */

class Bird extends Animal {
    public void takeOff() {
        System.out.println("Burung mengepakkan sayap untuk lepas landas");
    }

    public void land() {
        System.out.println("Burung mendarat");
    }

    public void fly() {
        System.out.println("Burung terbang");
    }

    public void buildNest() {
        System.out.println("Burung membuat sarang");
    }

    public void layEggs() {
        System.out.println("Burung bertelur");
    }
}