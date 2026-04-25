/* Nama file    : Burung.java
 * Deskripsi    : Program class Burung
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 25 April 2026
 * */

public class Burung extends Anabul{
     /* ATRIBUT */

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    public Burung(){
        setNama("kosong");
    }

    public Burung(String P){
        setNama(P);
    }

    /* MUTATOR */
    
    /* SELEKTOR */

    /* METHOD LAINNYA */
    @Override
    public void Gerak(){
        System.out.println("terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println("cuit");
    }

    @Override
    public void printInfo(){
        System.out.println("Nama    : " + getNama());
        System.out.print("Gerak   : ");
        this.Gerak();
        System.out.print("Suara   : " );
        this.Bersuara();
        System.out.println();
    }
}
