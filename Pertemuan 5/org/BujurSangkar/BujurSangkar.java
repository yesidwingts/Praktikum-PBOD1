public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi * sisi;
        return luas;
    }
}

//jika kelas BujurSangkar tidak memberikan implementasi untuk metode abstrak hitungLuas yang dideklarasikan dalam kelas induk BangunDatar, maka kodenya akan mengalami error (kesalahan)
//Jadi, jika BujurSangkar tidak menyediakan implementasi untuk metode hitungLuas yang dideklarasikan di kelas BangunDatar, kompilator Java akan menghasilkan kesalahan karena tidak mungkin membuat instance dari kelas abstrak yang memiliki metode abstrak yang tidak diimplementasikan. Ini bertentangan dengan konsep abstraksi di Java, yang membutuhkan implementasi untuk metode abstrak dalam kelas non-abstrak yang turunannya.
// dan akan muncul error kalimat merah dibagian public class BujurSangkar ("The type BujurSangkar must implement the inherited abstract method BangunDatar.hitungLuas(double)")