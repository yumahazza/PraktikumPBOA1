/* Nama file    : Kendaraan.java 
 * Deskripsi    : program superclass Kendaraan
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 26 Maret 2026
 * */

public class Kendaraan{
    /********** ATRIBUT **********/
    protected String platNomor;
    protected String jenis;
    protected String model;
    protected int kapasitas;
    private Driver driver;

    /********** METHOD **********/
    /* KONSTRUKTOR */
    // konstruktor tanpa paremeter
    protected Kendaraan(){
        this.driver = null;
        this.platNomor = null;
        this.model = null;
        this.jenis = null;
        this.kapasitas = 0;
    }

    // konstruktor dengan parameter
    protected Kendaraan(Driver driver_ojek, String PlatNomor, String Jenis, String Model, int Kapasitas){
        this.platNomor = PlatNomor;
        this.jenis = Jenis;
        this.model = Model;
        this.kapasitas = Kapasitas;
        this.driver = driver_ojek;
    }


    /* SELEKTOR */
    // selektor atribut driver
    public Driver getDriver(){
        return driver;
    }

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
    // mutator atribut driver
    public void setDriver(Driver driver_ojek){
        this.driver = driver_ojek;
    }

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
    public void printInfo(){
        System.out.println("Nama Driver     : " + driver.nama);
        System.out.println("Plat Nomor      : " + platNomor);
        System.out.println("Jenis Kendaraan : " + jenis);
        System.out.println("Model           : " + model);
        System.out.println("Kapasitas       : " + kapasitas);
    }
}