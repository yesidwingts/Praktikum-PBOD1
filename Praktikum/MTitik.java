public class MTitik {
    
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik();
        T1.setAbsis(1);
        T1.setOrdinat(1);
        T2.setAbsis(4);
        T2.setOrdinat(5);

        System.out.println(("\nJumkah Objek titik: " + T2.getCounter()));
        System.out.println("\nT1(" + T1.getAbsis()+ ", " + T1.getOrdinat() + ")");
        System.out.println("\nT1(" + T2.getAbsis()+ ", " + T2.getOrdinat() + ")");        
    }
}