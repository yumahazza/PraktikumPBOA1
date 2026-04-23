public class AdHocCoersion{
    public static void main(String[] args) throws Exception {
        // bagian a
        int x = 65;
        String x1 = Character.toString(x);
        double x2 = x;
        String number = "999";
        int number1 = Integer.parseInt(number);
        double number2 = Double.parseDouble(number);

        System.out.println("Nilai x: " + x);
        System.out.println("Nilai x1: " + x1);
        System.out.println("Nilai x2: " + x2);
        System.out.println("Nilai number: " + number);
        System.out.println("Nilai number1: " + number1);
        System.out.println("Nilai number2: " + number2);

        
    }
}
