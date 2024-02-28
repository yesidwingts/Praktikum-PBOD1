//* File       : Garis.java */
/* Nama/NIM : Yesi Dwi Ningtias/24060122120027 */
/* Tanggal    : 28 Februari 2024 */

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    // Konstruktor
    public Garis (Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal (Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir (Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat(); 
        return Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));       
    }
    
    public double getGradien() {
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();    
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();   
        return deltaY / deltaX;
    }

    public Garis getRefleksiY() {
        Titik titikAwalRefleksi = new Titik ((int) - titikAwal.getAbsis(), (int) titikAwal.getOrdinat());
        Titik titikAkhirRefleksi = new Titik ((int) - titikAkhir.getAbsis(), (int) titikAkhir.getOrdinat());
        return new Garis (titikAwalRefleksi, titikAkhirRefleksi);
    }

    public boolean isTegakLurus (Garis G) {
        double gradien1 = this.getGradien();
        double gradien2 = G.getGradien();
        return Math.abs(gradien1 * gradien2) == -1;
    }
}
