public class MMahasiswa{
    public static void main(String[] args){
        // bagian a, b, c
        Mahasiswa M1 = new Mahasiswa();
        Mahasiswa M2 = new Mahasiswa();
        Mahasiswa M3 = new Mahasiswa();
        Mahasiswa M4 = new Mahasiswa();
        Mahasiswa M5 = new Mahasiswa();

        M1.setNIM("562041");
        M2.setNIM("389601");
        M3.setNIM();
        M4.setNIM();

        M1.setNama("Go Youn-jung");
        M2.setNama("Hwang Ye-ji");
        M3.setNama(M2);
        M4.setNama();

        M1.setProgramStudi("Astronomi");
        M2.setProgramStudi("Sastra Indonesia");
        M3.setProgramStudi(M1);
        M4.setProgramStudi();

        System.out.println("Mahasiswa 1");
        M1.printInfo();
        System.out.println("Mahasiswa 2");
        M2.printInfo();
        System.out.println("Mahasiswa 3");
        M3.printInfo();
        System.out.println("Mahasiswa 4");
        M4.printInfo();
        System.out.println("Mahasiswa 5");
        M5.printInfo();
        
        // bagian d
        Mahasiswa M6 = new Mahasiswa("857302", "Choi Jiwoo", "Manajemen");
        System.out.println("Mahasiswa 6");
        M6.printInfo();

        // bagian e
        Mahasiswa M7 = new Mahasiswa(M6);
        System.out.println("Mahasiswa 7");
        M7.printInfo();



    }
}
