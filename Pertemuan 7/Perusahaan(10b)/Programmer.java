/*Nama file : Programmer.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 4 Mei 2024
 */

class Programmer extends Pegawai {
    public Programmer(String nama) {
        super(nama, 5000000);
    }

    public int hitungBonus() {
        return 450000;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + hitungBonus());
    }
}