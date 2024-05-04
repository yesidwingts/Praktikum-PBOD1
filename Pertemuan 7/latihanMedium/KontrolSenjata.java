/*Nama file : KontrolSenjata.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 4 Mei 2024
 * Tugas Praktikum 7 nomor 10e
 */

package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public boolean isPeluruSesuai(int jumPeluru) {
        return senjata.getPeluru() >= jumPeluru;
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isPeluruSesuai(1)) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal menembak, Peluru habis");
                break;
            }  
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println(senjata.getBunyi());
        } else {
            System.out.println("Senjata tidak dapat menusuk.");
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }

    public void isiPeluru(int jumlah) {
        senjata.setPeluru(senjata.getPeluru() + jumlah);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }
}
