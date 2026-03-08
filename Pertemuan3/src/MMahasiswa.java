public class MMahasiswa {
    public static void main(String[] args) {
        // Buat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("2406011", "Farhan Akbar", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa();
        Dosen dosen_1 = new Dosen("198901012016", "Andi Wijaya", "Informatika");
        Dosen dosen_2 = new Dosen("197525102010", "Firman Gumelar", "Informatika");
        MataKuliah bing1 = new MataKuliah("12403", "Bahasa Inggris I", 1);
        MataKuliah daspro = new MataKuliah("12401", "Dasar Pemrograman", 3);
        MataKuliah stat = new MataKuliah("22408", "Statistika", 2);
        MataKuliah agama = new MataKuliah("22412", "Pendidikan Agama", 2);
        MataKuliah basdat = new MataKuliah("32404", "Basis Data", 4);
        MataKuliah iot = new MataKuliah("32411", "Internet of Things", 2);
        MataKuliah asa = new MataKuliah("42403", "Analisis dan Strategi Algoritma", 3);
        MataKuliah imk = new MataKuliah("42412", "Interaksi Manusia dan Komputer", 3);
        Kendaraan mot1 = new Kendaraan("H 3972 XP", "Motor");
        Kendaraan mob1 = new Kendaraan("AD 1479 KT", "Mobil");

        // Aplikasi method mutator
        mhs1.setDosenWali(dosen_1);
        mhs1.setKendMhs(mot1);
        mhs1.addMatkul(basdat);
        mhs1.addMatkul(iot);
        mhs1.addMatkul(asa);
        mhs1.addMatkul(imk);
        System.out.println("Data detail Mhs1: ");
        mhs1.printDetailMhs();

        System.out.println("");

        mhs2.setNim("2406084");
        mhs2.setNamaMhs("Alex Munawar");
        mhs2.setProdiMhs("Informatika");
        mhs2.setDosenWali(dosen_2);
        mhs2.setKendMhs(mob1);
        mhs2.addMatkul(bing1);
        mhs2.addMatkul(daspro);
        mhs2.addMatkul(stat);
        mhs2.addMatkul(agama);
        System.out.println("Data detail Mhs2: ");
        mhs2.printDetailMhs();

        System.out.println("");

        // Aplikasi method selektor
        System.out.println(mhs1.getNamaMhs());
        System.out.println(mhs1.getNIM());
        System.out.println(mhs1.getProdiMhs());
        System.out.println(mhs1.getDosenWali().getNama());
        for (MataKuliah mk : mhs1.getListMatkul()) {
            if (mk != null) {
                System.out.println("- " + mk.getNamaMK());
            }
        }
        System.out.println(mhs1.getJumlahMatkul());
        System.out.println(mhs1.getJumlahSks());
        System.out.println(mhs1.getKendaraan().getJenis());


    }
}


