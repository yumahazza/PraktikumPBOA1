// Nama file    : Persegi.java
// Deskripsi    : program class Persegi yang mewarisi class BangunDatar
// Pembuat      : Yuma Hazza Yuditama
// Tanggal      : 17 Maret 2026

public class Persegi extends BangunDatar{
    /* ATRIBUT */
    private double sisi;

    /* METHOD */
    /* KONSTRUKTOR */
    // konstruktor bangun datar persegi dengan jumlah sisi 4
    public Persegi(int pSisi){
        setJmlSisi(4);
        this.sisi = pSisi;
    }

    // konstruktor bangun datar persegi dengan parameter
    public Persegi(double pSisi, String warna, String border){
        super(4, warna, border);
        if(pSisi == 4){
            this.sisi = pSisi;
        } 
    }


    /* MUTATOR */
    // method mutator sisi persegi
    public void setSisi(double xSisi){
        this.sisi = xSisi;
    }


    /* SELEKTOR */
    // method selektor sisi persegi
    public double getSisi(){
        return sisi;
    }

    
    /* METHOD LAINNYA */
    // method untuk menghitung luas persegi
    public double getLuas(){
        return sisi * sisi;
    }

    // method untuk menghitung keliling persegi
    public double getKeliling(){
        return sisi * 4;
    }

    // method untuk menghitung diagonal persegi
    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    // method menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    // method menambah ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    // method menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoom(int percent){
        sisi = sisi * percent / 100;
    }

    // method menampilkan info persegi
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    
}