/* Nama file    : Seminar.java 
 * Deskripsi    : program class anak Seminar
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 25 April 2026
 * */

public class Seminar{
    /* ATRIBUT */
    private Civitasakademika pesertas[];
    private int banyakpeserta;

    /* METHOD / OPERATOR */
    public Seminar(){
        this.pesertas = new Civitasakademika[100];
        this.banyakpeserta = 0;
    }

    /* SELEKTOR */
    
    /* MUTATOR */
    
    /* METHOD LAINNYA */
    public int countPeserta(){
        return banyakpeserta;
    }

    public void registrasi(Civitasakademika A){
        if(banyakpeserta < pesertas.length){
            pesertas[banyakpeserta] = A;
            banyakpeserta++;
        } else{
            System.out.println("Seminar sudah penuh");
        }
    }

    public void tampilPeserta(){
        for(int i = 0; i < banyakpeserta; i++){
            System.out.println(i + "." + pesertas[i]);
        }
    }

    public int countMahasiswa(){
        int count = 0;
        for(int i = 0; i < banyakpeserta; i++){
            if(pesertas[i] instanceof Mahasiswa){
                count++;
            }
        }

        return count;
    }

    


}
