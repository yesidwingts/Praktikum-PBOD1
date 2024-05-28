/*Nama file : Truck.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class Truck, turunan dari class Vehicle
 */

class Truck extends Vehicle {
    double maxLoad;

    public Truck() {
        maxLoad = maxLoad;
    }

    public double getTruckMaxLoad() {
        return maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad * 100;
    }

    public double calcTripDistance() {
        return 0;
    }

    public String toString() {
        return "Truk adalah angkutan darat yang sangat handal";
    }
}