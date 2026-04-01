public class Karyawan extends Civitas{
    protected String nip;
    protected int masaKerja;
    protected int gaji;


    public Karyawan(String Nama, String Email, String Nip, int M, int G){
        super(Nama, Email);
        this.nip = Nip;
        this.masaKerja = M;
        this.gaji = G;
    }

    public String getNIP(){
        return nip;
    }

    public int getMasaKerja(){
        return masaKerja;
    }

    public int getGaji(){
        return gaji;
    }

    @Override
    public void printInfo(){}
}
