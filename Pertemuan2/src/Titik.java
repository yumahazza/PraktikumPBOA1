/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Yuma Hazza Yuditama
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
        this(0, 0);
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
            } else{
                return 4;
            }
        } else{
            if(ordinat > 0){
                return 2;
            } else{
                return 3;
            }
        }
    }

    double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    double getJarak(Titik T){
        double x = T.getAbsis() - absis;
        double y = T.getOrdinat() - ordinat;

        return Math.sqrt((x * x) + (y * y));
    }



}



