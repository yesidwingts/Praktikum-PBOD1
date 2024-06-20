import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat map dengan key NIM dan value nama mahasiswa
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("123456789", "Budi");
        mahasiswa.put("987654321", "Ani");
        mahasiswa.put("135792468", "Siti");
        mahasiswa.put("246813579", "Andi");

        // Menggunakan lambda expression untuk menampilkan key dan value
        mahasiswa.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
