/* Nama file : MPiaraan.java
 * Deskripsi : Program main Piaraan
 * Pembuat   : Yuma Hazza Yuditama
 * NIM       : 24060124120035
 * Tanggal   : 9 Mei 2026
* */

public class MPiaraan{
    public static void main(String[] args){
        Anabul A1 = new Kucing("Milo", 4);
        Anabul A2 = new Burung("Merah");
        Anabul A3 = new Anjing("Wolfie");
        Anabul A4 = new Kucing("Pilo", 4);
        Anabul A5 = new Anjing("Bus");
        Piaraan Pia = new Piaraan();

        // enqueueAnabul
        System.out.println("Isi Koleksi Pia: ");
        Pia.enqueueAnabul(A1);
        Pia.enqueueAnabul(A2);
        Pia.enqueueAnabul(A3);
        Pia.showAnabul();
        System.out.println();
        
        // getNbelm
        System.out.println("Jumlah isi Piaraan: " + Pia.getNbelm());
        System.out.println();
        
        // isMember
        System.out.println("Anabul A4 ada di Pia? " + Pia.isMember(A4));
        System.out.println();

        // getAnabul
        System.out.println("Anabul pertama: ");
        Pia.getAnabul();
        
        System.out.println("Isi Koleksi Pia: ");
        Pia.enqueueAnabul(A4);
        Pia.enqueueAnabul(A5);
        Pia.showAnabul();
        System.out.println();
        
        // dequeueAnabul
        System.out.println("Ambil anabul pertama: ");
        Pia.dequeueAnabul();
        Pia.showAnabul();
        System.out.println();
        
        // countKucing
        System.out.println("Jumlah kucing: " + Pia.countKucing());
        System.out.println();
        
        // bobotKucing
        System.out.println("Bobot keluarga kucing: " + Pia.bobotKucing());
        System.out.println();

        // showJenisAnabul
        A1.setPanggilan("Mil");
        A2.setPanggilan("Mer");
        A3.setPanggilan("Wolfie");
        A4.setPanggilan("Pil");
        A5.setPanggilan("-");
        System.out.println("Jenis Anabul pada Koleksi Pia");
        Pia.showJenisAnabul();
        System.out.println();
   } 
}


/* RENUNGAN */
/* Koleksi merupakan wadah untuk menyimpan berbagai objek. Contohnya koleksi Pia
dapat menyimpan objek Kucing, Anjing, dan Burung. Koleksi juga tidak hanya
menyimpan, tetapi isinya dapat dikelola, seperti procedure enqueueAnabul, 
procedure dequeueAnabul, function bobotKucing, dan lain-lain.*/