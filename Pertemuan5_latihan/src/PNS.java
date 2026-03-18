/* Nama file    : PNS.java 
 * Deskripsi    : program subclass PNS
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 18 Maret 2026
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak{
    /* ATRIBUT */
    private String nip;
    private static int counterPNS = 0;

    /* METHOD */
    /* KONSTRUKTOR */
    // konstruktor tanpa parameter
    public PNS(){
        this.nip = null;
        counterPNS++;
    }

    // konstruktor dengan parameter
    public PNS(String Nama, LocalDate Tmk, String Alamat, double Income, String NIP){
        super(Nama, Tmk, Alamat, Income);
        this.nip = NIP;
        counterPNS++;
    }


    /* SELEKTOR */
    // selektor atribut nip
    public String getNIP(){
        return nip;
    }


    /* MUTATOR */
    // mutator atribut nip
    public void setNIP(String NIP){
        this.nip = NIP;
    }


    /* METHOD LAINNYA */
    // method menghitung masa kerja PNS
    public int hitungMasaKerja(){
        // NIM  : 24060124120035
        int A = 5;
        long selisihTahun = ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
        return (int) selisihTahun + A;

    }

    // method untuk menghitung pajak untuk PNS
    @Override
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    // menampilkan info nip PNS
    @Override
    public void printInfoUnik(){
        System.out.println("NIP                 : " + nip);
    }

    // method untuk menghitung jumlah PNS
    public static int getCounterPNS(){
        return counterPNS;
    }
}
