/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Yuma Hazza Yuditama
 * NIM          : 24060124120035
 * Tanggal      : 23 Februari 2026
 */


public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* METHOD */
    // konstruktor unruk membuat titik (absis, ordinat)
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    // konstruktor untuk membuat titik (0, 0)
    Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")"); 
    }

    int getKuadran(){
        if(absis > 0){
            if(ordinat > 0){
                return 1;
            } else if(ordinat < 0){
                return 4;
            }
        } else if(absis < 0){
            if(ordinat > 0){
                return 2;
            } else if(ordinat < 0){
                return 3;
            }
        }

        return 0;
    }

    double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    double getJarak(Titik T){
        double x = T.getAbsis() - absis;
        double y = T.getOrdinat() - ordinat;

        return Math.sqrt((x * x) + (y * y));
    }

    void refleksiX(){
        ordinat = ordinat * (-1);
    }

    void refleksiY(){
        absis = absis * (-1);
    }

    Titik getRefleksiX(){
        Titik T = new Titik();
        T.absis = absis;
        T.ordinat = ordinat * (-1);

        return T;
    }

    Titik getRefleksiY(){
        Titik T = new Titik();
        T.absis = absis * (-1);
        T.ordinat = ordinat;

        return T;
    }
}