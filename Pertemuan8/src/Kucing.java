/* Nama file    : Kucing.java
 * Deskripsi    : Program class Kucing
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 30 April 2026
 * */

public class Kucing extends Anabul{
    /* ATRIBUT */

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    public Kucing(){
        setNama("kosong");
    }

    public Kucing(String P){
        setNama(P);
    }

    /* MUTATOR */
    
    /* SELEKTOR */

    /* METHOD LAINNYA */
    @Override
    public void Gerak(){
        System.out.println("melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("meong");
    }

    @Override
    public void printInfo(){
        System.out.println("Nama    : " + getNama());
        System.out.print("Gerak   : " );
        this.Gerak();
        System.out.print("Suara   : " );
        this.Bersuara();
        System.out.println();
    }
}
