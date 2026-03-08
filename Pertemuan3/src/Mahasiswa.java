public class Mahasiswa {
    /* ATRIBUT */
    private String NIM;
    private String Nama;
    private String Prodi;
    private MataKuliah[] listMatkul = new MataKuliah[50];
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int jumlahMatkul = 0;

    /* METHOD */
    /* Konstruktor */
    // konstruktor tanpa parameter
    public Mahasiswa(){
        this.NIM = "-";
        this.Nama = "-";
        this.Prodi = "-";
    }

    // konstruktor dengan parameter nim, nama, prodi
    public Mahasiswa(String NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    /* Selektor */
    // selektor untuk NIM mahasiswa
    public String getNIM(){
        return NIM;
    }

    // selektor untuk Nama mahasiswa
    public String getNamaMhs(){
        return Nama;
    }

    // selektor untuk prodi mahasiswa
    public String getProdiMhs(){
        return Prodi;
    }

    // selektor untuk mata kuliah yang diambil mahasiswa
    public MataKuliah[] getListMatkul(){
        return listMatkul;
    }

    // selektor untuk dosen wali mahasiswa
    public Dosen getDosenWali(){
        return dosenWali;
    }

    // selektor untuk kendaraan mahasiswa
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    // mutator untuk NIM mahasiswa
    public void setNim(String nimx){
        this.NIM = nimx;
    }

    // mutator untuk nama mahasiswa
    public void setNamaMhs(String namax){
        this.Nama = namax;
    }

    // mutator untuk prodi mahasiwa
    public void setProdiMhs(String prodix){
        this.Prodi = prodix;
    }

    // mutator untuk matkul mahasiswa
    public void addMatkul(MataKuliah matkul){
    if (this.jumlahMatkul < 50) {
        this.listMatkul[this.jumlahMatkul] = matkul;
        this.jumlahMatkul++;
        }
    }
    
    // mutator untuk dosen wali mahasiswa
    public void setDosenWali(Dosen dosenW){
        this.dosenWali = dosenW;
    }

    // mutator untuk kendaraan mahasiswa
    public void setKendMhs(Kendaraan kend){
        this.kendaraan = kend;
    }

    // method untuk mendapatkan jumlah sks mata kuliah yang dimabil mahasiswa
    public int getJumlahSks(){
        int totalSks = 0;

        for(int i = 0; i < jumlahMatkul; i++){
            totalSks += listMatkul[i].getSks();
        }

        return totalSks;
    }

    // method untuk mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatkul(){
        return jumlahMatkul;
    }

    // method untuk menampilkan nim- nama, dan prodi mahasiswa
    public void printMhs(){
        System.out.println("NIM: " + this.NIM);
        System.out.println("Nama: " + this.Nama);
        System.out.println("Prodi: " + this.Prodi);
    }

    // method untuk menampilkan nim, nama, prodi, daftar mata kuliah
    // yang diambil, data dosen wali, data kendaraan.
    public void printDetailMhs(){
    System.out.println("NIM: " + getNIM());
    System.out.println("Nama: " + getNamaMhs());
    System.out.println("Prodi: " + getProdiMhs());
    System.out.println("Dosen wali: " + getDosenWali().getNama());
    System.out.println("Daftar mata kuliah:");
    for(int i = 0; i < jumlahMatkul; i++){
        System.out.println("- " + listMatkul[i].getNamaMK() + " (" + listMatkul[i].getSks() + " SKS)");
    }
    System.out.println("Jumlah Matkul: " + getJumlahMatkul());
    System.out.println("Jumlah SKS: " + getJumlahSks());
    System.out.println("Kendaraan: " + getKendaraan().getJenis());

    }
}