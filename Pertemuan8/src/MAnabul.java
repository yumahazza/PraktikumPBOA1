/* Nama file    : MAnabul.java
 * Deskripsi    : Program main unutk implementasi poliforfisme
                    universal inclusion
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 30 April 2026
 * */

public class MAnabul{
    public static void main(String[] args) {
        Anabul A1 = new Kucing();
        Anabul A2 = new Anjing();
        Anabul A3 = new Burung();
        Anabul A4 = new Kucing("Oceng", 5);

        A1.setNama("Areng");
        System.out.println("Anabul A1");
        A1.printInfo();
        A2.setNama("Bulski");
        System.out.println("Anabul A2");
        A2.printInfo();
        A3.setNama("Kicau");
        System.out.println("Anabul A3");
        A3.printInfo();

        System.out.println("Anabul A4");
        A4.printInfo();
    }
}
