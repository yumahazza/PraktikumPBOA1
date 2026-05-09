/* Nama file    : Anggora.java
 * Deskripsi    : Program class Kucing
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 30 April 2026
 * */

public class Anggora extends Kucing{
    /* ATRIBUT */

    /* OPERATOR */
    public Anggora(){
        setNama("kosong");
        this.bobot = 4;
    }

    public Anggora(String P, int x){
        setNama(P);
        this.bobot = x;
    }
}
