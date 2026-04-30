/* Nama file    : Kembangtelon.java
 * Deskripsi    : Program class Kucing
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 30 April 2026
 * */

public class Kembangtelon extends Kucing{
    /* ATRIBUT */

    /* OPERATOR */
    public Kembangtelon(){
        setNama("kosong");
        this.bobot = 4;
    }

    public Kembangtelon(String P, int x){
        setNama(P);
        this.bobot = x;
    }
}
