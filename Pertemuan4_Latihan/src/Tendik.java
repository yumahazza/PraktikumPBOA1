/* Nama file    : Tendik.java
 * Deskripsi    : program class Tendik berisi atribut dan method
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 14 Maret 2026
*/

public class Tendik extends Pegawai{
    /* ATRIBUT */
    private String Bidang;

    /* METHOD */
    /*  KONSTRUKTOR */
    public Tendik(){
        setBUP(55);
        setJabatan("Tendik");
    }

    /* MUTATOR */
    // mutator atribut Bidang
    public void setBidang(String Bidang){
        if(Bidang == "Akademik" || Bidang == "Kemahasiswaan" || Bidang == "Sumber Daya"){
            this.Bidang = Bidang;
        } else{
            this.Bidang = "-";
        }
    }

    /* SELEKTOR */
    // selektor atribut Bidang
    public String getBidang(){
        return Bidang;
    }

    // method untuk menampilkan info atau detaul class Tendik
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang: " + Bidang);
    }


    
}
