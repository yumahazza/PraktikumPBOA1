/* Nama file    : DosenTetap.java
 * Deskripsi    : program yang berisi atribut dan method class DosenTetap 
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 14 Maret 2026
*/

/* LIBRARY */
import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen{
    /* ATRIBUT */
    String NIDN;

    /* METHOD */
    /* KONSTRUKTOR */
    public DosenTetap(){
        setBUP(65);
        setJabatan("Dosen Tetap");
    }


    /* MUTATOR */
    // mutator untuk atribut NIDN
    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    // mutator untuk atribut TglPensiun
    @Override
    public void setTglPensiun(){
        LocalDate tgl_form = LocalDate.parse(this.TglLahir, tanggalID);
        LocalDate hitungTglPensiun = tgl_form.plusYears(this.BUP);
        LocalDate hitungTglPensiun2 = hitungTglPensiun.plusMonths(1);
        String TanggalPensiun = hitungTglPensiun2.format(tanggalID);
        this.TglPensiun = TanggalPensiun;
    }

    // mutator untuk atribut Tunjangan
    @Override
    public void setTunjangan(){
        LocalDate tmt = LocalDate.parse(this.TMT, tanggalID);
        Period masaKerja = Period.between(tmt, LocalDate.now());
        int tahunKerja = masaKerja.getYears();
        double bonus = 0.02 * tahunKerja * this.GajiPokok;
        this.Tunjangan = bonus;
    }


    /* SELEKTOR */
    public String getNIDN(){
        return NIDN;
    }

    
    /* METHOD LAINNYA */
    // method untuk menampilkan info NIDN
    @Override
    public void printInfoNID(){
        System.out.println("NIDN            : " + NIDN);
    }


}