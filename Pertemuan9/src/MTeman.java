/* Nama file : MTeman.java
 * Deskripsi : Kelas main untuk koleksi Teman
 * Pembuat   : Yuma Hazza Yuditama
 * Tanggal   : 4 Mei 2026
* */

public class MTeman {
    public static void main(String[] args) {
        Teman brosis = new Teman();
        // addNama
        brosis.addNama("Jaka");
        brosis.addNama("Widada");
        brosis.addNama("Prabono");
        brosis.showTeman();
        System.out.println();
        
        // gantiNama
        brosis.gantiNama("Jaka", "Yuma");
        brosis.showTeman();
        System.out.println();
        
        brosis.addNama("Ragil");
        brosis.showTeman();
        System.out.println();

        // delNama
        brosis.delNama("Widada");
        brosis.showTeman();
        System.out.println();

        // countNama
        System.out.println("Jumlah Prabono di brosis: " + brosis.countNama("Prabono"));

        // getNbelm
        System.out.println("Jumlah teman di brosis: " + brosis.getNbelm());
        
        // getNama
        System.out.println("Teman indeks 2: " + brosis.getNama(2));

        // setNama
        System.out.print("Ganti teman di indeks 0: ");
        brosis.setNama(0, "Rojak");
        brosis.showTeman();

    } 
}
