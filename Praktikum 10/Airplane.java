/*Nama file : Airplane.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class Airplane, turunan dari class Vehicle 
 */

class Airplane extends Vehicle implements Flyer {
    double maxLoad;

    Airplane() {
        maxLoad = maxLoad;
    }

    public void takeOff() {
        System.out.println("Pesawat lepas landas");
    }

    public void land() {
        System.out.println("Pesawat mendarat");
    }

    public void fly() {
        System.out.println("Pesawat terbang");
    }

    public double calcFuelEfficiency() {
        // Implementasi khusus untuk menghitung efisiensi bahan bakar Airplane
        return maxLoad*100;
    }

    public double calcTripDistance() {
        // Implementasi khusus untuk menghitung jarak perjalanan Airplane
        return 0.0;
    }
}