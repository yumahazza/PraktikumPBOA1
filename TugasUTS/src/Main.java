// Class Main

public class Main{
    public static void main(String[] args){
        Penumpang p1 = new Penumpang("P001", "Siti", "sisimeow@gmail.com", "08132538744", "Jl. Gagak 5");
        Penumpang p2 = new Penumpang("P002", "Bambang", "bmbg77@gmail.com", "0819973504", "Jl. Onta 7");
        Penumpang p3 = new Penumpang("P003", "Bayu", "bayujos@gmail.com", "08977443031", "Jl. Dukuh 10");
        Penumpang p4 = new Penumpang("P004", "Dina", "dinasari@gmail.com", "08121980705", "Jl. Anggrek 2");
        Driver d1 = new Driver("D001", "Yanto Balap", "yantobalap@gmail.com", "08933557621", "100-200-300");
        Driver d2 = new Driver("D002", "Budi Racing", "budididi@gmail.com", "08944931621", "150-250-350");
        Driver d3 = new Driver("D003", "Satriawan", "wansatria@gmail.com", "081325528004", "200-400-600");
        Driver d4 = new Driver("D004", "Setiawan", "setwan26@gmail.com", "08124798321", "200-430-670");
        Motor motor1 = new Motor(d1,"H 2000 KY", "Beat");
        Motor motor2 = new Motor(d2, "H 1155 IR", "PCX");
        Mobil mobil1 = new Mobil(d3, "H 3727 AMG", "Toyota Innova", "Deluxe");
        Mobil mobil2 = new Mobil(d4, "H 4218 KLI", "Honda Jazz", "Reguler");
        // mobil1.setTipeMobil("Box");
        
        Perjalanan go1 = new Perjalanan("GO001", 8, p1, d1, motor1);
        Perjalanan go2 = new Perjalanan("GO002", 10, p2, d2, motor2);
        Perjalanan go3 = new Perjalanan("GO003", 8, p3, d3, mobil1);
        Perjalanan go4 = new Perjalanan("GO004", 8, p4, d4, mobil2);

        // Data Penumpang
        System.out.println("=====DATA PENENUMPANG=====");
        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
        System.out.println();
        p3.displayInfo();
        System.out.println();
        p4.displayInfo();
        System.out.println();

        // Data Driver
        System.out.println("=====DATA DRIVER=====");
        d1.displayInfo();
        System.out.println();
        d2.displayInfo();
        System.out.println();
        d3.displayInfo();
        System.out.println();
        d4.displayInfo();
        System.out.println();

        // Data Kendaraan
        System.out.println("=====DATA KENDARAAN=====");
        motor1.printInfo();
        System.out.println();
        motor2.printInfo();
        System.out.println();
        mobil1.printInfo();
        System.out.println();
        mobil2.printInfo();
        System.out.println();

        // Data Perjalanan
        System.out.println("=====DATA PERJALANAN=====");
        go1.printInfo();
        System.out.println();
        go2.printInfo();
        System.out.println();
        go3.printInfo();
        System.out.println();
        go4.printInfo();
        System.out.println();
    }
}
