/* Nama file    : Tendik.java
 * Deskripsi    : program class Tendik berisi atribut dan method
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 14 Maret 2026
*/

/* LIBRARY */
import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    /* ATRIBUT */
    private String Bidang;

    /* METHOD */
    /*  KONSTRUKTOR */
    public Tendik(){
        setBUP(55);
        setJabatan("Tendik");
    }
    
    /* MUTATOR */
    // mutator atribut Bidang
    public void setBidang(String Bidang){
        if(Bidang == "Akademik" || Bidang == "Kemahasiswaan" || Bidang == "Sumber Daya"){
            this.Bidang = Bidang;
        } else{
            this.Bidang = "-";
        }
    }

    // mutator atribut TglPensiun
    @Override
    public void setTglPensiun(){
        LocalDate tgl_form = LocalDate.parse(this.TglLahir, tanggalID);
        LocalDate hitungTglPensiun = tgl_form.plusYears(this.BUP);
        LocalDate hitungTglPensiun2 = hitungTglPensiun.plusMonths(1);
        String TanggalPensiun = hitungTglPensiun2.format(tanggalID);
        System.out.println("Tanggal Pensiun : " + TanggalPensiun);
    }

    // mutator atribut Tunjangan
    @Override
    public void setTunjangan(){
        LocalDate tmt = LocalDate.parse(this.TMT, tanggalID);
        Period masaKerja = Period.between(tmt, LocalDate.now());
        int tahunKerja = masaKerja.getYears();
        double bonus = 0.01 * tahunKerja * this.GajiPokok;
        this.Tunjangan = bonus;
    }

    /* SELEKTOR */
    // selektor atribut Bidang
    public String getBidang(){
        return Bidang;
    }

    // method untuk menampilkan info atau detail class Tendik
    @Override
    public void printInfoPos(){
        System.out.println("Bidang          : " + Bidang);
    }


    
}
