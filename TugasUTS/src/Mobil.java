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
    // konstruktor dengan parameter
    protected Mobil(Driver driver, String PlatNomor, String Model, String TipeMobil){
        super(driver, PlatNomor, "Mobil", Model);

        if(!TipeMobil.equals("Reguler") && !TipeMobil.equals("Deluxe")){
            throw new IllegalArgumentException("Tipe mobil harus Reguler atau Deluxe!");
        }

        this.tipeMobil = TipeMobil;

        if(TipeMobil.equals("Reguler")){
            this.kapasitas = 4;
            this.tarifKendaraan = 1.2;
        } else{
            this.kapasitas = 7;
            this.tarifKendaraan = 1.4;
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
    public void infoTipeMobil(){
        System.out.println("Tipe            : " + getTipeMobil());
    }
}