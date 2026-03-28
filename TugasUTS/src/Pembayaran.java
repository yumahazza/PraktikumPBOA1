//nama file : Pembayaran.java
//tujuan : membuat class abstrak untuk pembayaran
//nama / nim : Shalom Kurniawan / 24060124120033 

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pembayaran implements Pajak{
    //atribut
    protected int nominal_uang;
    // protected int harga_perjalanan;
    protected LocalDate tanggal_transaksi;
    protected String kode_transaksi;
    private Perjalanan detailPerjalanan;
    private Voucher tiket;
    private Kendaraan vehicle;
    private Penumpang customer;

    //method
    //konstruktor yang memenuhi overloading
    public Pembayaran(){
        nominal_uang = customer.getUang();
        // harga_perjalanan = 0;
        tanggal_transaksi = LocalDate.now();
        kode_transaksi = "";
        detailPerjalanan = new Perjalanan();
        tiket = new Voucher();
        vehicle = new Kendaraan();
        customer = new Penumpang();
    }

    public Pembayaran(LocalDate tanggal_transaksi, String kode, Perjalanan jalan, Voucher tiket, Kendaraan vehicle){
        nominal_uang = customer.getUang();
        // harga_perjalanan = (int) detailPerjalanan.hitungTarif() * detailVoucher.getDiskon() ;
        this.tanggal_transaksi = tanggal_transaksi;
        kode_transaksi = kode;
        detailPerjalanan = jalan;
        this.tiket = tiket;
        this.vehicle = vehicle;
    }

    public Penumpang getCustomer(){
        return customer;
    }

    public void setCustomer(Penumpang cust){
        customer = cust;
    }

    public int getNominalUang(){
        return getCustomer().getUang();
    }

    //tidak boleh ada set nominal uang

    public LocalDate getTanggalTransaksi(){
        return tanggal_transaksi;
    }

    public void setTanggalTransaksi(LocalDate tanggal){
        tanggal_transaksi = tanggal;
    }

    public String getKodeTransaksi(){
        return kode_transaksi;
    }

    public void setKodeTransaksi(String kode){
        kode_transaksi = kode;
    }

    //tidak boleh ada set nya untuk atribut dari relasi antar class, sudah di konstruktor dengan parameter

    public Voucher getVoucher(){
        return tiket;
    }

    public Perjalanan getDetailPerjalanan(){
        return detailPerjalanan;
    }

    public Kendaraan getVehicle(){
        return vehicle;
    }

    //abstract method
    // public abstract int getKembalian();

    public abstract int getTarif();

    public abstract int getTarifFinal();

    //exception dan abstract
    public abstract String proses_bayar() throws Exception;

    public void printReceipt() throws Exception{
        proses_bayar();
        System.out.println("Nominal Pembayaran : "+ getNominalUang());
        System.out.println("Total tarif: " + getTarifFinal());
        System.out.println("Tanggal Transaksi : " + getTanggalTransaksi());
        System.out.println("Kode Unik Transaksi : " + getKodeTransaksi());
        System.out.println("Voucher : " + getVoucher().getKodeVoucher() + ", diskon: " + getVoucher().getDiskon());
        System.out.println("Jarak perjalanan : " + getDetailPerjalanan().getJarak() + "km");
        System.out.println("Kendaraan yang dipakai: " + getVehicle().getJenis());
    }
}