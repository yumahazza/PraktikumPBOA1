/* Nama File    : MGaris.java
 * Deskripsi    : berisi realisasi dari atribut dan method dalam class Garis
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 25 Februari 2026
 */

public class MGaris {
    public static void main(String[] args){
        Titik P = new Titik(4, 1);
        Titik Q = new Titik(1, -5);
        Garis G1 = new Garis();
        Garis G2 = new Garis(P, Q);
        Titik getTP, getTQ;
        double p1, p2;
        double m1, m2;
        Titik M1, M2;
        boolean cekSjj, cekTL;
        Titik P1 = new Titik(5, 5); 
        Titik Q1 = new Titik(-3, -6);
        Garis G3 = new Garis(P1, Q1);
        Titik P2 = new Titik(-3, 5);
        Titik Q2 = new Titik(1, 3);
        Garis G4 = new Garis(P2, Q2);

        // Aplikasi printGaris
        System.out.println("Garis G1: ");
        G1.printGaris();
        System.out.println("Garis G2: ");
        G2.printGaris();
        System.out.println("");
        
        // Aplikasi getter / selektor
        getTP = G2.getTAwal();
        getTQ = G2.getTAkhir();
        System.out.println("Titik awal G2: ");
        getTP.printTitik();
        System.out.println("Titik akhir G2: ");
        getTQ.printTitik();
        System.out.println("");

        // Aplikasi setter / mutator
        System.out.println("Ganti titik awal dan titik akhir garis G2:");
        G2.setTAwal(new Titik(-2, 0));
        G2.setTAkhir(new Titik(0, 4));
        G2.printGaris();
        System.out.println("");

        // Aplikasi menghitung panjang garis
        p1 = G1.panjangGaris();
        p2 = G2.panjangGaris();
        System.out.println("Panjang garis G1: " + p1);
        System.out.println("Panjang garis G2: " + p2 );
        System.out.println("");

        // Aplikasi menghitung gradien garis
        m1 = G1.gradien();
        m2 = G2.gradien();
        System.out.println("Gradien garis G1: " + m1);
        System.out.println("Gradien garis G2: " + m2 + "");
        System.out.println("");

        // Aplikasi menghitung titik tengah garis
        M1 = G1.titikTengah();
        M2 = G2.titikTengah();
        System.out.println("Titik tengah garis G1: ");
        M1.printTitik();
        System.out.println("Titik tengah garis G2: ");
        M2.printTitik();
        System.out.println("");
        
        // Aplikasi mengecek apakah garis tersebut sejajar
        cekSjj = G1.cekSejajar(G2);
        System.out.println("G1 sejajar dengan G2: " + cekSjj);
        
        // Aplikasi mengecek apakah garis tersebut tegak lurus
        cekTL = G1.cekTegakLurus(G2);
        System.out.println("G1 tegak lurus dengan G2: " + cekTL + "");
        System.out.println("");

        // Aplikasi menentukan persamaan garis
        System.out.println("Persamaan Garis G1:");
        G1.persGaris();
        System.out.println("Persamaan Garis G2:");
        G2.persGaris();
        System.out.println("Persamaan Garis G3:");
        G3.persGaris();
        System.out.println("Persamaan Garis G4:");
        G4.persGaris();
        System.out.println("");

    }
}
