/* Nama file    : Pegawai.java
 * Deskripsi    : program class Pegawai
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 13 Maret 2026
*/

// library untuk format tanggal
import java.time.LocalDate;

public class Pegawai {
    /* ATRIBUT */
    protected String NIP;
    protected String Nama;
    protected LocalDate TglLahir;
    protected LocalDate TMT;
    protected double GajiPokok;

    /* METHOD */
    // konstruktor tanpa parameter
    public Pegawai(){
        this.NIP = "-";
        this.Nama = "-";
        this.TglLahir = null;
        this.TMT = null;
        this.GajiPokok = 0;
    }

    // konstruktor dengan parameter
    public Pegawai(String NIP, String Nama, LocalDate TglLahir, LocalDate TMT, double GajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TglLahir = TglLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    // selektor atribut NIP
    public String getNIP(){
        return NIP;
    }

    // selektor atribut Nama
    public String getNama(){
        return Nama;
    }

    // selektor atribut TglLahir
    public LocalDate getTglLahir(){
        return TglLahir;
    }

    // selektor atribut TMT
    public LocalDate getTMT(){
        return TMT;
    } 

    // selektor atribut gaji pokok
    public double getGajiPokok(){
        return GajiPokok;
    }

    // mutator atribut NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    // mutator atribut Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // mutator atribut TglLahir
    public void setTglLahir(LocalDate TglLahir){
        this.TglLahir = TglLahir;
    }

    // mutator atribut TMT
    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    // mutator atribut GajiPokok
    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    // method untuk menampilkan info atau detail class
    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + Nama);
        System.out.println("TglLahir: " + TglLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji Pokok: " + GajiPokok);
    }


}
