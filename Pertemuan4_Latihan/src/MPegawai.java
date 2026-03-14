/* Nama file    : MPegawai.java
 * Deskripsi    : program realisasi atribut dan method class Pegawai
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 13 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MPegawai{
    public static void main(String[] args){
        // Objek
        Pegawai P1 = new Pegawai();
        Pegawai P2 = new Pegawai();
        Tendik P3 = new Tendik();
        DosenTetap Dx = new DosenTetap();

        // Variabel tanggal
        String TglLahir_P1 = "28 Maret 1990";
        String tmt_P1 = "10 Juni 2015";
        String TglLahir_P2 = "02 Januari 1986";
        String tmt_P2 = "12 September 2013";
        String TglLahir_P3 = "11 Agustus 1977";
        String tmt_P3 = "02 November 2002";
        String TglLahir_Dx = "23 Maret 1973";
        String tmt_Dx = "11 Juli 2000";

        // Variabel uang
        double gaji_P1 = 6000000;
        double gaji_P2 = 7500000;
        double gaji_P3 = 5000000;
        double gaji_Dx = 10000000;
        

        /* Aplikasi subclass Tendik */
        System.out.println("###### CLASS TENDIK ######");
        P3.setNIP("305001");
        P3.setNama("Prabono Subiono, S.Kom.");
        P3.setTglLahir(TglLahir_P3);
        P3.setTMT(tmt_P3);
        P3.setBidang("Akademik");
        P3.setMasaKerja();
        P3.setTglPensiun();
        P3.setGajiPokok(gaji_P3);
        P3.setTunjangan();
        P3.printInfo();
        System.out.println("");


        /* Aplikasi subclass Dosen */
        System.out.println("###### CLASS DOSEN ######");
        Dx.setNIP("315049");
        Dx.setNIDN("19730200371");
        Dx.setNama("Dr. Putro Ajibanar, S.T., M.Sc.");
        Dx.setTglLahir(TglLahir_Dx);
        Dx.setTMT(tmt_Dx);
        Dx.setFakultas("Fakultas Teknik");
        Dx.setMasaKerja();
        Dx.setTglPensiun();
        Dx.setGajiPokok(gaji_Dx);
        Dx.setTunjangan();
        Dx.printInfo();
        

    }  
}
