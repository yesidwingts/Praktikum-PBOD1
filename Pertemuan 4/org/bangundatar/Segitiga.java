/*Nama file : Segitiga.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 13 Maret 2024
 */
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }

    public double getAlas(){
        return this.alas;
    }
    public double getTinggi(){
        return this.tinggi;
    }

    public void printInfo(){
        System.out.println("Bangun segitiga bersisi " + this.getJumlahSisi());
    }
}