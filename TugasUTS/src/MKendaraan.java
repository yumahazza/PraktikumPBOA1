/* Nama file    : MKendaraan.java 
 * Deskripsi    : program main Kendaraan
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 26 Maret 2026
 * */

public class MKendaraan{
    public static void main(String[] args){
        Driver dm1 = new Driver("32056", "Yanto Balap", "yantobalap@gmail.com", "08933557621", "100-200-300");
        Driver dm2 = new Driver("35907", "Budi Racing", "budididi@gmail.com", "08944931621", "150-250-350");
        Driver dc1 = new Driver("51105", "Satriawan", "wansatria@gmail.com", "081325528004", "200-400-600");
        Driver dc2 = new Driver("52587", "Setiawan", "setwan26@gmail.com", "08124798321", "200-430-670");
        Motor motor1 = new Motor(dm1,"H 2000 KY", "Beat");
        Motor motor2 = new Motor(dm2, "H 1155 IR", "PCX");
        Mobil mobil1 = new Mobil(dc1, "H 3727 AMG", "Avanza", "Deluxe");
        Mobil mobil2 = new Mobil(dc2, "H 4218 KLI", "Raize", "Reguler");

        motor1.printInfo();
        System.out.println("");
        motor2.printInfo();
        System.out.println("");
        mobil1.printInfo();
        System.out.println("");
        mobil2.printInfo();
    }
}
