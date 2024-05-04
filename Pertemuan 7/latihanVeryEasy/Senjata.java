/*Nama file : Senjata.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 4 Mei 2024
 * Tugas Praktikum 7 nomor 10d
 */


package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            System.out.println("Sisa Peluru: " + --peluru);
        } else {
            System.out.println("Tidak ada peluru tersisa!");
        }
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
}
