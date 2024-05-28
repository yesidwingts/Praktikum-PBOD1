/*Nama file : ProgramMedium.java
 * Nama / NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 28 Mei 2024
 * Deskripsi : class main ProgramMedium
 */

import java.util.ArrayList;
import java.util.List;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truk = new Truck();
        System.out.println(truk);

        SeaPlane sPesawat = new SeaPlane();
        System.out.println(sPesawat);

        Helicopter helkop = new Helicopter();
        System.out.println(helkop);

        System.out.println("-----------------------------------");

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        //Menambahkan kendaraan ke kelompok armada yang sesuai 
        armadaTruck.add(truk);
        armadaTruck.add(truk);
        armadaTruck.add(truk);
        System.out.println("jumlah Armada Truk          : " + armadaTruck.size());
        armadaSeaPlane.add(sPesawat);
        System.out.println("jumlah Armada SeaPlane      : " + armadaSeaPlane.size());
        armadaHelicopter.add(helkop);
        armadaHelicopter.add(helkop);
        System.out.println("jumlah Armada Helikopter    : " + armadaHelicopter.size());
        System.out.println("-----------------------------------");

        // Membuat objek ArmadaKendaraan
        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();

        // Menambahkan dan mencetak jumlah kendaraan
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println("-> Jumlah unit kendaraan    : " + armadaKendaraan.getAllArmada().size());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println("-> Jumlah unit kendaraan    : " + armadaKendaraan.getAllArmada().size());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println("-> Jumlah unit kendaraan    : " + armadaKendaraan.getAllArmada().size());
    }
}


