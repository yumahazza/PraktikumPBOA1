/* Nama file    : Mahasiswa.java 
 * Deskripsi    : program class anak Mahasiswa
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 25 April 2026
 * */

public abstract class Mahasiswa extends Civitasakademika{
    /* ATRIBUT */
    protected String NIM;
    protected Dosen Dosenwali;

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    public Mahasiswa(){
        setNama("n/a");
        this.NIM = "n/a";
    }

    public Mahasiswa(String P, String X){
        setNama(P);
        this.NIM = X;
    }

    /* SELEKTOR */
    @Override
    public String getNomor(){
        return NIM;
    }

    public Dosen getDosenWali(){
        return Dosenwali;
    }

    /* MUTATOR */
    public void setNIM(String P){
        this.NIM = P;
    }

    public void setWali(Dosen D){
        this.Dosenwali = D;
    }

    /* METHOD LAINNYA */
    public void tampilDataMahasiswa(){
        System.out.println("NIM             : " + getNomor());
        System.out.println("Nama Mahasiswa  : " + getNama());
        System.out.println("Nama Dosen Wali : " + getDosenWali());
        
    }
    
}