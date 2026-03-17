// Nama file    : MBangunDatar.java
// Deskripsi    : program aplikasi atribut dan method class BangunDatar
// Pembuat      : Yuma Hazza Yuditama
// Tanggal      : 17 Maret 2026

public class MBangunDatar{
    public static void main (String[] args){
        /* OBJEK */
        // tidak bisa instansiasi langsung 
        // BangunDatar B1 = new BangunDatar();

        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        /* APLIKASI */
        System.out.println("Luas P1 = Luas P2? " + P1.isEqualLuas(P2));
        System.out.println("Keliling L1 = Keliling L2? " + L1.isEqualKel(L2));
        System.out.println("");

        P1.zoomOut();
        P2.zoomIn();
        System.out.println("Panjang sisi P1: " + ((Persegi) P1).getSisi());
        System.out.println("Panjang sisi P2: " + P2.getSisi());
        P1.zoom(70);
        P2.zoom(90);
        System.out.println("Panjang sisi P1: " + ((Persegi) P1).getSisi());
        System.out.println("Panjang sisi P2: " + P2.getSisi());

        
    }

    
}