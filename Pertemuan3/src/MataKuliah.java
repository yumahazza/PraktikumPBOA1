public class MataKuliah {
    /* ATRIBUT */
    private String idMatkul;
    private String Nama;
    private int sks;

    /* METHOD */
    // konstruktor MataKuliah tanpa parameter
    // mengisi id matkul dan nama matkul dengan "-" dan 
    // jumlah sks = 0 (kosong)
    public MataKuliah(){
        this.idMatkul = "-";
        this.Nama = "-";
        this.sks = 0;
    }

    // konstruktor MataKuliah dengan parameter idMatkul, Nama, dan sks
    public MataKuliah(String idMatkul, String Nama, int sks){
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.sks = sks;
    }

    // selektor id matkul dari class MataKuliah
    public String getIdMK(){
        return idMatkul;
    }

    // selektor nama dari class MataKuliah
    public String getNamaMK(){
        return Nama;
    }

    // selektor sks dari class MataKuliah
    public int getSks(){
        return sks;
    }

    // mutator id matkul untuk class MataKuliah
    public void setIdMK(String idMatkul){
        this.idMatkul = idMatkul;
    }

    // mutator nama matkul untuk class MataKuliah
    public void setNamaMK(String namaMK){
        this.Nama = namaMK;
    }

    // mutator sks matkul untuk class MataKuliah
    public void setSks(int sks){
        this.sks = sks;
    }

    // method untuk mencetak detail matakuliah
    public void printDetailMatkul(){
        System.out.println("idMatkul: " + idMatkul);
        System.out.println("Nama: " + Nama);
        System.out.println("Sks: " + sks);
    }

}
