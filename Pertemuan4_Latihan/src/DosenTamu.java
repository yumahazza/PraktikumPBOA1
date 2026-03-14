/* Nama file    : DosenTamu.java
 * Deskripsi    : program yang berisi atribut dan method class DosenTamu 
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 14 Maret 2026
*/

/* LIBRARY */
import java.time.LocalDate;

public class DosenTamu extends Dosen{
    /* ATRIBUT */
    private String NIDK;
    private int MasaKontrak;

    /* METHOD */
    /* KONSTRUKTOR */
    public DosenTamu(){
        setJabatan("Dosen Tamu");
    }

    
    /* MUTATOR */
    // mutator untuk atribut NIDK
    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    // mutator untuk atribut MasaKontrak
    public void setMasaKontrak(int Kontrak){
        this.MasaKontrak = Kontrak;
    }

    // mutator untuk atribut TglPensiun
    @Override
    public void setTglPensiun(){
        LocalDate tgl_form = LocalDate.parse(this.TMT, tanggalID);
        LocalDate hitungTglPensiun = tgl_form.plusMonths(this.MasaKontrak + 1);
        String TanggalPensiun = hitungTglPensiun.format(tanggalID);
        this.TglPensiun = TanggalPensiun;
    }

    // mutator untuk atribut Tunjangan
    @Override
    public void setTunjangan(){
        double bonus = 0.025 * this.GajiPokok;
        this.Tunjangan = bonus;
    }


    /* SELEKTOR */
    // selektor untuk atribut NIDK
    public String getNIDK(){
        return NIDK;
    }

    // selektor untuk atribut MasaKontrak
    public int getMasaKontrak(){
        return MasaKontrak;
    }


    /* METHOD LAINNYA */
    // method untuk menampilkan info NIDN
    @Override
    public void printInfoNID(){
        System.out.println("NIDK            : " + NIDK);
    }

    // method untuk menampilkan info MasaKontrak
    @Override
    public void printInfoKontrak(){
        System.out.println("Masa Kontrak    : " + MasaKontrak + " bulan");
    }


}