//Kode Praktikum 2 (Dasar Pemrograman Java) Muhammad Rizqy Putra Pratama

public class Kode2MuhammadRizqy {
    public static void main(String[] args) {
        // Deklarasi Variabel
        String Nama,Alamat;
        int Umur;
        long Nim;
        double IP1;
        char GolonganDarah;
        byte IP2;

        // Input Data
        Nama = "Muhammad Rizqy Putra Pratama";
        Alamat = "Jalan Swakarya";
        Umur = 19;
        GolonganDarah = 'O';
        Nim = 2407111901L;
        IP1 = 3.79;
        IP2 = (byte) 3.78;

        // Output Data
        System.out.println("Biodata Mahasiswa");
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Umur : " + Umur + " Tahun");
        System.out.println("Golongan Darah : " + GolonganDarah);
        System.out.println("NIM : " + Nim);
        System.out.println("IP Semester 1 : " + IP1);
        System.out.println("IP Semester 2 : " + IP2 + "(Konversi Byte)");



    }
}
