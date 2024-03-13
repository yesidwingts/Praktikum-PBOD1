/*Nama file : MPoligon,java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 13 Maret 2024
 */
package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(8, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang :"+persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(5, 7, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}