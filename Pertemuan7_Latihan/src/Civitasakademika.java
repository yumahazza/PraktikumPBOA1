/* Nama file    : Civitasakademika.java 
 * Deskripsi    : program class induk Civitasakademika
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 25 April 2026
 * */

public abstract class Civitasakademika{
    /* ATRIBUT */
    protected String Nama;

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    public Civitasakademika(){
        this.Nama = "n/a";
    }

    public Civitasakademika(String nama){
        this.Nama = nama;
    }

    /* SELEKTOR */
    public String getNama(){
        return Nama;
    }

    public abstract String getNomor();

    public abstract void setNomor(String P);

    /* MUTATOR */
    public void setNama(String nama){
        this.Nama = nama;
    }

    /* METHOD LAINNYA */
    public abstract void printInfo();

    
}