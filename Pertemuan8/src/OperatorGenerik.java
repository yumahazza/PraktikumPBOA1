/* Nama file    : OperatorGenerik.java
 * Deskripsi    : Program main unutk implementasi poliforfisme
                    universal inclusion
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 1 Mei 2026
 * */

class Ref<G>{
    /* ATRIBUT */
    public G val;

    /* METHOD */
    public Ref(G v){
        this.val = v;
    }

}

public class OperatorGenerik{
    /* METHOD */
    // Prosedur Tukar
    public static <G> void Tukar(Ref<G> a, Ref<G> b){
        G temp = a.val;
        a.val = b.val;
        b.val = temp;
    }

    // Prosedur total Bobot 2 objek Kucing
    public static <G extends Kucing, H extends Kucing> double Bobot2(G a, H b){
        return a.getBobot() + b.getBobot();
    }

}