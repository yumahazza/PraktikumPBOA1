/* Nama file    : Anjing.java
 * Deskripsi    : Program class Anjing
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 30 April 2026
 * */

public class Anjing extends Anabul{
    /* ATRIBUT */

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    public Anjing(){
        setNama("kosong");
    }

    public Anjing(String P){
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
        System.out.println("guk-guk");
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

