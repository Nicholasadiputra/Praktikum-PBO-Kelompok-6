package com.kedaikasir.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class DataGlobal {
    // 1. List Transaksi 
    public static List<String[]> riwayatTransaksi = new ArrayList<>();

    // 2. List Produk 
    public static List<String[]> daftarProduk = new ArrayList<>();

    // 3. Isi Data Awal (Opsional, biar pas dijalankan tidak kosong)
    static {
        daftarProduk.add(new String[]{"Nasi Goreng", "15000"});
        daftarProduk.add(new String[]{"Es Teh", "5000"});
        daftarProduk.add(new String[]{"Ayam Bakar", "20000"});
        daftarProduk.add(new String[]{"Kopi Hitam", "8000"});
    }
}