/* Nama File    : Titik.java
 * Deskripsi    : berisi realisasi atribut dan method dalam class Titik
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 23 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //membuat titik T1 dengan koordinat (0,0)
        Titik T2 = new Titik(3, 5); //membuat titik T1 dengan koordinat (3,5)
        Titik T3, T4;
        int Q1, Q2;
        double J1, J2;

        T1.setAbsis(-3); //mengganti absis T1 dengan nilai -3
        T1.setOrdinat(6); //mengganti ordinat T1 dengan nilai 6
        T1.printTitik(); //menampilkan titik T1
        T2.printTitik(); //menampilkan titik T2

        Q1 = T1.getKuadran(); //menentukan kuadran titik T1
        Q2 = T2.getKuadran(); //menentukan kuadran titik T2
        System.out.println(Q1);
        System.out.println(Q2);

        J1 = T1.getJarakPusat(); //menentukan jarak T1 ke titik pusat (0,0)
        J2 = T2.getJarak(T1); //menentukan jarak titik T2 ke titik T1
        System.out.println(J1);
        System.out.println(J2);

        T1.refleksiX(); //menentukan titik refleksi sumbu x pada T1
        T2.refleksiY(); //menentukan titik refleksi sumbu y pada T2
        T1.printTitik();
        T2.printTitik();

        T3 = T1.getRefleksiY(); //mengembalikan titik T1 yang telah direfleksikan sumbu y sebagai titik T3
        T4 = T2.getRefleksiX(); //mengembalikan titik T2 yang telah direfleksikan sumbu x sebagai titik T4
        T3.printTitik();
        T4.printTitik();

    }
}
