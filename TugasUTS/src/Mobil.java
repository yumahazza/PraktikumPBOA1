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
    public Mobil(String PlatNomor, String Model, String tipe_mobil){
        super(PlatNomor, "Mobil", Model, 0);
        if(tipe_mobil == "Reguler"){
            this.tipeMobil = tipe_mobil;
            this.kapasitas = 4;
        } else if(tipe_mobil == "Deluxe"){
            this.tipeMobil = tipe_mobil;
            this.kapasitas = 7;
        }
    }

    /* SELEKTOR */
    public String getTipeMobil(){
        return tipeMobil;
    }

    /* MUTATOR */
    public void setTipeMobil(String tipe_mobil){
        if(tipe_mobil == "Reguler" || tipe_mobil == "Deluxe"){
            this.tipeMobil = tipe_mobil;
        } else{
            this.tipeMobil = "Tidak tersedia";
        }
    }

    /* METHOD LAINNYA */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tipe            : " + tipeMobil);
    }
}