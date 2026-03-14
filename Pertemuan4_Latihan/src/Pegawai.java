/* Nama file    : Pegawai.java
 * Deskripsi    : program class Pegawai berisi atribut dan method
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 13 Maret 2026
*/

public class Pegawai {
    /* ATRIBUT */
    private String NIP;
    private String Nama;
    private String TglLahir;
    private String TMT;
    private String Jabatan;
    private String MasaKerja;
    private String TglPensiun;
    private String GajiPokok;
    private String Tunjangan;
    private int BUP;

    /* METHOD */
    /* KONSTRUKTOR */
    // konstruktor
    public Pegawai(){
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
    public String getGajiPokok(){
        return GajiPokok;
    }

    // selektor atribut Tunjangan
    public String getTunjangan(){
        return Tunjangan;
    }

    // selektor atribut BUP
    public int getBUP(){
        return BUP;
    }


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
        if(Jabatan == "Tendik" || Jabatan == "Dosen Tetap" || Jabatan == "Dosen Tamu"){
            this.Jabatan = Jabatan;
        } else{
            this.Jabatan = "-";
        }
    }

    // mutator atribut GajiPokok
    public void setGajiPokok(String GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    // mutator atribut BUP
    public void setBUP(int BUP){
        if(BUP == 65 || BUP == 55){
            this.BUP = BUP;
        } else{
            this.BUP = 0;
        }
    }


    // method untuk menampilkan info atau detail class Pegawai
    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + TglLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Jabatan: " + Jabatan);
        System.out.println("Masa Kerja: " + MasaKerja);
        System.out.println("Tanggal Pensiun: " + TglPensiun);
        System.out.println("Gaji Pokok: " + GajiPokok);
        System.out.println("Tunjangan: " + Tunjangan);
    }


}
