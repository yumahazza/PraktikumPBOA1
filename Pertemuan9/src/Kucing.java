/* Nama file    : Kucing.java
 * Deskripsi    : Program class Kucing
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 30 April 2026
 * */

public class Kucing extends Anabul{
    /* ATRIBUT */
    protected int bobot;

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    public Kucing(){
        setNama("kosong");
        this.bobot = 4;
    }

    public Kucing(String P, int x){
        setNama(P);
        this.bobot = x;
    }

    public Kucing(String P, String Q){
        setNama(P);
        setPanggilan(Q);
    }

    /* MUTATOR */
    public void setBobot(int x){
        this.bobot = x;
    }
    
    /* SELEKTOR */
    public int getBobot(){
        return bobot;
    }

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
        System.out.println("Bobot   : " + getBobot());
        System.out.println();
    }
}
