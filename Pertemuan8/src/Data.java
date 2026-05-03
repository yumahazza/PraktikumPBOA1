/* Nama file    : Data.java
 * Deskripsi    : Program untuk kelas generik Data
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 3 Mei 2026
 * */

class Data<T>{
    /* ATRIBUT */
    private T[] ruang;
    private int banyak;

    /* METHOD / OPERATOR */
    /* KONSTRUKTOR */
    @SuppressWarnings("unchecked")
    public Data(){
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    // Prosedur setIsi
    public void setIsi(int posisi, T nilai){
        if(posisi < 1 || posisi > 100){
            System.out.println("Posisi tidak valid!");
            return;
        }

        if(ruang[posisi - 1] == null){
            banyak++;
        }

        ruang[posisi - 1] = nilai;
    }

    // Fungsi getIsi
    public T getIsi(int posisi){
        if(posisi < 1 || posisi > 100){
            return null;
        }
        return ruang[posisi - 1];
    }

    // Fungsi getSize
    public int getSize(){
        return banyak;
    }

}