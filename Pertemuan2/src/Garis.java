/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 25 Februari 2026
 */

public class Garis {
    /* ATRIBUT */
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

    static int getCounterGaris(){
        return counterGaris;
    }

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

        return T;
    }

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

