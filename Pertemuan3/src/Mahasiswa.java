import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    /* ATRIBUT */
    private String NIM;
    private String Nama;
    private String Prodi;
    private List<MataKuliah> listMaktul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

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
    // selektor untuk NIM Mahasiswa
    public String getNIM(){
        return NIM;
    }

    // selektor untuk Nama Mahasiswa
    public String getNamaMhs(){
        return Nama;
    }

    // selektor untuk prodi Mahasiswa
    public String getProdiMhs(){
        return Prodi;
    }

    // selektor

}
