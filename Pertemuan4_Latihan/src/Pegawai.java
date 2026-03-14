/* Nama file    : Pegawai.java
 * Deskripsi    : program class Pegawai berisi atribut dan method
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 13 Maret 2026
*/

/* LIBRARY */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai{
    /* Variabel untuk kebutuhan format */
    DateTimeFormatter tanggalID = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id","ID"));

    /* ATRIBUT */
    protected String NIP;
    protected String Nama;
    protected String TglLahir;
    protected String TMT;
    protected String Jabatan;
    protected String MasaKerja;
    protected String TglPensiun;
    protected double GajiPokok;
    protected double Tunjangan;
    protected int BUP;

    /* METHOD */
    /* KONSTRUKTOR */
    public Pegawai(){}


    /* MUTATOR */
    // mutator atribut NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    // mutator atribut Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // mutator atribut TglLahir
    public void setTglLahir(String TglLahir){
        this.TglLahir = TglLahir;
    }

    // mutator atribut TMT
    public void setTMT(String TMT){
        this.TMT = TMT;
    }

    // mutator atribut Jabatan
    public void setJabatan(String Jabatan){
        this.Jabatan = Jabatan;
    }

    // mutator atribut MasaKerja
    public void setMasaKerja(){
        LocalDate tgl_form = LocalDate.parse(this.TMT, tanggalID);
        Period hitungMasaKerja = Period.between(tgl_form, LocalDate.now());
        String MasaKerja = hitungMasaKerja.getYears() + " tahun " + hitungMasaKerja.getMonths() + " bulan ";
        this.MasaKerja = MasaKerja;
    }

    // mutator atribut Tanggal Pensiun
    public void setTglPensiun(){}

    // mutator atribut GajiPokok
    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    // mutator atribut Tunjangan
    public void setTunjangan(){}

    // mutator atribut BUP
    public void setBUP(int BUP){
        if(BUP == 65 || BUP == 55){
            this.BUP = BUP;
        } else{
            this.BUP = 0;
        }
    }


    /* SELEKTOR */
    // selektor atribut NIP
    public String getNIP(){
        return NIP;
    }

    // selektor atribut Nama
    public String getNama(){
        return Nama;
    }

    // selektor atribut TglLahir
    public String getTglLahir(){
        return TglLahir;
    }

    // selektor atribut TMT
    public String getTMT(){
        return TMT;
    } 

    // selektor atribut Jabatan
    public String getJabatan(){
        return Jabatan;
    }

    // selektor atribut MasaKerja
    public String getMasaKerja(){
        return MasaKerja;
    }

    // selektor atirbut TglPensiun
    public String getTglPensiun(){
        return TglPensiun;
    }

    // selektor atribut Gaji Pokok
    public double getGajiPokok(){
        return GajiPokok;
    }

    // selektor atribut Tunjangan
    public double getTunjangan(){
        return Tunjangan;
    }

    // selektor atribut BUP
    public int getBUP(){
        return BUP;
    }


    /* METHOD LAINNYA */
    // method untuk menampilkan format untuk atribut GajiPokok
    public void printGajiPokok(){
        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');
        simbol.setDecimalSeparator(',');
        DecimalFormat rupiah = new DecimalFormat("Rp #,##0.00", simbol);
        String GajiPokok = rupiah.format(this.GajiPokok);
        System.out.println("Gaji Pokok      : " + GajiPokok);
    }

    // method untuk menampilkan format untuk atribut Tunjangan
    public void printTunjangan(){
        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');
        simbol.setDecimalSeparator(',');
        DecimalFormat rupiah = new DecimalFormat("Rp #,##0.00", simbol);
        String Tunjangan = rupiah.format(this.getTunjangan());
        System.out.println("Tunjangan       : " + Tunjangan);  
    }

    // method untuk menampilkan NIDN dan NIDK subclass Dosen
    public void printInfoNID(){}

    // method untuk menampilkan Bidang (subclass Tendik) atau Fakultas (subclass Dosen) 
    public void printInfoPos(){}

    // method untuk menampilkan MasaKontrak subclass Dosen Tamu
    public void printInfoKontrak(){}

    // method untuk menampilkan info atau detail superclass Pegawai
    public void printInfo(){
        System.out.println("NIP             : " + NIP);
        printInfoNID();
        System.out.println("Nama            : " + Nama);
        System.out.println("Tanggal Lahir   : " + TglLahir);
        System.out.println("TMT             : " + TMT);
        System.out.println("Jabatan         : " + Jabatan);
        printInfoPos();
        System.out.println("Masa Kerja      : " + MasaKerja);
        printInfoKontrak();
        System.out.println("Tanggal Pensiun : " + TglPensiun);
        printGajiPokok();
        printTunjangan();
    }


}
