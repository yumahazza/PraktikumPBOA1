/* Nama file    : Dosen.java 
 * Deskripsi    : program class anak Dosen
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 25 April 2026
 * */

public class Dosen extends Civitasakademika{
    /* ATRIBUT */
    protected String NIP;

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    public Dosen(){
        setNama("n/a");
        this.NIP = "n/a";
    }

    public Dosen(String P, String X){
        setNama(P);
        this.NIP = X;
    }

    /* SELEKTOR */
    @Override
    public String getNomor(){
        return NIP;
    }

    /* MUTATOR */
    public void setNIP(String P){
        this.NIP = P;
    }

    /* METHOD LAINNYA */
    @Override
    public void printInfo(){
        System.out.println("Nama    : " + getNama());
        System.out.println("NIP     : " + getNomor());
    }
}