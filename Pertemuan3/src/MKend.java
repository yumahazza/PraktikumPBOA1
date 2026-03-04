public class MKend {
    public static void main(String[] args) {
        // Buat objek kendaraan
        String no1 = "H 3780 AP";
        String jenis1 = "motor";
        Kendaraan vario1 = new Kendaraan(no1, jenis1);
        Kendaraan vario2 = new Kendaraan("-", jenis1);  
        Kendaraan avanza1 = new Kendaraan();

        // Aplikasi method printDetailKend
        System.out.println("Detail vario1: ");
        vario1.printDetailKend();
        System.out.println("");

        System.out.println("Detail vario2: ");
        vario2.printDetailKend();
        System.out.println("");

        // Aplikasi mutator
        String no2 = "B 1105 IR";
        String no3 = "AD 2719 BVR";
        String jenis2 = "mobil";
        vario2.setNoPlat(no2);
        System.out.println("Detail vario2: ");
        vario2.printDetailKend();
        System.out.println("");
        
        avanza1.setNoPlat(no3);
        avanza1.setJenis(jenis2);
        System.out.println("Detail avanza1: ");
        avanza1.printDetailKend();
        System.out.println("");

        // Aplikasi getter
        String no4 = "K 3345 KL";
        Kendaraan crv1 = new Kendaraan(no4, jenis2);
        String p_noplat = crv1.getNoPlat();
        String p_jenis = crv1.getJenis();
        System.out.println("Detail crv1 dengan getter:");
        System.out.println(p_noplat);
        System.out.println(p_jenis);

        
    }
}