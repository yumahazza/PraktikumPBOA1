/* Nama file    : Driver.java */

public class Driver extends Person{
    private String noSIM;
    private boolean tersedia;
    private double rating;

    public Driver(String id, String nama, String email, String noHp,
                  String noSIM) {
        super(id, nama, email, noHp);
        this.noSIM     = noSIM;
        this.tersedia  = true;
        this.rating    = 0.0;
    }

    // Override displayInfo() dari Person
    @Override
    public void displayInfo() {
        System.out.println("ID      : " + id);
        System.out.println("Driver  : " + nama);
        System.out.println("Email   : " + email);
        System.out.println("No. HP  : " + noHp);
        System.out.println("No. SIM : " + noSIM);
        if (rating == 0.0) {
            System.out.println("Rating  : N/A");
        } else {
            System.out.println("Rating  : " + rating);
        }
        if (tersedia) {
            System.out.println("Status  : Tersedia");
        } else {
            System.out.println("Status  : Sedang Bertugas");
        }
    }

    public String getNoSIM() {
        return noSIM;
    }

    public void setTersedia(boolean status) {
        this.tersedia = status;
    }

    public boolean isTersedia(){ 
        return tersedia; 
    }

    public void updateRating(double skorBaru){
        assert skorBaru >= 1 && skorBaru <= 5 : "Rating harus antara 1 dan 5";
        if (rating == 0.0) {
            rating = skorBaru; 
        } else {
            rating = (rating + skorBaru) / 2;
        }
    }
    
    public double getRating(){ 
        return rating; 
    }

}