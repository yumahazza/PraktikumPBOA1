/* Nama file    : AdHocCoercion.java
 * Deskripsi    : Program untuk menerapkan konsep polimorfisme ad hoc coersion
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 23 April 2026
 * */

public class AdHocCoersion{
    public static void main(String[] args) throws Exception {
        /* bagian a */
        int x = 65;
        String x1 = Character.toString(x);
        Double x2 = (double) x;
        String number = "999";
        int number1 = Integer.parseInt(number);
        Double number2 = Double.parseDouble(number);

        System.out.println("Bagian a");
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai x1: " + x1);
        System.out.println("Nilai x2: " + x2);
        System.out.println("Nilai number: " + number);
        System.out.println("Nilai number1: " + number1);
        System.out.println("Nilai number2: " + number2);
        System.out.println();
        
        /* bagian b */
        Integer x2_int = x2.intValue();
        
        System.out.println("Bagian b");
        System.out.println("Nilai x2 setelah diubah ke integer: " + x2_int);
        System.out.println();
        
        /* bagian c */
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("Bagian c");
        System.out.println("Nilai S: " + S);
        System.out.println("Nilai Z: " + Z);
        System.out.println();
        
        /* bagian d */
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        
        System.out.println("Bagian d");
        System.out.println("Nilai R: " + R);
        System.out.println("Nilai D: " + D);
        System.out.println();
        
        /*bagian e */
        Integer A = Integer.parseInt(S);

        System.out.println("Bagian e");
        System.out.println("Nilai A: " + A);
        System.out.println();
        
        /* bagian f */
        // String T = Character.toString(A);
        // eror, karena hasilnya terlalu besar untuk unicode

        // perbaikan
        String T = String.valueOf(A);
        
        System.out.println("Bagian f");
        System.out.println("Nilai T: " + T);
        System.out.println();

    }
}
