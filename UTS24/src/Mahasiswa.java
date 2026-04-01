public class Mahasiswa extends Civitas{
    private String nim;
    private int semester;
    private String fakultas;

    public Mahasiswa(String Nama, String Email){
        super(Nama, Email);
        this.nim = null;
        this.semester = 0;
        this.fakultas = null;
    }

    public Mahasiswa(String Nama, String Email, String Nim, int s, Fakultas F){
        super(Nama, Email);
        this.nim = Nim;
        this.semester = s;
        this.fakultas = F.getNamaFakul();
    }

    public String getNIM(){
        return nim;
    }

    public int getSemester(){
        return semester;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void setSemester(int s){
        this.semester = s;
    }

    public void setFakultas(Fakultas F){
        this.fakultas = F.getNamaFakul();
    }

    @Override
    public void printInfo(){
        System.out.println("NIM         : " + getNIM());
        System.out.println("Nama        : " + getNama());
        System.out.println("Semester    : " + getSemester());
        System.out.println("Fakultas    : " + getFakultas());
    }
}
