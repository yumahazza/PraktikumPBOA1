// Nama file    : MBangunDatar.java
// Deskripsi    : program realisasi atribut dan method class BangunDatar
// Pembuat      : Yuma Hazza Yuditama
// Tanggal      : 9 Maret 2026

public class MBangunDatar{
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "biru", "hitam");
        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam");
        BangunDatar Wow = new BangunDatar();
        
        Persegi1.printInfo();
        System.out.println("");
        Lingkaran1.printInfo();
        System.out.println("");

        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling());
        System.out.println("Luas Persegi1 : " + Persegi1.getLuas());

        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());
        System.out.println("");

        Wow.printCounterBD();
        
    }
}