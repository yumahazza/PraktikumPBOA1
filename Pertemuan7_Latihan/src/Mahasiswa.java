/* Nama file    : Mahasiswa.java 
 * Deskripsi    : program class anak Mahasiswa
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 25 April 2026
 * */

public class Mahasiswa extends Civitasakademika{
    /* ATRIBUT */
    protected String NIM;
    protected Dosen Dosenwali;

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    public Mahasiswa(){
        setNama("n/a");
        this.NIM = "n/a";
        this.Dosenwali = new Dosen();
    }

    public Mahasiswa(String P, String X, Dosen D){
        setNama(P);
        this.NIM = X;
        this.Dosenwali = D;
    }

    /* SELEKTOR */
    @Override
    public String getNomor(){
        return NIM;
    }

    public Dosen getWali(){
        return Dosenwali;
    }

    /* MUTATOR */
    @Override
    public void setNomor(String P){
        this.NIM = P;
    }

    public void setWali(Dosen D){
        this.Dosenwali = D;
    }

    /* METHOD LAINNYA */
    @Override
    public void printInfo(){
        System.out.println("NIM             : " + getNomor());
        System.out.println("Nama Mahasiswa  : " + getNama());
        System.out.println("Nama Dosen Wali : " + getWali().getNama());
    }

    public void tampilDataMahasiswa(){
        System.out.println("NIM             : " + getNomor());
        System.out.println("Nama Mahasiswa  : " + getNama());
        System.out.println("Nama Dosen Wali : " + getWali().getNama());  
    }
    
}