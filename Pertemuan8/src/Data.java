/* Nama file    : OperatorGenerik.java
 * Deskripsi    : Program main unutk implementasi poliforfisme
                    universal inclusion
 * Pembuat      : Yuma Hazza Yuditama
 * Tanggal      : 1 Mei 2026
 * */

class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100]; // array generik
        banyak = 0;
    }

    // setIsi
    public void setIsi(int posisi, T nilai) {
        if (posisi < 1 || posisi > 100) {
            System.out.println("Posisi tidak valid!");
            return;
        }

        if (ruang[posisi - 1] == null) {
            banyak++; // elemen baru
        }

        ruang[posisi - 1] = nilai;
    }

    // getIsi
    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            System.out.println("Posisi tidak valid!");
            return null;
        }
        return ruang[posisi - 1];
    }

    // getSize
    public int getSize() {
        return banyak;
    }
}