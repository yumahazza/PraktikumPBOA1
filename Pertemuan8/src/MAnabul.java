/* Nama file    : MAnabul.java
 * Deskripsi    : Program main unutk implementasi poliforfisme
                    universal inclusion
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 30 April 2026
 * */



public class MAnabul{
    public static void main(String[] args) {
        System.out.println("APLIKASI Class Anabul, Kucing, Anjing, dan Burung");
        Anabul A1 = new Kucing();
        Anabul A2 = new Anjing();
        Anabul A3 = new Burung();
        Anabul A4 = new Kucing("Oceng", 5);
        Datum<Kucing> G1 = new Datum<>();
        Kucing K1 = new Kucing("Acid", 5);
        G1.setIsi(K1);
 
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
        System.out.println("Anabul G1");
        System.out.println("--- " + G1.getIsi());
        System.out.println();

        // System.out.println("APLIKASI TUKAR SESAMA INTEGER");
        // Ref<Integer> a = new Ref<>(3);
        // Ref<Integer> b = new Ref<>(6);
        // System.out.println("Sebelum ditukar: a = " + a.val + ", b = " + b.val);
        // OperatorGenerik.Tukar(a, b);
        // System.out.println("Setelah ditukar: a = " + a.val + ", b = " + b.val);
        // System.out.println();

        // System.out.println("APLIKASI TUKAR SESAMA STRING");
        // Ref<String> a = new Ref<>("HITAM");
        // Ref<String> b = new Ref<>("PUTIH");
        // System.out.println("Sebelum ditukar: a = " + a.val + ", b = " + b.val);
        // OperatorGenerik.Tukar(a, b);
        // System.out.println("Setelah ditukar: a = " + a.val + ", b = " + b.val);
        // System.out.println();
        
        // System.out.println("APLIKASI TUKAR SESAMA ANABUL");
        // Ref<Anabul> a = new Ref<>(A2);
        // Ref<Anabul> b = new Ref<>(A1);
        // System.out.println("Sebelum ditukar: a = " + a.val + ", b = " + b.val);
        // OperatorGenerik.Tukar(a, b);
        // System.out.println("Setelah ditukar: a = " + a.val + ", b = " + b.val);
        // System.out.println();

        // System.out.println("Total bobot kucing A1 dan A2: " + OperatorGenerik.Bobot2((Kucing) A1, (Kucing) A4) + " kg");


        



    }
}
