/* Nama file    : MPegawai.java
 * Deskripsi    : program realisasi atribut dan method class Pegawai
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 13 Maret 2026
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MPegawai{
    public static void main(String[] args){
        /* Buat objek Pegawai */
        // Format tanggal
        DateTimeFormatter tanggalID = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id","ID"));
        String tgl1 = "28 Maret 1990";
        String tmt1 = "10 Juni 2015";
        String tgl2 = "02 Januari 1986";
        String tmt2 = "12 September 2013";
        String tgl3 = "11 Agustus 1993";
        String tmt3 = "02 November 2015";
        LocalDate tgl1_form = LocalDate.parse(tgl1, tanggalID);
        LocalDate tmt1_form = LocalDate.parse(tmt1, tanggalID);
        LocalDate tgl2_form = LocalDate.parse(tgl2, tanggalID);
        LocalDate tmt2_form = LocalDate.parse(tmt2, tanggalID);
        LocalDate tgl3_form = LocalDate.parse(tgl3, tanggalID);
        LocalDate tmt3_form = LocalDate.parse(tmt3, tanggalID);
        String tgl_P1 = tgl1_form.format(tanggalID);
        String tmt_P1 = tmt1_form.format(tanggalID);
        String tgl_P2 = tgl2_form.format(tanggalID);
        String tmt_P2 = tmt2_form.format(tanggalID);
        String tgl_P3 = tgl3_form.format(tanggalID);
        String tmt_P3 = tmt3_form.format(tanggalID);

        // Format uang
        double gaji1 = 6000000;
        double gaji2 = 7500000;
        double gaji3 = 4000000;
        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');
        simbol.setDecimalSeparator(',');
        DecimalFormat rupiah = new DecimalFormat("Rp #,##0.00", simbol);
        String gaji_P1 = rupiah.format(gaji1);
        String gaji_P2 = rupiah.format(gaji2);
        String gaji_P3 = rupiah.format(gaji3);

        // Objek pegawai
        Pegawai P1 = new Pegawai();
        Pegawai P2 = new Pegawai();
        Tendik P3 = new Tendik();

        /* Aplikasi method */
        System.out.println("###### CLASS TENDIK ######");
        P3.setNIP("305001");
        P3.setNama("Prabono Subiono");
        P3.setTglLahir(tgl_P3);
        P3.setTMT(tmt_P3);
        P3.setBidang("Akademik");
        P3.setGajiPokok(gaji_P3);
        P3.printInfo();
        
    }  
}
