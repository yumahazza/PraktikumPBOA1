public class Kendaraan {
    /* ATRIBUT */
    private String noPlat;
    private String jenis;

    /* METHOD */
    // konstruktor tanpa parameter
    // mengisi plat nomor dan jenis dengan "-"
    public Kendaraan(){
        this.noPlat = "-";
        this.jenis = "-";
    }

    // konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        if(jenis == "motor" || jenis == "Motor"){
            this.jenis = jenis;
        } else if(jenis == "mobil" || jenis == "Mobil"){
            this.jenis = jenis;
        } else{
            // asusmsi jika mengisi selain motor atau mobil
            this.jenis = "-"; 
        }
    }

    // selektor plat nomor untuk class Kendaraan
    public String getNoPlat(){
        return noPlat;
    }

    // selektor jenis untuk class Kendaraan
    public String getJenis(){
        return jenis;
    }

    // mutator plat nomor untuk class Kendaraan
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    // mutator jenis untuk class Kendaraan
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    /* method untuk menampilkan detail kendaraan */
    public void printDetailKend(){
        System.out.println("Plat nomor: " + noPlat);
        System.out.println("Jenis: " + jenis);
    }
}


