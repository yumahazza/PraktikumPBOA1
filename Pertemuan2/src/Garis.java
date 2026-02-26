/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 26 Februari 2026
 */

public class Garis {
    /* ATRIBUT */
    private Titik TAwal;
    private Titik TAkhir;
    private static int counterGaris = 0;

    /* METHOD */
    // konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    public Garis(){
        this.TAwal = new Titik(0, 0);
        this.TAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // konstruktor dengan parameter masukan titik awal dan titik akhir. 
    public Garis(Titik P, Titik Q){
        this.TAwal = P;
        this.TAkhir = Q;
        counterGaris++;
    }

    // selektor (getter) untuk titik awal
    public Titik getTAwal(){
        return TAwal;
    }
    
    // selektor (getter) untuk titik akhir
    public Titik getAkhir(){
        return TAkhir;
    }

    // mutator (setter) untuk titik awal
    public void setTAwal(Titik P){
        this.TAwal = P;
    }
    
    // mutator (setter) untuk titik akhir
    public void setAkhir(Titik Q){
        this.TAkhir = Q;
    }

    // selektor untuk mendapatkan atribut static counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    // method untuk mendapatkan panjang sebuah garis
    public double getPGaris(){
        double x1 = this.TAwal.absis;
        double y1 = this.TAwal.ordinat;
        double x2 = this.TAkhir.absis;
        double y2 = this.TAkhir.ordinat;

        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }

    // method untuk mendapatkan gradien dari sebuah garis
    public double gradien(){
        double x1 = this.TAwal.absis;
        double y1 = this.TAwal.ordinat;
        double x2 = this.TAkhir.absis;
        double y2 = this.TAkhir.ordinat;

        return (y2 - y1) / (x2 - x1);
    }

    // method untuk mendapatkan titik tengah dari sebuah garis
    public Titik TTengah(){
        Titik T = new Titik();
        T.absis = (this.TAwal.absis + this.TAkhir.absis) / 2;
        T.ordinat = (this.TAwal.ordinat + this.TAkhir.ordinat) / 2;

        return T;
    }

    // method untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya, 
    // mengembalikan true jika sejajar dan false jika sebaliknya 
    public boolean isSejajar(Garis P){
        return (this.gradien() == P.gradien());
    }

    // method untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya, 
    // mengembalikan true jika sejajar dan false jika sebaliknya
    public boolean isTegakLurus(Garis P){
        return (this.gradien() * P.gradien() == -1);
    }

    // method untuk menampilkan ke layar titik awal dan titik akhir garis
    public void printGaris(){
        double x1 = this.TAwal.absis;
        double y1 = this.TAwal.ordinat;
        double x2 = this.TAkhir.absis;
        double y2 = this.TAkhir.ordinat;

        System.out.println("Garis ((" + x1 + ", " + y1 + "),(" + x2 + ", " + y2 + "))");
    }

    // method untuk menampilkan persamaan garis dalam bentuk string y = mx + c
    // contoh: garis yang dibuat dari titik (-2,0) dan (0,4) mempunyai persamaan garis y = 2x + 4 
    public void persGaris(){
        double x1 = this.TAwal.absis;
        double y1 = this.TAwal.ordinat;
        double m = this.gradien();
        double c;

        if(y1 < 0){
            c = (m * (x1 * -1)) - (y1 * -1);
        } else{
            c = (m * (x1 * -1)) + y1;
        }

        if(m == 0 && c == 0){
            System.out.println("y = 0");
        } else if(m == 0 && c != 0){
            System.out.println("y = " + c);
        } else if(m != 0 && c == 0){
            System.out.println("y = " + m + "x");
        } else if(c < 0){
            System.out.println("y = " + m + "x" + c);
        } else if(c > 0){
            System.out.println("y = " + m + "x+" + c);
        }
    }
}