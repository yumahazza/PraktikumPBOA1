/* Nama file    : Person.java */

public abstract class Person{
    protected String id;
    protected String nama;
    protected String email;
    protected String noHp;

    public Person(String id, String nama, String email, String noHp) {
        this.id    = id;
        this.nama  = nama;
        this.email = email;
        this.noHp  = noHp;
    }

    public String getId(){ 
        return id; 
    }

    //boleh ganti Username aplikasi
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama(){ 
        return nama; 
    }

    public String getEmail(){ 
        return email; 
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoHp(){ 
        return noHp; 
    } 

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    // Abstract — wajib di-override subclass
    public abstract void displayInfo();
}
