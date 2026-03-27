public class Penumpang extends Person{
    private String alamat;

    public Penumpang(String id, String nama, String email, String noHp, String alamat) {
        super(id, nama, email, noHp);
        this.alamat = alamat;
    }

    // Override displayInfo() dari Person
    @Override
    public void displayInfo() {
        System.out.println("ID        : " + id);
        System.out.println("Penumpang : " + nama);
        System.out.println("Email     : " + email);
        System.out.println("No. HP    : " + noHp);
        System.out.println("Alamat    : " + alamat);
    }

    public void setAlamat(String alamat) {
    this.alamat = alamat;
    }
    
    public String getAlamat(){ 
        return alamat; 
    }
}

