/* Nama File    : Garis.java
 * Deskripsi    : berisi realisasi atribut dan method dalam class Garis
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 26 Februari 2026
 */

public class MGaris {
    public static void main(String[] args){
        Garis G1 = new Garis();
        Garis G2 = new Garis(new Titik(-4, 0), new Titik(0, 8));

        Titik P1 = new Titik(3, -2);
        Titik Q1 = new Titik(-2, -8);
        Garis G3 = new Garis(P1, Q1);

        Titik P2 = new Titik(-7, 8);
        Titik Q2 = new Titik(3, -7);
        Garis G4 = new Garis(P2, Q2);

        // Aplikasi getter titik awal
        Titik A = G1.getTAwal();
        System.out.println("Titik awal G1:");
        A.printTitik();
        
        // Aplikasi getter titik akhir
        Titik B = G1.getAkhir();
        System.out.println("Titik akhir G1:");
        B.printTitik();
        System.out.println("");

        // Aplikasi setter titik awal
        Titik C = new Titik(-2, 0);
        G1.setTAwal(C);
        System.out.println("Garis G1, set titik awal:");
        G1.printGaris();
        
        // Aplikasi setter titik akhir
        Titik D = new Titik(0, 4);
        G1.setAkhir(D);
        System.out.println("Garis G1, set titik akhir:");
        G1.printGaris();
        System.out.println("");

        // Aplikasi method panjang garis
        double p1 = G1.getPGaris();
        double p2 = G2.getPGaris();
        System.out.println("Panjang G1:" + p1);
        System.out.println("Panjang G2:" + p2);
        System.out.println("");

        // Aplikasi method gradien garis
        double m1 = G1.gradien();
        double m2 = G2.gradien();
        double m3 = G3.gradien();
        double m4 = G4.gradien();
        System.out.println("Gradien G1:" + m1);
        System.out.println("Gradien G2:" + m2);
        System.out.println("Gradien G3:" + m3);
        System.out.println("Gradien G4:" + m4);
        System.out.println("");
        
        // Aplikasi method titik tengah garis
        Titik Te1 = G3.TTengah();
        Titik Te2 = G4.TTengah();
        System.out.println("Titik tengah G3: ");
        Te1.printTitik();
        System.out.println("Titik tengah G4: ");
        Te2.printTitik();
        System.out.println("");
        
        // Aplikasi method isSejajar
        boolean s1 = G1.isSejajar(G2);
        boolean s2 = G3.isSejajar(G4);
        System.out.println("Apakah G1 sejajar dengan G2? " + s1);
        System.out.println("Apakah G3 sejajar dengan G4? " + s2);

        // Aplikasi method isTegakLurus
        boolean t1 = G1.isTegakLurus(G2);
        boolean t2 = G3.isTegakLurus(G4);
        System.out.println("Apakah G1 tegak lurus dengan G2? " + t1);
        System.out.println("Apakah G3 tegak lurus dengan G4? " + t2);
        System.out.println("");
        
        // Aplikasi method persamaan garis
        G1.persGaris();
        G2.persGaris();
        G3.persGaris();
        G4.persGaris();
        System.out.println("");

        // Aplikasi counter garis
        int count = G1.getCounterGaris();
        System.out.println("Total garis yang dibuat:" + count);


    }
}
