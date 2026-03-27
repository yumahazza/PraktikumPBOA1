//Class Perjalanan

public class Perjalanan{
    /***********ATRIBUT************/
    protected String idPerjalanan;
    protected int jarak;
    protected int tarifKendaraan; //tarif dasar; motor sekian, mobil sekian
    protected Motor motor;
    protected Mobil mobil;

    /***********METHOD************/
    // Konstruktor untuk membuat Perjalanan dengan parameter idPerjalanan dan jarak
    public Perjalanan(String idPerjalanan, int jarak, int tarifKendaraan) {
        this.idPerjalanan = idPerjalanan;
        this.jarak = jarak;
        this.tarifKendaraan = tarifKendaraan;
    }

    public Perjalanan(){
        idPerjalanan = "";
        jarak = 0;
        tarifKendaraan = 0;
    }
 
    // Mengeset jarak agar tidak memasukkan nilai negatif. hal ini memanfaatkan konsep exception
    public void setJarak(int jarak) throws IllegalArgumentException {
        if (jarak <= 0) {
            throw new IllegalArgumentException("Jarak harus lebih dari 0!");
        }
        this.jarak = jarak;
    }

    // mengambil info jarak
    public int getJarak() {
        return jarak;
    }

    // mengambil info idperjalanan
    public String getIDPerjalanan(){
        return idPerjalanan;
    }

    public void setIDPerjalanan(String id){
        idPerjalanan = id;
    }

    public void setTarifKendaraan(int tarifKendaraan){
        this.tarifKendaraan = tarifKendaraan;
    }

    public int getTarifKendaraan(){
        return tarifKendaraan;
    }

    // Menghitung tarifKendaraan dari perjalanan dengan asumsi setiap jarak dalam satu kilometer di hargai dengan 2000
    public int hitungTarif(){
        // assertion
        int hargaPerKm = 2000; // asumsi harga per km secara default
        assert jarak > 0 : "Jarak tidak valid!";
        
        if(motor.jenis.equals("Motor")){
            hargaPerKm = 2000;
        }
        else{
            if(mobil.getTipeMobil().equals("Reguler")){
                hargaPerKm = 4000;
            } else{
                hargaPerKm = 6000;
            }
        }

        int tarif = (jarak * hargaPerKm) + getTarifKendaraan();
        return tarif;
    }

    public void printInfo() {
        System.out.println("ID Perjalanan : " + getIDPerjalanan());
        System.out.println("Jarak         : " + getJarak() + " km");
        System.out.println("Total tarif dalam perjalanan   : " + hitungTarif());
    }
}
