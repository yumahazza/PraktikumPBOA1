class Mahasiswa{
    /* ATRIBUT */
    protected String NIM;
    protected String Nama;
    protected String Programstudi;

    /* METHOD / OPERATOR */
    // konstruktor
    public Mahasiswa(String nim, String nama, String Prodi){
        this.NIM = nim;
        this.Nama = nama;
        this.Programstudi = Prodi;
    }

    // tanpa parameter
    public void setProgramStudi(){
        this.Programstudi = "Kosong";
    }

    // satu paramter string
    public void setProgramStudi(String P){
        this.Programstudi = P;
    }

    // satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa M){
        this.Programstudi = M.Programstudi;
    }
}

public class AdHocOverloading{
    
}
