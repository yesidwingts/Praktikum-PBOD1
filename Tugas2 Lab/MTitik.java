/* File       : MTitik.java */
/* Nama/NIM   : Yesi Dwi Ningtias/24060122120027 */
/* Tanggal    : 28 Februari 2024 */

public class MTitik {
        public static void main (String[] args) {
            Titik t1, t2, t3;

            t1 = new Titik(); t1.setAbsis(1); t1.setOrdinat(2); 
            // Untuk Double
            t2 = new Titik (3,4);
            // Overloading untuk Integer
            t3 = new Titik (5,7);
            
            System.out.println("Jumlah objek titik: " + t3.getCounterTitik());
            System.out.println("t1 (" + t1.getAbsis() + " , " + t1.getOrdinat()+ ") ");
            System.out.println("t2 (" + t2.getAbsis() + " , " + t2.getOrdinat()+ ") ");
            System.out.println("t3 (" + t3.getAbsis() + " , " + t3.getOrdinat()+ ") ");
        }
    }
    