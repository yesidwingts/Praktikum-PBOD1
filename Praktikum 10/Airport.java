/*Nama file : Airport.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class Airport
 */

class AirPort {
    Airplane pesawat;
    String nama;

    AirPort(String nama) {
        this.nama = nama;
    }

    String givePermissionToLand(Flyer flyer) {
        if (flyer instanceof Airplane) {
            return "Diizinkan untuk mendarat";
        } else {
            return "Tidak diizinkan untuk mendarat.";
        }
    }
}