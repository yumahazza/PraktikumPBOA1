/* Nama file    : Anabul.java
 * Deskripsi    : Program untuk menerapkan konsep polimorfisme
                universal inclusion pada class Anabul
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 25 April 2026
 * */

public class Anabul{
    /* ATRIBUT */
    private String Nama;

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    public Anabul(){
        this.Nama = "kosong";
    }

    public Anabul(String P){
        this.Nama = P;
    }

    /* SELEKTOR */
    public String getNama(){
        return Nama;
    }

    /* MUTATOR */
    public void setNama(String P){
        this.Nama = P;
    }

    /* METHOD LAINNYA */
    public void Gerak(){}

    public void Bersuara(){}

    public void printInfo(){
        System.out.println("Nama    : " + getNama());
    }
}
