/* Nama file    : Anabul.java
 * Deskripsi    : Program untuk menerapkan konsep polimorfisme
                universal inclusion pada class Anabul
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 30 April 2026
 * */

public class Anabul{
    /* ATRIBUT */
    protected String Nama;
    private String panggilan;

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    public Anabul(){
        this.Nama = "kosong";
        this.panggilan = "kosong";
    }

    public Anabul(String P, String Q){
        this.Nama = P;
        this.panggilan = Q;
    }

    /* SELEKTOR */
    public String getNama(){
        return Nama;
    }

    public String getPanggilan(){
        return panggilan;
    }

    /* MUTATOR */
    public void setNama(String P){
        this.Nama = P;
    }

    public void setPanggilan(String Q){
        this.panggilan = Q;
    }

    /* METHOD LAINNYA */
    public void Gerak(){}

    public void Bersuara(){}

    public void printInfo(){
        System.out.println("Nama    : " + getNama());
    }
}
