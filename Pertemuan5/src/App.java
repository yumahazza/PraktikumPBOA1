public class App {
    public static void main(String[] args) throws Exception{
        int hasil = 0;
        System.out.println("Hello, World!");
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                hasil = i + 2;
            } else if(i % 3 == 0){
                hasil = i - 1;
            }
        }

        System.out.println("Hasil: " + hasil);
    }
}
