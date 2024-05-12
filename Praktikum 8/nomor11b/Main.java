/*Nama file : Main.java
Nama/NIM : 24060122120027
Tanggal : 12 Mei 2024
Tugas Pertemuan 8 - Collection and Generic D1
 */
package nomor11b;

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
        
        // Ulat gerak
        anu.setIsi(K);
        anu.getIsi().gerak();
        
        // Kepompong gerak
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        
        // KupuDewasa gerak
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
