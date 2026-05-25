/* Nama file : DiskonLambda.java
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon
 * Pembuat  : Yuma Hazza Yuditama
 * NIM  : 24060124120035
 * Tanggal  : 25 Mei 2026
*/

interface IDiskon{
    public double hitungDiskon(int harga);  
}

public class DiskonLambda{
    // tanpa lambda
    public static void main(String[] args) throws Exception {
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        // dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // dengan lambda dengan bok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}
