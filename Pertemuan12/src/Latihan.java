/* Nama file : DiskonLambda.java
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai
                parameter pada method.
 * Pembuat  : Yuma Hazza Yuditama
 * NIM  : 24060124120035
 * Tanggal  : 25 Mei 2026
*/

import java.util.Map;
import java.util.HashMap;

public class Latihan{
    public static void main(String[] args) {
        Map<String, String> mahasiswaList = new HashMap<>();
        mahasiswaList.put("24060315", "Fumiko");
        mahasiswaList.put("24068961", "Elgato");
        mahasiswaList.put("24082102", "Gustavo");
        mahasiswaList.put("24034843", "Lisa");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((NIM, nama) -> System.out.println("NIM : " + NIM + ", Nama : " + nama));
    }
}

