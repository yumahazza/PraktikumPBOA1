// Nama file    : BangunDatar.java
// Deskripsi    : program class BangunDatar
// Pembuat      : Yuma Hazza Yuditama
// Tanggal      : 17 Maret 2026

public abstract class BangunDatar implements IResize{
    /* ATRIBUT */
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBD = 0;

    /* METHOD */
    /* KONSTRUKTOR */
    // konstruktor tanpa parameter
    public BangunDatar(){
        counterBD++;
    }
    
    // konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBD++;
    }


    /* MUTATOR */
    // method mutator jumlah sisi
    public void setJmlSisi(int Sisi){
        this.jmlSisi = Sisi;
    }

    // method mutator warna
    public void setWarna(String Warna){
        this.warna = Warna;
    }

    // method mutator border
    public void setBorder(String Border){
        this.border = Border;
    }


    /* SELEKTOR */
    // method selektor jumlah sisi
    public int getJumlSisi(){
        return jmlSisi;
    }

    // method selektor warna
    public String getWarna(){
        return warna;
    }

    // method selektor border
    public String getBorder(){
        return border;
    }


    /* METHOD LAINNYA */
    // method hitung luas
    public abstract double getLuas();

    // method hitung keliling
    public abstract double getKeliling();

    // method untuk mengecek apakah sebuah objek bangun datar
    // memiliki luas yang sama dengan bangun datar lainnya
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    // method untuk mengecek apakah sebuah objek bangun datar
    // memiliki keliling yang sama dengan bangun datar lainnya
    public boolean isEqualKel(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    // method menampilkan info bangun datar
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // method counter bangun datar
    public static void printCounterBD(){
        System.out.println("Jumlah objek bangun datar: " + counterBD);
    }

    
}