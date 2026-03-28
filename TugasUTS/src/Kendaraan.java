/* Nama file    : Kendaraan.java 
 * Deskripsi    : program superclass Kendaraan
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 26 Maret 2026
 * */

public abstract class Kendaraan implements Pajak{
    /********** ATRIBUT **********/
    private Driver driver;
    protected String platNomor;
    protected String jenis;
    protected String model;
    protected int kapasitas;
    protected int tarifKendaraan;

    /********** METHOD **********/
    /* KONSTRUKTOR */
    // konstruktor tanpa parameter
    protected Kendaraan(){
        this.driver = null;
        this.platNomor = null;
        this.jenis = null;
        this.model = null;
        this.kapasitas = 0;
        this.tarifKendaraan = 0;
    }

    // konstruktor dengan parameter
    protected Kendaraan(Driver pDriver, String PlatNomor, String Jenis, String Model){
        this.driver = pDriver;
        this.platNomor = PlatNomor;
        this.jenis = Jenis;
        this.model = Model;
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

    // selektor atribut tarifKendaraan
    public int getTarif(){
        return tarifKendaraan;
    }


    /* MUTATOR */
    // mutator atribut driver
    // asumsi driver boleh ganti username
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

    // mutator atribut tarifKendaraan
    public void setTarif(int Tarif){
        this.tarifKendaraan = Tarif;
    }


    /* METHOD LAINNYA */
    // menghitung pajak
    public double getPajak(){
        return 0;
    }

    // menampilkan info tipeMobil khusus class Mobil
    public void infoTipeMobil(){}

    // menampilkan info kendaraan
    public void printInfo(){
        System.out.println("Nama Driver     : " + getDriver().nama);
        System.out.println("Plat Nomor      : " + getPlatNomor());
        System.out.println("Jenis Kendaraan : " + getJenis());
        infoTipeMobil();
        System.out.println("Model           : " + getModel());
        System.out.println("Kapasitas       : " + getKapasitas());
    }

    
}