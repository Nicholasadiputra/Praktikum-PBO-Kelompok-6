package com.mycompany.praktikum5;

public class Mobil {
    // Atribut
    private String merek;
    private String warna;
    private int tahun;

    // Default constructor
    public Mobil() {
        this.merek = "Unknown";
        this.warna = "Unknown";
        this.tahun = 0;
    }

    // Constructor dengan parameter
    public Mobil(String merek, String warna, int tahun) {
        this.merek = merek;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method untuk menyalakan mesin
    public void nyalakanMesin() {
        System.out.println("Mesin dinyalakan");
    }

    // Method untuk mematikan mesin
    public void matikanMesin() {
        System.out.println("Mesin dimatikan");
    }

    // Method untuk menampilkan informasi mobil
    public void displayInfo() {
        System.out.println("Merek: " + this.merek);
        System.out.println("Warna: " + this.warna);
        System.out.println("Tahun: " + this.tahun);


}    
    public static void main(String[] args) {
            // Membuat objek mobil menggunakan default constructor
            Mobil mobil1 = new Mobil();
            mobil1.displayInfo();
            mobil1.nyalakanMesin();
            mobil1.matikanMesin();

            System.out.println();

            // Membuat objek mobil menggunakan constructor dengan parameter
            Mobil mobil2 = new Mobil("Toyota", "Merah", 2020);
            mobil2.displayInfo();
            mobil2.nyalakanMesin();
            mobil2.matikanMesin();
        }
    }