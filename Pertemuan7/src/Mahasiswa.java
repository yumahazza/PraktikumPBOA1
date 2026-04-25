/* Nama file    : Mahasiswa.java
 * Deskripsi    : Program implementasi konsep polimorfisme 
                ad hoc overloading pada class Mahasiswa
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 24 April 2026
 * */

public class Mahasiswa{
    /* ATRIBUT */
    protected String NIM;
    protected String Nama;
    protected String Programstudi;

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    // konstruktor tanpa parameter
    public Mahasiswa(){
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String Prodi){
        this.NIM = nim;
        this.Nama = nama;
        this.Programstudi = Prodi;
    }

    public Mahasiswa(Mahasiswa M){
        this.NIM = M.NIM;
        this.Nama = M.Nama;
        this.Programstudi = M.Programstudi;
    }

    

    /* MUTATOR */ 
    public void setNIM(){
        this.NIM = "kosong";
    }

    public void setNIM(String nim){
        this.NIM = nim;
    }

    public void setNama(){
        this.Nama = "kosong";
    }

    public void setNama(String nama){
        this.Nama = nama;
    }

    public void setNama(Mahasiswa M){
        this.Nama = M.Nama;
    }

    public void setProgramStudi(){
        this.Programstudi = "Kosong";
    }

    public void setProgramStudi(String P){
        this.Programstudi = P;
    }

    public void setProgramStudi(Mahasiswa M){
        this.Programstudi = M.Programstudi;
    }

    /* SELEKTOR */
    public String getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Programstudi;
    }

    /* METHOD LAINNYA */
    public void printInfo(){
        System.out.println("NIM           : " + getNIM());
        System.out.println("Nama          : " + getNama());
        System.out.println("Program Studi : " + getProdi());
        System.out.println();
    }
}