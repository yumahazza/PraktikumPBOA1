public class MMatkul {
    public static void main(String[] args) {
        // Buat objek MataKuliah
        String mik = "52503";
        String matkul = "Machine Learning";
        int sks = 3;
        MataKuliah MK1 = new MataKuliah(mik, matkul, sks);
        MataKuliah MK2 = new MataKuliah();

        // Aplikasi printDetailMatkul
        System.out.println("Detail matkul MK1:");
        MK1.printDetailMatkul();
        System.out.println("Detail matkul MK2:");
        MK2.printDetailMatkul();
        System.out.println("");

        // Aplikasi mutator
        String mik2 = "22504";
        String nama2 = "Statistika";
        int sks2 = 2;
        MK2.setIdMK(mik2);
        MK2.setNamaMK(nama2);
        MK2.setSks(sks2);
        System.out.println("Detail matkul MK2 setelah diisi:");
        MK2.printDetailMatkul();
        System.out.println("");
        
        // Aplikasi selektor
        String p_mik = MK1.getIdMK();
        String p_nama = MK1.getNamaMK();
        int p_sks = MK1.getSks();
        System.out.println("Detail matkul MK1 dalam getter:");
        System.out.println(p_mik);
        System.out.println(p_nama);
        System.out.println(p_sks);
        System.out.println("");
        

    }
}