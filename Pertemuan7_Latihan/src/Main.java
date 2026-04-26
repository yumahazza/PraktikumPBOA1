/* Nama file    : Main.java 
 * Deskripsi    : program main
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 25 April 2026
 * */

public class Main{
    public static void main(String[] args){
        Civitasakademika D1 = new Dosen();
        Civitasakademika D2 = new Dosen("Karina", "1984083412");
        Civitasakademika M1 = new Mahasiswa();
        Civitasakademika M2 = new Mahasiswa("Rangga", "827501", (Dosen) D1);
        Civitasakademika M3 = new Mahasiswa("Putri", "209857", (Dosen) D1);
        Civitasakademika M4 = new Mahasiswa("Agus", "872100", (Dosen) D2);
        Civitasakademika M5 = new Mahasiswa("Nirma", "783155", (Dosen) D2);
        Seminar Google = new Seminar();
        Seminar Gemastik = new Seminar();

        // System.out.println("Mahasiswa kosong");
        // M1.printInfo();
        System.out.println();

        // System.out.println("Dosen kosong");
        // D1.printInfo();
        System.out.println();
        
        // System.out.println("Mahasiswa 1");
        M1.setNama("Andri");
        M1.setNomor("559003");
        ((Mahasiswa) M1).setWali((Dosen) D2);
        // M1.printInfo();
        System.out.println();
        
        // System.out.println("Dosen 1");
        D1.setNama("Irene");
        D1.setNomor("1972503701");
        // D1.printInfo();
        System.out.println();
        
        System.out.println("Seminar Google");
        Google.registrasi(D1);
        Google.registrasi(M2);
        Google.registrasi(M5);
        System.out.println("Jumlah peserta      : " + Google.countPeserta());
        System.out.println("Jumlah mahasiswa    : " + Google.countMahasiswa());
        System.out.println("Info peserta        : ");
        Google.tampilPeserta();
        System.out.println();


        System.out.println("Seminar Gemasik");
        Gemastik.registrasi(D2);
        Gemastik.registrasi(M1);
        Gemastik.registrasi(M3);
        Gemastik.registrasi(M4);
        System.out.println("Jumlah peserta      : " + Gemastik.countPeserta());
        System.out.println("Jumlah mahasiswa    : " + Gemastik.countMahasiswa());
        System.out.println("Info peserta        : ");
        Gemastik.tampilPeserta();
        System.out.println();
        
        System.out.println("Tampil Data Mahasiswa");
        ((Mahasiswa) M3).tampilDataMahasiswa();

        


    }
}

/* RENUNGAN */
/* Cara kerja Polimorfisme adalah suatu objek bisa memiliki banyak peran (banyak perilaku) melalui satu method yang sama.
    Contohnya adalah seorang pekerja kantoran bernama Kevin. Dia menjadi pekerja kantoran ketika berada di kantornya. 
    Tapi dia bisa mempunyai banyak peran lain, misalnya saja bisa menjadi ayah ketika di rumah, menjadi ketua RT ketika di lingkungan rumah, 
    menjadi tamu atau peserta dalam acara tertentu, dan sebagainya dengan indentitas tetap (nama) sebagai Kevin. Orangnya sama,
    namun punya banyak perilaku tergantung konteksnya. Itulan inti dari polimorfisme. */