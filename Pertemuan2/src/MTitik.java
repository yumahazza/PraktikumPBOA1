/* Nama File    : Titik.java
 * Deskripsi    : berisi realsasi atribut dan method dalam class Titik
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 23 Februari 2026
 */

public class MTitik {
    public static void main(String[] args){
        /* VARIABEL */
        // Aplikasi konstruktor
        Titik T1 = new Titik();
        Titik T2 = new Titik(3, 5);
        Titik T3 = new Titik(8, -9);
        Titik T4 = new Titik(5, -1);
        double getA, getO;
        int Q1, Q2;
        double J1, J2;
        Titik TX, TY;

        // Aplikasi setter
        T1.setAbsis(-3);
        T1.setOrdinat(6);
        T1.printTitik();
        T2.printTitik();

        // Aplikasi getter
        getA = T2.getAbsis();
        getO = T2.getOrdinat();
        System.out.println(getA + ", " + getO);

        // Aplikasi geser()
        T2.geser(1, -3);
        T2.printTitik();
        
        // Aplikasi getKuadran
        Q1 = T1.getKuadran();
        Q2 = T2.getKuadran();
        System.out.println(Q1);
        System.out.println(Q2);

        // Aplikasi jarak garis
        J1 = T1.getJarakPusat();
        J2 = T2.getJarak(T1);
        System.out.println(J1);
        System.out.println(J2);

        // Aplikasi setRefleksi
        T1.refleksiX();
        T1.printTitik();
        T2.refleksiY();
        T2.printTitik();

        // Aplikasi getRefleksi
        TX = T3.getRefleksiX();
        TY = T4.getRefleksiY();
        TX.printTitik();
        TY.printTitik(); 

        // Aplikasi method counter titik
        int count = T1.getCounterTitik();
        System.out.println("Total Titik yang dibuat: " + count);

    }
}