/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2n

//Tugas Project 2 Muhammad Rizqy Putra Pratama
    
public class Project2N {

    public static void main(String[] args) {
       // Deklarasi Variabel
        String nama,alamat;
        int umur;
        long nim;
        double[] ip;
        char golonganDarah;
        ip = new double[2];
        byte ipSemester2;
        

        // Input Data
        nama = "Muhammad Rizqy Putra Pratama";
        alamat = "Jalan Swakarya";
        umur = 19;
        nim = 2407111902L;
        ip[0] = 3.79;
        ip [1] = 3.78;
        golonganDarah = 'O';
        ipSemester2 = (byte) ip[1];

        // Output Data
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + umur + " Tahun");
        System.out.println("NIM : " + nim);
        System.out.println("IP Semester 1 : " + ip[0]);
        System.out.println("IP Semester 2 : " + ipSemester2);
        System.out.println("Golongan Darah : " + golonganDarah);

    }
}
