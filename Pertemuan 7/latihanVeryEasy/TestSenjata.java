/*Nama file : TestSenjata.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 4 Mei 2024
 * Tugas Praktikum 7 nomor 10d
 */
package latihanVeryEasy;

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        //Senjata m16 = new Senjata("DOR");

        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());

        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}
