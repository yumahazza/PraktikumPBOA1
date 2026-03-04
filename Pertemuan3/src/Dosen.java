public class Dosen {
    /* ATRIBUT */
    private String NIP;
    private String Nama;
    private String Prodi;

    /* METHOD */
    // konstruktor tanpa parameter
    // mengisi NIP, Nama, dan Prodi dengan "-" (kosong)
    public Dosen(){
        this.NIP = "-";
        this.Nama = "-";
        this.Prodi = "-";
    }

    // konstruktor
    // mengisi NIP, Nama, dan Prodi dengan string tertentu
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    // selektor NIP dari class Dosen
    public String getNIP(){
        return NIP;
    }

    // selektor Nama dari class Dosen
    public String getNama(){
        return Nama;
    }

    // selektor Prodi dari class Dosen
    public String getProdi(){
        return Prodi;
    }

    // mutator NIP untuk class Dosen
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    // mutator NIP untuk class Dosen
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // mutator Prodi untuk class Dosen
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    // method untuk menampilkan detail data dari Dosen
    public void printDetailDosen(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
    }
}
