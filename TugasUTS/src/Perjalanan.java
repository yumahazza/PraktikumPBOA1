//Class Perjalanan

public class Perjalanan{
    /***********ATRIBUT************/
    protected String idPerjalanan;
    protected double jarak;
    protected Motor motor;
    protected Mobil mobil;

    /***********METHOD************/
    // Konstruktor untuk membuat Perjalanan dengan parameter idPerjalanan dan jarak
    public Perjalanan(String idPerjalanan, double jarak) {
        this.idPerjalanan = idPerjalanan;
        this.jarak = jarak;
    }
 
    // Mengeset jarak agar tidak memasukkan nilai negatif. hal ini memanfaatkan konsep exception
    public void setJarak(double jarak) throws IllegalArgumentException {
        if (jarak <= 0) {
            throw new IllegalArgumentException("Jarak harus lebih dari 0!");
        }
        this.jarak = jarak;
    }

    // mengambil info jarak
    public double getJarak() {
        return jarak;
    }

    // mengambil info idperjalanan
    public String getIDPerjalanan(){
        return idPerjalanan;
    }

    public void setIDPerjalanan(String id){
        idPerjalanan = id;
    }

    // Menghitung tarifKendaraan dari perjalanan dengan asumsi setiap jarak dalam satu kilometer di hargai dengan 2000
    public double hitungTarif(){
        // assertion
        int hargaPerKm = 2000; // asumsi harga per km secara default
        double tarifK;
        assert jarak > 0 : "Jarak tidak valid!";

        if(motor.jenis.equals("Motor")){
            tarifK = motor.getTarif();
        }
        else{
            if(mobil.getTipeMobil().equals("Reguler")){
                tarifK = mobil.getTarif();
            } else{
                tarifK = mobil.getTarif();
            }
        }

        double tarif = jarak * hargaPerKm * tarifK;
        return tarif;
    }

    public void printInfo() {
        System.out.println("ID Perjalanan : " + getIDPerjalanan());
        System.out.println("Jarak         : " + getJarak() + " km");
        System.out.println("Total tarif   : " + hitungTarif());
    }
}
