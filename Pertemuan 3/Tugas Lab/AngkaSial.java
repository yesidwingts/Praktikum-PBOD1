//Nama : Yesi Dwi Ningtias
//NIM : 24060122120027
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        else{
            System.out.println("Angka "+angka+" bukan angka sial");
        }
    }

    public static void main(String[] args){
        AngkaSial angkasial = new AngkaSial();
        try{
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        }
        catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}

/*baris 12 tetap dijalankan, jika terdapat angka yang bukan eksepsi dan berada sebelum angka eksepsi. Contoh terdapat angka 10,13 dan 12
karena angka 13 adalah angka eksepsi maka yang terprint hanya angka 10 saja ("Angka 10 bukan angka sial") dan untuk angka 13 ("Angka 13, angka sial bos")
, dan untuk angka 12 tidak tereksek */

/* baris 21 dieksekusi jika terdapat angka yang merupakan angka 13 atau angka sial sehingga nanti akan mengeluarkan ("hati-hati memasukan angka") 
 tetapi jika terdapat angka yang bukan angka 13 maka baris 21 tidak akan dieksekusi. Contoh, jika angka yang dimasukan di cobaAngka adalah 10, 11, 12 maka outputnya adalah bukan angka sial semua untuk ketiga angka tersebut.
*/