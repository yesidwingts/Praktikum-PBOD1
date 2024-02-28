/* File       : Titik.java */
/* Nama/NIM : Yesi Dwi Ningtias/24060122120027 */
/* Tanggal    : 28 Februari 2024 */

public class Titik {
        
        private double absis;
        private double ordinat;
        static int counterTitik;
        static int jarakPusat;
        
        public Titik() {
                this (0,0);
        }
        
        // Overloading Konstruktor 
        public Titik (int x, int y) {
                this.absis = x;
                this.ordinat = y;
                counterTitik++;
        }
        
        void setAbsis (double x) {
                this.absis = x;
        }
        
        void setOrdinat (double y) {
                this.ordinat = y;
        }
        
        double getAbsis() {
                return this.absis;
        }
        
        double getOrdinat() {
                return this.ordinat;
        }
        
        int getCounterTitik() {
                return counterTitik;
        }
    }
    