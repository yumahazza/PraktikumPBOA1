/* Nama file    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
                Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 26 Maret 2026
 */

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
        
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            // method getMessage telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }

    }
}


/* Laporan untuk AngkaSial.java */
/* 1. Ketika terjadi eksespsi, kode baris ke 13 "System.out.println(angka + " bukan angka sial");" 
   tidak dieksekusi jika input pada variabel angka adalah 13. Sehingga langsung menjalankan perintah
   throw exception. Jika input bukan angka 13, maka baris tersebut pasti dijalankan. */
/* 2. Kode baris ke 24 "catch(AngkaSialException ase)" dieksekusi jika terjadi exception.
   Misalnya saat kondisi variabel angka bernilai 13, maka program akan menjalankan perintah
   throw excpetion "throw new AngkaSialException".*/