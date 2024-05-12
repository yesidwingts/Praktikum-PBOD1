/*Nama file : Data.java
Nama/NIM : 24060122120027
Tanggal : 12 Mei 2024
Tugas Pertemuan 8 - Collection and Generic D1
 */

package nomor11b;

public class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}
