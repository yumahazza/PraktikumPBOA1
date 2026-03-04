/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Yuma Hazza Yuditama
<<<<<<< HEAD
 * NIM          : 24060124120035
 * Tanggal      : 25 Februari 2026
=======
 * Tanggal      : 26 Februari 2026
>>>>>>> Pertemuan3
 */

public class Garis {
    /* ATRIBUT */
<<<<<<< HEAD
    Titik TAwal;
    Titik TAkhir;
    static int counterGaris = 0;

    /* METHOD */
    // konstruktor
    Garis(){
        TAwal = new Titik(0, 0);
        TAkhir = new Titik (1, 1);
        counterGaris++;
    }

    Garis(Titik TAwal, Titik TAkhir){
        this.TAwal = TAwal;
        this.TAkhir = TAkhir;
        counterGaris++;
    }

=======
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
>>>>>>> Pertemuan3
    static int getCounterGaris(){
        return counterGaris;
    }

<<<<<<< HEAD
    Titik getTAwal(){
        return TAwal;
    }

    Titik getTAkhir(){
        return TAkhir;
    }

    void setTAwal(Titik X){
        TAwal.absis = X.absis;
        TAwal.ordinat = X.ordinat;
    }

    void setTAkhir(Titik Y){
        TAkhir.absis = Y.absis;
        TAkhir.ordinat = Y.ordinat;
    }

    void printGaris(){
        double x1 = TAwal.absis;
        double y1 = TAwal.ordinat;
        double x2 = TAkhir.absis;
        double y2 = TAkhir.ordinat;

        System.out.println("Garis ((" + x1 + ", " + y1 + "),(" + x2 + ", " + y2 + "))");
    }

    double panjangGaris(){
        double x1 = TAwal.absis;
        double y1 = TAwal.ordinat;
        double x2 = TAkhir.absis;
        double y2 = TAkhir.ordinat;

        double d1 = (x2 - x1) * (x2 - x1);
        double d2 = (y2 - y1) * (y2 - y1);

        return Math.sqrt(d1 + d2);
    }

    double gradien(){
        double x1 = TAwal.absis;
        double y1 = TAwal.ordinat;
        double x2 = TAkhir.absis;
        double y2 = TAkhir.ordinat;

        return ((y2 - y1) / (x2 - x1));
    }

    Titik titikTengah(){
        Titik T = new Titik();
        double x1 = TAwal.absis;
        double y1 = TAwal.ordinat;
        double x2 = TAkhir.absis;
        double y2 = TAkhir.ordinat;
        T.absis = (x1 + x2) / 2;
        T.ordinat = (y1 + y2) / 2;
=======
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
>>>>>>> Pertemuan3

        return T;
    }

<<<<<<< HEAD
    boolean cekSejajar(Garis P){
        Garis T = new Garis(TAwal, TAkhir);
        double Mt = T.gradien();
        double Mp = P.gradien();

        return (Mt == Mp);
    }

    boolean cekTegakLurus(Garis P){
        Garis T = new Garis(TAwal, TAkhir);
        double Mt = T.gradien();
        double Mp = P.gradien();

        return (Mt * Mp == -1);
    }

    void persGaris(){
        Garis T = new Garis(TAwal, TAkhir);
        double x1 = TAwal.absis;
        double y1 = TAwal.ordinat;
        double m = T.gradien();
        double c = 0;

        if(y1 < 0){
            c = (m * (-x1)) - y1;
        } else{
            c = (m * (-x1)) + y1;
        }

        if(m == 1.0 && c != 0){
            System.out.println("y = x" + c);
        } else if(m == 1.0 && c == 0){
            System.out.println("y = x");
        }else if(m == 0.0){
            System.out.println("y = " + c);
        } else if(c > 0){
            System.out.println("y = " + m + "x + " + c);
        } else if(c < 0){
            System.out.println("y = " + m + "x - " + (c * -1));

        }
    }
}

=======
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
>>>>>>> Pertemuan3
