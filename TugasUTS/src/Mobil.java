/* Nama file    : Mobil.java 
 * Deskripsi    : program subrclass Mobil
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 26 Maret 2026
 * */

public class Mobil extends Kendaraan{
    /* ATRIBUT */
    private String tipeMobil;
    
    /* METHOD */
    /* KONSTRUKTOR */
    // konstruktor tanpa parameter
    protected Mobil(){
        // Asumsi, secara default tipe mobil reguler dengan kapasitas 4 penumpang
        setDriver(getDriver());
        setJenis("Mobil");
        setKapasitas(4);
        setModel("-");
        setPlatNomor("-");
        setTipeMobil("Reguler");
    }

    // konstruktor dengan parameter
    protected Mobil(Driver driver, String PlatNomor, String Model, String tipe_mobil){
        super(driver, PlatNomor, "Mobil", Model, 0);

        if(!tipe_mobil.equals("Reguler") && !tipe_mobil.equals("Deluxe")){
            throw new IllegalArgumentException("Tipe mobil harus Reguler atau Deluxe!");
        }

        this.tipeMobil = tipe_mobil;

        if(tipe_mobil.equals("Reguler")){
            this.kapasitas = 4;
        } else{
            this.kapasitas = 7;
        }
    }

    /* SELEKTOR */
    public String getTipeMobil(){
        return tipeMobil;
    }

    /* MUTATOR */
    public void setTipeMobil(String tipe_mobil){
        if(tipe_mobil.equals("Reguler")){
            this.kapasitas = 4;
            this.tipeMobil = tipe_mobil;
        } 
        else if(tipe_mobil.equals("Deluxe")){
            this.kapasitas = 7;
            this.tipeMobil = tipe_mobil;
        } 
        else{
            throw new IllegalArgumentException("Tipe mobil harus Reguler atau Deluxe!");
        }
    }

    /* METHOD LAINNYA */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tipe            : " + tipeMobil);
    }
}