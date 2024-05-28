/*Nama file : SeaPlane.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class SeaPlane, turunan dari clas Airplane
 */

class SeaPlane extends Airplane {
    SeaPlane() {
        super();
    }

    public double calcFuelEfficiency() {
        return maxLoad * 100;
    }

    public double calcTripDistance() {
        return 0.0;
    }

    public String toString() {
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}