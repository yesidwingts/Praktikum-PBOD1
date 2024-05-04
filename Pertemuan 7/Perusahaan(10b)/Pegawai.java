/*Nama file : Pegawai.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 4 Mei 2024
 */

public abstract class Pegawai {
    protected String nama;
    protected int gajiPokok;

    public Pegawai(String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok );
    }
}