public class MDosen {
    public static void main(String[] args) {
        // Buat objek Dosen
        String NIP = "1995060720";
        String Nama = "Prabowo";
        String Prodi = "Informatika";
        Dosen Dosen1 = new Dosen(NIP, Nama, Prodi);
        Dosen Dosen2 = new Dosen();

        // Aplikasi printDetailDosen()
        System.out.println("Detail Dosen1:");
        Dosen1.printDetailDosen();
        System.out.println("Detail Dosen2:");
        Dosen2.printDetailDosen();
        System.out.println("");

        // Aplikasi mutator
        String NIP2 = "1985151018";
        String Nama2 = "Megawati";
        String Prodi2 = "Kimia";
        Dosen2.setNIP(NIP2);
        Dosen2.setNama(Nama2);
        Dosen2.setProdi(Prodi2);
        System.out.println("Detail Dosen2 setelah diisi:");
        Dosen2.printDetailDosen();
        System.out.println("");

        // Aplikasi selektor
        String p_NIP = Dosen1.getNIP();
        String p_Nama = Dosen1.getNama();
        String p_Prodi = Dosen1.getProdi();
        System.out.println(p_NIP);
        System.out.println(p_Nama);
        System.out.println(p_Prodi);

        
    }
}
