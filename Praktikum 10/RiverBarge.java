/*Nama file : RiverBarge.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class RiverBrage, turunan dari clas Vehicle
 */

class RiverBarge extends Vehicle {
    double maxLoad;

    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad*150;
    }

    public double calcTripDistance() {
        return 0.0;
    }
}