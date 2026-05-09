/* Nama file : Piaraan.java
 * Deskripsi : Kelas untuk koleksi queue Piaraan
 * Pembuat   : Yuma Hazza Yuditama
 * NIM       : 24060124120035
 * Tanggal   : 9 Mei 2026
* */

import java.util.Queue;

public class Piaraan {
    /* ATRIBUT */
    private int nbelm;
    private Queue<Anabul> Lanabul;
    private String panggilan;

    /* OPERATOR */
    /* KONSTRUKTOR */
    public Piaraan(){
        this.nbelm = 0;
        this.Lanabul = null;
        this.panggilan = null;
    }

    /* SELEKTOR */
    public String getNama(){
        return panggilan;
    }

    public int getNbelm(){
        return nbelm;
    }

    /* MUTATOR */
    public void setNama(String nama){
        this.panggilan = nama;
    }

    /* OPERATOR LAINNYA */
    public void enqueueAnabul(Anabul X){
        Lanabul.add(X);
        this.nbelm++;
    }

    public boolean isMember(Anabul X){
        return Lanabul.contains(X);
    }

    public Anabul getAnabul(){
        return Lanabul.peek();
    }

    public void dequeueAnabul(){
        Lanabul.poll();
        this.nbelm--;
    }




}
