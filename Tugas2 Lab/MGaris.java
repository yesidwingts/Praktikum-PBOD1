/* File       : MGaris.java */
/* Nama/NIM   : Yesi Dwi Ningtias/24060122120027 */
/* Tanggal    : 28 Februari 2024 */

public class MGaris {
    public static void main (String[] args) {
        Titik titik1 = new Titik (2,3);
        Titik titik2 = new Titik (5,7);

        Garis garis1 = new Garis (titik1, titik2);

        // Objek Garis
        System.out.println("Titik Awal : (" + garis1.getTitikAwal().getAbsis() + " , " + garis1.getTitikAwal().getOrdinat() + ") ");
        System.out.println("Titik Akhir : (" + garis1.getTitikAkhir().getAbsis() + " , " + garis1.getTitikAkhir().getOrdinat() + ") ");

        // Panjang Garis
        System.out.println("Panjang Garis : " + garis1.getPanjang());

        // Gradien Garis
        System.out.println("Gradien Garis : " + garis1.getGradien());

        // Refleksi dengan Sumbu Y
        Garis garisRefleksiY = garis1.getRefleksiY();
        System.out.println("Titik Awal Refleksi Y  : (" + garisRefleksiY.getTitikAwal().getAbsis() + " , " + garisRefleksiY.getTitikAwal().getOrdinat() + ") ");
        System.out.println("Titik Akhir Refleksi Y : (" + garisRefleksiY.getTitikAkhir().getAbsis() + " , " + garisRefleksiY.getTitikAkhir().getOrdinat() + ") ");

        // Mencoba Garis Lain
        Titik titik3 = new Titik (1,1);
        Titik titik4 = new Titik (4,1);
        Garis garis2 = new Garis (titik3, titik4);

        // Mengecek Apakah garis1 Tegak Lurus dengan garis2
        boolean isTegakLurus = garis1.isTegakLurus (garis2);
        System.out.println("Garis 1 Tegak Lurus dengan Garis 2: " + isTegakLurus);
    }
}
