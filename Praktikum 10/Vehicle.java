/*Nama file : Vehicle.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class abstract Vehicle
 */

abstract class Vehicle {
    public double calcFuelEfficiency() {
        return 0.0;
    }

   public double calcTripDistance() {
        return 0.0;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

}