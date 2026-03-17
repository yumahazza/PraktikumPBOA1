// Nama file    : Lingkaran.java
// Deskripsi    : program class Lingkaran yang mewarisi class BangunDatar
// Pembuat      : Yuma Hazza Yuditama
// Tanggal      : 17 Maret 2026

public class Lingkaran extends BangunDatar{
    /* ATRIBUT */
    private double jari;

    /* METHOD */
    /* KONSTRUKTOR */
    // konstruktor bangun data lingkaran tanpa parameter
    public Lingkaran(double pJari){
        setJmlSisi(1);
        this.jari = pJari;
    }

    // konstruktor bangun datar lingkaran dengan parameter
    public Lingkaran(double diameter, String warna, String border){
        super(1, warna, border);
        this.jari = diameter / 2;
    }


    /* MUTATOR */
    // method mutator jari-jari lingkaran
    public void setJari(double jari){
        this.jari = jari;
    }


    /* SELEKTOR */
    // method selektor jari-jari lingkaran
    public double getJari(){
        return jari;
    }


    /* METHOD LAINNYA */
    // method menghitung luas lingkaran
    public double getLuas(){
        return Math.PI * (jari * jari);
    }

    // method menghitung keliling lingkaran
    public double getKeliling(){
        return Math.PI * (jari * 2);
    }

    // method menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    // method menambah ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    // method menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoom(int percent){
        jari = jari * percent / 100;
    }

    // method untuk menampilkan info lingkaran
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari); 
    }

}