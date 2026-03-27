//nama file : Pembayaran.java
//tujuan : membuat class abstrak untuk pembayaran
//nama / nim : Shalom Kurniawan / 24060124120033 

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ArrayList;

public abstract class Pembayaran {
    //atribut
    protected int nominal_uang;  
    protected int harga_perjalanan;
    protected LocalDate tanggal_transaksi;
    protected String kode_transaksi;
    private Perjalanan detailPerjalanan;
    private ArrayList<Voucher> listVoucher;

    //method
    //konstruktor yang memenuhi overloading
    public Pembayaran(){ 
        nominal_uang = 0;
        harga_perjalanan = 0;
        tanggal_transaksi = LocalDate.now();
        kode_transaksi = "";
        detailPerjalanan = new Perjalanan();
        listVoucher = new ArrayList<>();
    }

    public Pembayaran(int nilai, LocalDate tanggal_transaksi, String kode){
        nominal_uang = nilai;
        harga_perjalanan = (int) detailPerjalanan.hitungTarif() * detailVoucher.getDiskon() ;
        this.tanggal_transaksi = tanggal_transaksi;
        kode_transaksi = kode;
        detailPerjalanan = new Perjalanan();
        listVoucher = new ArrayList<>();
    }

    // selektor
    public int getNominalUang(){
        return nominal_uang;
    }

    public int getHargaPerjalanan(){
        return harga_perjalanan;
    }

    public LocalDate getTanggalTransaksi(){
        return tanggal_transaksi;
    }

    public String getKodeTransaksi(){
        return kode_transaksi;
    }

    // mutator
    public void setNominalUang(int nilai){
        nominal_uang = nilai;
    }

    public void setTanggalTransaksi(LocalDate tanggal){
        tanggal_transaksi = tanggal;
    }

    public void setKodeTransaksi(String kode){
        kode_transaksi = kode;
    }

    //abstract method
    public abstract int getKembalian();

    //exception dan abstract
    public abstract String proses_bayar() throws Exception;

    public void printReceipt() throws Exception{
        proses_bayar();

        System.out.println("Nominal Pembayaran : "+ getNominalUang());
        System.out.println("Harga Perjalanan : " + getHargaPerjalanan());
        System.out.println("Tanggal Transaksi : " + getTanggalTransaksi());
        System.out.println("Kode Unik Transaksi : " + getKodeTransaksi());
    }
}
