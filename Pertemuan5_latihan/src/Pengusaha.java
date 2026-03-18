/* Nama file    : Pengusaha.java 
 * Deskripsi    : program subclass Pengusaha
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 18 Maret 2026
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak{
    /* ATRIBUT */
    private String npwp;
    private static int counterPengusaha = 0;

    /* METHOD */
    /* KONSTRUKTOR */
    // konstruktor tanpa parameter
    public Pengusaha(){
        this.npwp = null;
        counterPengusaha++;
    }

    // konstruktor dengan parameter
    public Pengusaha(String Nama, LocalDate Tmk, String Alamat, double Income, String NPWP){
        super(Nama, Tmk, Alamat, Income);
        this.npwp = NPWP;
        counterPengusaha++;
    }


    /* SELEKTOR */
    // selektor atribut npwp
    public String getNPWP(){
        return npwp;
    }


    /* MUTATOR */
    // mutator atribut npwp
    public void setNPWP(String NPWP){
        this.npwp = NPWP;
    }


    /* METHOD LAINNYA */
    // method untuk meghitung masa kerja Pengusaha
    public int hitungMasaKerja(){
        // NIM  : 24060124120035
        int B = 3;
        long selisihTahun = ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
        return (int) selisihTahun + B;
    }

    // method untuk menghitung pajak untuk Pengusaha
    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    // menampilkan info nip PNS
    @Override
    public void printInfoUnik(){
        System.out.println("NPWP                : " + npwp);
    }

    // method untuk menghitung jumlah Pengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }


}