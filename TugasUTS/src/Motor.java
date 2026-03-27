/* Nama file    : Motor.java 
 * Deskripsi    : program subrclass Motor
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 26 Maret 2026
 * */

public class Motor extends Kendaraan{
    /* ATRIBUT */

    /* METHOD */
    /* KONSTRUKTOR */
    // konstruktor dengan parameter
    protected Motor(Driver driver, String PlatNomor, String Model){
        super(driver, PlatNomor, "Motor", Model);
        this.kapasitas = 2;
        this.tarifKendaraan = 2000;
    }

    /* SELEKTOR */

    /* MUTATOR */

    /* METHOD LAINNYA */
    @Override
    public double getPajak(){
        return tarifKendaraan * 1.1;
    }

    
}