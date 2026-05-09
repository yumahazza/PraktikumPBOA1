/* Nama file : Teman.java
 * Deskripsi : Kelas untuk koleksi objek generik
 * Pembuat   : Yuma Hazza Yuditama
 * NIM       : 24060124120035
 * Tanggal   : 4 Mei 2026
* */

import java.util.ArrayList;
import java.util.List;

public class Teman{
    /* ATRIBUT */
    private int nbelm;
    private List<String> Lnama;

    /* OPERATOR */
    /* KONSTRUKTOR */
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm(){
        return nbelm;
    }

    public String getNama(int idx){
        if(idx >= 0 && idx < Lnama.size()){
            return Lnama.get(idx);
        } else{
            return null;
        }
    }

    public void setNama(int idx, String nama){
        if(idx >= 0 && idx < Lnama.size()){
            Lnama.set(idx, nama);
        }
    }

    public void addNama(String nama){
        Lnama.add(nama);
        this.nbelm++;
    }

    public void delNama(String nama){
        Lnama.remove(nama);
        this.nbelm--;
    }

    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru){
        int x = Lnama.indexOf(nama);
        if(x >= 0){
            this .setNama(x, namabaru);
        }
    }

    public int countNama(String nama){
        int count = 0;
        for(int i = 0; i < Lnama.size(); i++){
            if(Lnama.get(i) == nama){
                count++;
            }
        }

        return count;
    }

    public void showTeman(){
        System.out.println("Daftar Teman:");
        for(int i = 0; i < Lnama.size(); i++){
            System.out.println(i + 1 + ". " + getNama(i));
        }
    }

}
