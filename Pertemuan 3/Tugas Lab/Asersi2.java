//Nama : Yesi Dwi Ningtias
//NIM : 24060122120027

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 7; //awalnya 0 diganti menjadi 7 supaya bisa dijalankan dan hasil kelilingnya ada
        assert(jariJari>0): "jari-jari tidak boleh nol";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

//secara konsep sudah tepat, tetapi pada bagian jari jari = 0, nanti akan masuk ke block assert(jarijari > 0) 
//dan akan mengeluarkan output "Jari-jari tidak boleh nol". Harusnya jari jari lebih besar dari 0.