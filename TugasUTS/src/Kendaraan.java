/* Nama file    : Kendaraan.java 
 * Deskripsi    : program superclass Kendaraan
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 26 Maret 2026
 * */

public class Kendaraan{
    /* ATRIBUT */
    protected String platNomor;
    protected String jenis;
    protected String merk;
    protected String model;
    protected int tahun;
    protected String warna;
    protected int kapasitas;
    protected String status;

    /* METHOD */
    /* KONSTRUKTOR */
    public Kendaraan(String PlatNomor, String Jenis, String Merk, String Model, int Tahun, String Warna, int Kapasitas, String Status){
        this.platNomor = PlatNomor;
        this.jenis = Jenis;
        this.merk = Merk;
        this.model = Model;
        this.tahun = Tahun;
        this.warna = Warna;
        this.kapasitas = Kapasitas;
        this.status = Status;
    }


    /* SELEKTOR */
    // selektor atribut platNomor
    public String getPlatNomor(){
        return platNomor;
    }

    // selektor atribut jenis
    public String getJenis(){
        return jenis;
    }

    // selektor atribut merk
    public String getMerk(){
        return merk;
    }

    // selektor atribut model
    public String getModel(){
        return model;
    }

    // selektor atribut tahun
    public int getTahun(){
        return tahun;
    }

    // selektor atribut warna
    public String getWarna(){
        return warna;
    }

    // selektor atribut kapasitas
    public int getKapasitas(){
        return kapasitas;
    }

    // selektor atribut status
    public String getStatus(){
        return status;
    }


    /* MUTATOR */
    // mutator atribut platNomor
    public void setPlatNomor(String PlatNomor){
        this.platNomor = PlatNomor;
    }

    // mutator atribut jenis
    public void setJenis(String Jenis){
        this.jenis = Jenis;
    }

    // mutator atribut merk
    public void setMerk(String Merk){
        this.merk = Merk;
    }

    // mutator atribut model
    public void setModel(String Model){
        this.model = Model;
    }

    // mutator atribut tahun
    public void setTahun(int Tahun){
        this.tahun = Tahun;
    }

    // mutator atribut warna
    public void setWarna(String Warna){
        this.warna = Warna;
    }

    // mutator atribut kapasitas
    public void setKapasitas(int Kapasitas){
        this.kapasitas = Kapasitas;
    }

    // mutator atribut status
    public void setStatus(String Status){
        this.status = Status;
    }

    
    /* METHOD LAINNYA */
}
