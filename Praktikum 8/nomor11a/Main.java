/*Nama file : Main.java
Nama/NIM : 24060122120027
Tanggal : 12 Mei 2024
Tugas Pertemuan 8 (11a) - Collection and Generic D1
 */
package nomor11a;

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}