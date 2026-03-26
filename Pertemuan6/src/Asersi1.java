/* Nama file    : Asersi1.java
 * Deskripsi    : Program untuk menunjukkan asersi
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 26 Maret 2026
 */

public class Asersi1{
    public static void main(String[] args){
        int x = -5;
        if(x > 0){
            System.out.println("x bilangan positif");
        } else{
            assert(x < 0): "ada kesalahan kode";
            System.out.println("x bukan bilangan positif");
        }
    }
}
