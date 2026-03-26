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
    protected String model;
    protected int kapasitas;

    /* METHOD */
    /* KONSTRUKTOR */
    public Kendaraan(String PlatNomor, String Jenis, String Model, int Kapasitas){
        this.platNomor = PlatNomor;
        this.jenis = Jenis;
        this.model = Model;
        this.kapasitas = Kapasitas;
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

    // selektor atribut model
    public String getModel(){
        return model;
    }

    // selektor atribut kapasitas
    public int getKapasitas(){
        return kapasitas;
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

    // mutator atribut model
    public void setModel(String Model){
        this.model = Model;
    }

    // mutator atribut kapasitas
    public void setKapasitas(int Kapasitas){
        this.kapasitas = Kapasitas;
    }



    /* METHOD LAINNYA */
}
