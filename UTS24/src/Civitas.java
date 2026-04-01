public abstract class Civitas{
    /* ATRIBUT */
    protected String nama;
    protected String email;

    /* METHOD */
    public Civitas(String Nama, String Email){
        this.nama = Nama;
        this.email = Email;
    }

    public String getNama(){
        return nama;
    }

    public String getEmail(){
        return email;
    }

    public void setNama(String Nama){
        this.nama = Nama;
    }

    public void setEmail(String Email){
        this.email = Email;
    }

    public abstract void printInfo();

}
