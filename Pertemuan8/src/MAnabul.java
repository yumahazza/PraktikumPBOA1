/* Nama file    : MAnabul.java
 * Deskripsi    : Program main untuk implementasi kelas generik
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 30 April 2026
 * */



public class MAnabul{
    public static void main(String[] args) {
        System.out.println("--- APLIKASI Class Anabul, Kucing, Anjing, dan Burung ---");
        Anabul A1 = new Kucing();
        Anabul A2 = new Anjing();
        Anabul A3 = new Burung();
        Anabul A4 = new Kucing("Oceng", 5);
        Datum<Kucing> meow = new Datum<>();
        Kucing K1 = new Kucing("Acid", 5);
        meow.setIsi(K1);
        Anabul A5 = meow.getIsi();
 
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
        System.out.println("Anabul A5");
        A5.printInfo();

        // System.out.println("--- APLIKASI TUKAR SESAMA INTEGER ---");
        // Ref<Integer> a = new Ref<>(3);
        // Ref<Integer> b = new Ref<>(6);
        // System.out.println("Sebelum ditukar: a = " + a.val + ", b = " + b.val);
        // OperatorGenerik.Tukar(a, b);
        // System.out.println("Setelah ditukar: a = " + a.val + ", b = " + b.val);
        // System.out.println();

        // System.out.println("--- APLIKASI TUKAR SESAMA STRING ---");
        // Ref<String> a = new Ref<>("HITAM");
        // Ref<String> b = new Ref<>("PUTIH");
        // System.out.println("Sebelum ditukar: a = " + a.val + ", b = " + b.val);
        // OperatorGenerik.Tukar(a, b);
        // System.out.println("Setelah ditukar: a = " + a.val + ", b = " + b.val);
        // System.out.println();
        
        // System.out.println("--- APLIKASI TUKAR SESAMA ANABUL ---");
        // Ref<Anabul> a = new Ref<>(A2);
        // Ref<Anabul> b = new Ref<>(A1);
        // System.out.println("Sebelum ditukar: a = " + a.val + ", b = " + b.val);
        // OperatorGenerik.Tukar(a, b);
        // System.out.println("Setelah ditukar: a = " + a.val + ", b = " + b.val);
        // System.out.println("Total bobot kucing A1 dan A2: " + OperatorGenerik.Bobot2((Kucing) A1, (Kucing) A4) + " kg");
        // System.out.println();

        
        System.out.println("--- APLIKASI KELAS GENERIK DATA ---");
        Data<Integer> dataInt = new Data<>();
        dataInt.setIsi(1, 10);
        dataInt.setIsi(2, 20);
        System.out.println("Isi posisi 1: " + dataInt.getIsi(1));
        System.out.println("Isi posisi 2: " + dataInt.getIsi(2));
        System.out.println("Jumlah elemen: " + dataInt.getSize());
        System.out.println();
        
        System.out.println("--- APLIKASI setIsi ANABUL ---");
        Data<Anabul> dataAnabul = new Data<>();
        dataAnabul.setIsi(1, new Kucing("Panda", 6));
        dataAnabul.setIsi(2, new Anjing("Goba"));
        dataAnabul.setIsi(3, new Kucing("Siro", 5));
        dataAnabul.setIsi(4, new Burung("Wiku"));
        dataAnabul.setIsi(5, new Burung("Waku"));
        System.out.println("Data berhasil dimasukkan");
        System.out.println();

        System.out.println("--- APLIKASI getIsi ANABUL ---");
        Anabul B1 = dataAnabul.getIsi(1);
        Anabul B2 = dataAnabul.getIsi(2);
        Anabul B3 = dataAnabul.getIsi(3);
        Anabul B4 = dataAnabul.getIsi(4);
        Anabul B5 = dataAnabul.getIsi(5);
        System.out.println("Data Anabul posisi 1: ");
        B1.printInfo();
        System.out.println("Data Anabul posisi 2: ");
        B2.printInfo();
        System.out.println("Data Anabul posisi 3: ");
        B3.printInfo();
        System.out.println("Data Anabul posisi 4: ");
        B4.printInfo();
        System.out.println("Data Anabul posisi 5: ");
        B5.printInfo();
        
        System.out.println("--- APLIKASI getSize ANABUL ---");
        System.out.println("Jumlah Anabul: " + dataAnabul.getSize());
    }

}

/* RENUNGAN */
/* Konsep Generik pada pemrograman berorientasi objek adalah konsep yang memungkinkan 
kita sebagai programmer untuk membuat kelas atau metode yang sifatnya generik atau umum.
Maksudnya adalah kelas atau metode tersebut bisa digunakan untuk banyak tipe data, 
tanpa harus membuat lagi kode yang sama (fleksibel). Contohnya adalah pada
kelas generik Ref yang dapat berisi object Integer, String, dan Anabul. 
Kelas generik Data juga dapat diisi oleh object Integer dan Anabul */

