public class Pelatihan{
    /* ATRIBUT */
    protected String kodeLPK;
    protected String namaLPK;
    protected String jenisLPK;
    protected int kuotaLPK;
    protected String instruktor;
    protected double harga;
    protected double pajak;

    /* METHOD */
    protected Pelatihan(String kode, String nama, String jenis, int kuota,
        String instruktor, double harga, double pajak){
            this.kodeLPK = kode;
            this.namaLPK = nama;
            this.jenisLPK = jenis;
            this.kuotaLPK = kuota;
            this.instruktor = instruktor;
            this.harga = harga;
            this.pajak = pajak;
    }

    public String getKodeLPK(){
        return kodeLPK;
    }

    public String getNamaLPK(){
        return namaLPK;
    }

    public String getJenisLPK(){
        return jenisLPK;
    }

    public int getKuotaLPK(){
        return kuotaLPK;
    }

    public String getInstruktor(){
        return instruktor;
    }
}
