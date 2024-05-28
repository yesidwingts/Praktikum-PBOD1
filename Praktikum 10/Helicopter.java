/*Nama file : Helicopter.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class Helicopter, turunan dari class Vehicle 
 */

class Helicopter extends Vehicle implements Flyer {
    double maxLoad;

    Helicopter() {
        maxLoad = maxLoad;
    }

    public void takeOff() {
        System.out.println("Helikopter lepas landas");
    }

    public void land() {
        System.out.println("Helikopter mendarat");
    }

    public void fly() {
        System.out.println("Helikopter terbang");
    }

    public double calcFuelEfficiency() {
        return maxLoad*100;
    }

    public double calcTripDistance() {
        return 0.0;
    }
    public String toString() {
        return "Helikopter hanya memerlukan landasan kecil";
    }
}
