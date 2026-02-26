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
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    // konstruktor untuk membuat titik (0, 0)
    public Titik(){
        this(0, 0);
    }

    // selektor untuk mendapatkan atribut static counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    // selektor (getter) untuk mendapatkan nilai absis
    public double getAbsis(){
        return absis;
    }
    
    // selektor (getter) untuk mendapatkan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // mutator (setter) untuk mengubah nilai absis
    public void setAbsis(double x){
        absis = x;
    }
    
    // mutator (setter) untuk mengubah nilai ordinat
    public void setOrdinat(double y){
        ordinat = y;
    }

    // method untuk menggeser posisi titik dengan absis dan ordinat tertentu
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // method untuk menampilkan titik ke layar
    public void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
        
    }

    // method untuk mendapatkan kuadran sebuah titik
    public int getKuadran(){
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

    // method untuk menghitung jarak sebuah titik ke titik pusat (0,0)
    public double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    // method untuk menghitung jarak sebuah titik ke titik lainnya
    public double getJarak(Titik T){
        double x = T.getAbsis() - absis;
        double y = T.getOrdinat() - ordinat;

        return Math.sqrt((x * x) + (y * y));
    }

    // method untuk merefleksikan sebuah titik terhadap sumbu x
    public void refleksiX(){
        this.ordinat = this.ordinat * (-1);
    }

    // method untuk merefleksikan sebuah titik terhadap sumbu y
    public void refleksiY(){
        this.absis = this.absis * (-1);
    }

    // method untuk mendapatkan hasil titik refleksi terhadap sumbu x
    public Titik getRefleksiX(){
        Titik R = new Titik(this.absis, this.ordinat);
        R.setOrdinat(this.ordinat * (-1));
        
        return R;
    }
    
    // method untuk mendapatkan hasil titik refleksi terhadap sumbu y
    public Titik getRefleksiY(){
        Titik R = new Titik(this.absis, this.ordinat);
        R.setAbsis(this.absis * (-1));

        return R;
    }
}

