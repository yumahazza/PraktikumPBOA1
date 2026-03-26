/* Nama file    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi yang akan menolak input
                    jari-jari lingkaran yang bernilai nol
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 26 Maret 2026
 */

// class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        
        // assert(jariJari > 0): "jari jari tidak boleh nol!";

        if(jariJari <= 0){
            System.out.println("jari jari tidak valid!");
        } else{
            Lingkaran l = new Lingkaran(jariJari);
            double kelilingLingkaran = l.hitungKeliling();
            System.out.println("Keliling lingkaran: " + kelilingLingkaran);
        }
    }
}

// Laporan untuk Asersi2
/* Pada program Asersi2, penggunaan asersi kurang tepat karena asersi digunakan
    untuk meyakinkan bahwa eksekusi program dilakukan secara benar. Asersi juga
    hanya digunakan untuk keperluan debugging dan bukan untuk validasi data / logika.
    Sehingga untuk memeriksa nilai jari-jari lebih tepat menggunakan perkondisian if-else
*/