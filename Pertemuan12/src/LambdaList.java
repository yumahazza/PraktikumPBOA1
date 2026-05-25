/* Nama file : DiskonLambda.java
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai
                parameter pada method.
 * Pembuat  : Yuma Hazza Yuditama
 * NIM  : 24060124120035
 * Tanggal  : 25 Mei 2026
*/

import java.util.ArrayList;

public class LambdaList{
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
