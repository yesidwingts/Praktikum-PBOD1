/*Nama file : Manajer.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 4 Mei 2024
 */

class Manajer extends Pegawai {
    public Manajer(String nama) {
        super(nama, 5000000);
    }

    public int hitungTunjangan() {
        return 700000;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + hitungTunjangan());
    }
}