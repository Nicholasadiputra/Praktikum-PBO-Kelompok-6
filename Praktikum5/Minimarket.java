/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minimarket;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Minimarket {
    String nama;
    String alamat;
    int jumlahKaryawan;

    // Constructor overloading
    public Minimarket() {
        this.nama = "Minimarket Default";
        this.alamat = "Belum diisi";
        this.jumlahKaryawan = 0;
    }

    public Minimarket(String nama) {
        this.nama = nama;
        this.alamat = "Belum diisi";
        this.jumlahKaryawan = 0;
    }

    public Minimarket(String nama, String alamat, int jumlahKaryawan) {
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahKaryawan = jumlahKaryawan;
    }

    // Method overloading
    double hitungTotal(double harga) {
        return harga;
    }

    double hitungTotal(double harga, int jumlah) {
        return harga * jumlah;
    }

    double hitungTotal(double harga, int jumlah, double diskon) {
        return (harga * jumlah) - diskon;
    }

    void tampilkanInfo() {
        System.out.println("------------------------------");
        System.out.println("Nama Minimarket   : " + nama);
        System.out.println("Alamat            : " + alamat);
        System.out.println("Jumlah Karyawan   : " + jumlahKaryawan);
        System.out.println("------------------------------");
    }

    // Main untuk input
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        // Input data minimarket
        System.out.print("Masukkan nama minimarket: ");
        String nama = input.nextLine();

        System.out.print("Masukkan alamat minimarket: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan jumlah karyawan: ");
        int karyawan = input.nextInt();

        // object dengan constructor 3 parameter
        Minimarket mUser = new Minimarket(nama, alamat, karyawan);

        // Tampilkan info minimarket
        mUser.tampilkanInfo();

        // Input belanja
        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan diskon (jika ada, kalau tidak ada isi 0): ");
        double diskon = input.nextDouble();

        // Hitung total dengan method overloading
        if (jumlah == 1 && diskon == 0) {
            System.out.println("Total belanja: " + "Rp " + mUser.hitungTotal(harga));
        } else if (diskon == 0) {
            System.out.println("Total belanja: " + "Rp " + mUser.hitungTotal(harga, jumlah));
        } else {
            System.out.println("Total belanja setelah diskon: " + "Rp " + mUser.hitungTotal(harga, jumlah, diskon));
        }
        input.close();
    }
}

