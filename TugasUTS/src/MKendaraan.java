/* Nama file    : Mobil.java 
 * Deskripsi    : program subrclass Mobil
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 26 Maret 2026
 * */

public class MKendaraan{
    public static void main(String[] args){
        Kendaraan motor1 = new Motor("H 2000 KY", "Beat");
        Motor motor2 = new Motor("H 1155 IR", "PCX");
        Mobil mobil1 = new Mobil("H 3727 AMG", "Avanza", "Deluxe");
        Mobil mobil2 = new Mobil("H 4218 KLI", "Raize", "Reguler");

        motor1.printInfo();
        System.out.println("");
        motor2.printInfo();
        System.out.println("");
        mobil1.printInfo();
        System.out.println("");
        mobil2.printInfo();
    }
}
