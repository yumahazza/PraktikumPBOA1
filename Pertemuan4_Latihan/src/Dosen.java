/* Nama file    : Dosen.java
 * Deskripsi    : program class Dosen berisi atribut dan method
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 14 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Dosen extends Pegawai{
    /* ATRIBUT */
    private String Fakultas;
    
    /* METHOD */
    /* KONSTRUKTOR */
    public Dosen(){}

    /* MUTATOR */
    // mutator untuk atribut Fakultas
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    // mutator untuk atribut Tunjangan
    @Override
    public void setTunjangan(){
        LocalDate tmt = LocalDate.parse(this.TMT, tanggalID);
        Period masaKerja = Period.between(tmt, LocalDate.now());
        int tahunKerja = masaKerja.getYears();
        double bonus = tahunKerja * this.GajiPokok;
        this.Tunjangan = bonus;
    }

    /* SELEKTOR */
    // selektor untuk atribut Fakultas
    public String getFakultas(){
        return Fakultas;
    }

    /* METHOD LAINNYA */
    // method untuk menampilkan info fakultas
    @Override
    public void printInfoPos(){
        System.out.println("Fakultas        : " + Fakultas);
    }




}
