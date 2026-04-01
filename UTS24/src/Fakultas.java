public class Fakultas{
    protected String namaFakultas;
    protected int tarifUKT;
    protected int gajiPokok;

    public Fakultas(String nFakultas, int UKT, int gaji){
        this.namaFakultas = nFakultas;
        this.tarifUKT = UKT;
        this.gajiPokok = gaji;
    }

    public String getNamaFakul(){
        return namaFakultas;
    }

    public int getTarifUKT(){
        return tarifUKT;
    }

    public int getGajiPokok(){
        return gajiPokok;
    }

    public void setNamaFakul(String nFakultas){
        this.namaFakultas = nFakultas;
    }

    public void setTarifUKT(int UKT){
        this.tarifUKT = UKT;
    }

    public void setGaji(int gaji){
        this.gajiPokok = gaji;
    }

    public void printInfoFakultas(){
        System.out.println("Fakultas    : " + getNamaFakul());
        System.out.println("Tarif UKT   : " + getTarifUKT());
        System.out.println("Gaji Pokok  : " + getGajiPokok());
    }
}
