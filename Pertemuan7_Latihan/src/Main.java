/* Nama file    : Main.java 
 * Deskripsi    : program main
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 25 April 2026
 * */

public class Main{
    public static void main(String[] args){
        Dosen D1 = new Dosen();
        Dosen D2 = new Dosen("Han Sohee", "1984083412");
        Mahasiswa M1 = new Mahasiswa();
        Mahasiswa M2 = new Mahasiswa("Jisoo", "827501");
        Mahasiswa M3 = new Mahasiswa("Lisa", "209857");
        Mahasiswa M4 = new Mahasiswa("Jennie", "872100", D2);
        Mahasiswa M5 = new Mahasiswa("Rose", "783155", D2);
        Seminar dibimbing = new Seminar();
        Seminar gemastik = new Seminar();

        System.out.println("Mahasiswa kosong");
        M1.printInfo();
        System.out.println();

        System.out.println("Dosen kosong");
        D1.printInfo();
        System.out.println();

        M1.setNama("Karina");
        M1.setNIM("985721");
        M1.setWali(D2);
        M1.printInfo();
        M1.tampilDataMahasiswa();



    }
}
