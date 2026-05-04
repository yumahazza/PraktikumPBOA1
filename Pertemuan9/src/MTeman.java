/* Nama file : MTeman.java
 * Deskripsi : Kelas main untuk koleksi Teman
 * Pembuat   : Yuma Hazza Yuditama
 * Tanggal   : 4 Mei 2026
* */

public class MTeman {
    public static void main(String[] args) {

        Teman brosis = new Teman();
        brosis.addNama("Jaka");
        brosis.addNama("Widada");
        brosis.addNama("Prabono");
        brosis.addNama("Wahyu");
        brosis.addNama("Anwar");
        brosis.showTeman();
        
        brosis.gantiNama("Jaka", "Yuma");
        brosis.showTeman();

        brosis.addNama("Ragil");
        brosis.showTeman();

    } 
}
