/* Nama file    : MPegawai.java
 * Deskripsi    : program aplikasi atribut dan method subclass 
                Tendik, Dosen Tetap, dan Dosen Tamu
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 13 Maret 2026
*/

public class MPegawai{
    public static void main(String[] args){
        // Objek
        DosenTetap P1 = new DosenTetap();
        DosenTamu P2 = new DosenTamu();
        Tendik P3 = new Tendik();

        // Variabel tanggal
        String TglLahir_P1 = "28 Maret 1981";
        String tmt_P1 = "10 Juni 2010";
        String TglLahir_P2 = "12 Desember 2002";
        String tmt_P2 = "21 September 2024";
        String TglLahir_P3 = "11 Agustus 1975";
        String tmt_P3 = "02 Februari 2002";

        // Variabel uang
        double gaji_P1 = 9200000;
        double gaji_P2 = 5000000;
        double gaji_P3 = 3800000;
        

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
        
        
        /* Aplikasi subclass Dosen Tetap */
        System.out.println("###### CLASS DOSEN TETAP ######");
        P1.setNIP("315049");
        P1.setNIDN("19810100371");
        P1.setNama("Dr. Putro Ajibanar, S.T., M.Sc.");
        P1.setTglLahir(TglLahir_P1);
        P1.setTMT(tmt_P1);
        P1.setFakultas("Fakultas Teknik");
        P1.setMasaKerja();
        P1.setTglPensiun();
        P1.setGajiPokok(gaji_P1);
        P1.setTunjangan();
        P1.printInfo();
        System.out.println("");


        /* Aplikasi subclass Dosen Tamu */
        System.out.println("###### CLASS DOSEN TAMU ######");
        P2.setNIP("301127");
        P2.setNIDK("20020240175");
        P2.setNama("Fitri Limuna, S.E., M.Si.");
        P2.setTglLahir(TglLahir_P2);
        P2.setTMT(tmt_P2);
        P2.setMasaKontrak(50);
        P2.setFakultas("Fakultas Ekonomi dan Bisnis");
        P2.setTglPensiun();
        P2.setGajiPokok(gaji_P2);
        P2.setTunjangan();
        P2.printInfo();
        

    }  
}