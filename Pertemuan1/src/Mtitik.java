// Nama File   : Titik.java
// Deskripsi   : berisi atribut dan method dalam class Titik
// Pembuat     : Yuma Hazza Yuditama
// Tanggal     : 19 Februari 2026

public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(10);
        T1.setOrdinat(3);
        T1.printTitik();
        T1.geser(1, 3);
        T1.printTitik();
    }
}

class Titik {
    /*********ATRIBUT***********/
    double absis;
    double ordinat;
    
    /*********METHOD***********/
    // konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    // mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }


} // end class Titik


