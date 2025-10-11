/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== INFORMASI NASABAH =====\n");

        Rekening r1 = new Rekening();
        r1.setNomorRekening(12300);
        r1.setNamaNasabah("Ipin");
        r1.setSaldo(2_500_000);

        Rekening r2 = new Rekening();
        r2.setNomorRekening(12400);
        r2.setNamaNasabah("Muhammad Sumbul");
        r2.setSaldo(5_000_000);

        // Menampilkan data rekening
        System.out.println("=== Data Rekening 1 ===");
        System.out.println("Nomor Rekening : " + r1.getNomorRekening());
        System.out.println("Nama Nasabah   : " + r1.getNamaNasabah());
        System.out.println("Saldo          : Rp " + r1.getSaldo());
        System.out.println();

        System.out.println("=== Data Rekening 2 ===");
        System.out.println("Nomor Rekening : " + r2.getNomorRekening());
        System.out.println("Nama Nasabah   : " + r2.getNamaNasabah());
        System.out.println("Saldo          : Rp " + r2.getSaldo());
        System.out.println();

        // Menampilkan informasi bank
        System.out.println("=== INFORMASI BANK ===");
        System.out.println("Nama Bank   : " + Bank.getNamaBank());
        System.out.println("Kode Bank   : " + Bank.getKodeBank());
        System.out.println("Suku Bunga  : " + Bank.getSukuBunga() + "% per tahun");
    }
}
