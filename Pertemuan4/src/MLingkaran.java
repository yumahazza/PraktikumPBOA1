// Nama file    : MPersegi.java
// Deskripsi    : program realisasi atribut dan method class Lingkaran
// Pembuat      : Yuma Hazza Yuditama
// Tanggal      : 11 Maret 2026

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        Lingkaran l2 = new Lingkaran(10, "Biru", "Cyan");

        // Aplikasi method printInfo
        System.out.println("Info Lingkaran l1:");
        l1.printInfo();
        System.out.println("");
        System.out.println("Info Lingkaran l2:");
        l2.printInfo();
        System.out.println("");

        // Aplikasi method mutator
        l1.setBorder("Teracotta");
        l1.setWarna("Maroon");
        l1.setJari(14.5);
        System.out.println("Info Lingkaran l1 setelah diset:");
        l1.printInfo();
        System.out.println("");

        // Aplikasi method selektor
        System.out.println("Info Lingkaran l2 menggunakan getter:");
        System.out.println("Warna: " + l2.getWarna());
        System.out.println("Border: " + l2.getBorder());
        System.out.println("Jari-jari: " + l2.getJari());
        System.out.println("Luas: " + l2.getLuas());
        System.out.println("Keliling: " + l2.getKeliling());
    }
}