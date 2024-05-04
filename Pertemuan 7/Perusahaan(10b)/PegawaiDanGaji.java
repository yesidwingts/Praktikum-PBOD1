/*Nama file : PegawaiDanGaji.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 4 Mei 2024
 * Deskripsi : File kelas PegawaiDanGaji
 */

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");
        //Pegawai pegawai4 = new Programmer("Yono");

        Payroll payroll = new Payroll();

        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
        //payroll.cetakGaji(pegawai4);
    }
}