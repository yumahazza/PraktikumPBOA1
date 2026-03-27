//Class Perjalanan

public class Perjalanan{
    /***********ATRIBUT************/
    private String idPerjalanan;
    private double jarak;
    private Kendaraan kendaraan;
    private Driver driver;
    private Penumpang penumpang;


    /***********METHOD************/
    // Konstruktor untuk membuat Perjalanan dengan parameter idPerjalanan dan jarak
    public Perjalanan(String idPerjalanan, double jarak, Penumpang p, Driver d, Kendaraan k) {
        this.idPerjalanan = idPerjalanan;
        this.jarak = jarak;
        this.penumpang = p;
        this.driver = d;
        this.kendaraan = k;
    }
 
    // Mengeset jarak agar tidak memasukkan nilai negatif. hal ini memanfaatkan konsep exception
    public void setJarak(double jarak) throws IllegalArgumentException {
        if (jarak <= 0) {
            throw new IllegalArgumentException("Jarak harus lebih dari 0!");
        }
        this.jarak = jarak;
    }

    // mengambil info jarak
    public double getJarak(){
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
        int hargaPerKm = 2000; // asumsi harga per km secara default
        // assertion
        assert jarak > 0 : "Jarak tidak valid!";
        double tarif = (jarak * hargaPerKm) + kendaraan.getTarif() + kendaraan.getPajak();

        return tarif;
    }

    public void printInfo() {
        System.out.println("ID Perjalanan : " + getIDPerjalanan());
        System.out.println("Penumpang     : " + penumpang.nama);
        System.out.println("Driver        : " + driver.nama);
        System.out.println("Kendaraan     : " + kendaraan.jenis + " - " + kendaraan.model);
        if(kendaraan instanceof Mobil){
            Mobil mobil = (Mobil) kendaraan;
            System.out.println("Tipe Mobil    : " + mobil.getTipeMobil());
        }
        System.out.println("Jarak         : " + getJarak() + " km");
        System.out.printf("Total tarif   : %.2f\n", hitungTarif());
    }
}
