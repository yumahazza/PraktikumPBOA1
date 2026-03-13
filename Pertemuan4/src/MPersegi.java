// Nama file    : MPersegi.java
// Deskripsi    : program realisasi atribut dan method class Persegi
// Pembuat      : Yuma Hazza Yuditama
// Tanggal      : 11 Maret 2026

public class MPersegi {
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        Persegi p2 = new Persegi(4, "Biru", "Kuning");

        // Aplikasi method printInfo dan printCounterBD
        p1.printInfo();
        System.out.println("");
        p2.printInfo();
        System.out.println("");

        // Aplikasi mutator
        p1.setSisi(10);
        p1.setWarna("Silver");
        p1.setBorder("Hitam");
        p1.printInfo();
        System.out.println("");

        // Aplikasi selektor
        p2.setSisi(7);
        System.out.println("Jumlah sisi Persegi p2: " + p2.getJumlSisi());
        System.out.println("Panjang sisi Persegi p2: " + p2.getSisi());
        System.out.println("Warna Persegi p2: " + p2.getWarna());
        System.out.println("Border Persegi p2: " + p2.getBorder());
        System.out.println("");

        // Aplikasi method diagonal, luas, dan keliling
        System.out.println("Panjang diagonal Persegi p1: " + p1.getDiagonal());
        System.out.println("Panjang diagonal Persegi p2: " + p2.getDiagonal());
        System.out.println("Luas Persegi p1: " + p1.getLuas());
        System.out.println("Luas Persegi p2: " + p2.getLuas());
        System.out.println("Keliling Persegi p1: " + p1.getKeliling());
        System.out.println("Keliling Persegi p2: " + p2.getKeliling());
        System.out.println("");

    }
}
