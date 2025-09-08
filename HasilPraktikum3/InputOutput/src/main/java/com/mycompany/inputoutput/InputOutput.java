package com.mycompany.inputoutput;

import java.util.Scanner; // Mengimpor kelas Scanner [cite: 135]

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner [cite: 136]

        // Meminta input String [cite: 137]
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Meminta input Integer [cite: 141]
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt(); 

        // Meminta input Double [cite: 143]
        System.out.print("Masukkan tinggi badan: ");
        double tinggi = scanner.nextDouble(); 

        System.out.println("\n--- Data Pengguna ---");
        // Menampilkan output menggunakan printf untuk format [cite: 128]
        System.out.printf("Nama: %s, Umur: %d, Tinggi: %.1f cm%n", nama, umur, tinggi);
        
        scanner.close(); // Menutup scanner setelah digunakan
    }
}