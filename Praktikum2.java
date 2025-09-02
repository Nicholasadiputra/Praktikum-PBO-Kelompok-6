package com.mycompany.praktikum2;

public class Praktikum2 {
        
    public static void main(String[] args) {
        final String Nama = "Nicholas Adiputra Tan"; //konstanta Nama, Nama tidak akan berubah
        String NIM = "2407112674";
        double[] ipSemester = {3.58 , 3.68};
        String Alamat = "Jl. Lily 1 No.75";
        String Umur = "18";
        String GolDarah = "O";
        //membuat array byte tujuan dengan ukuran yang sama
        byte[] ipByte = new byte[ipSemester.length];
        //konversi setiap elemen nilai ip
        for (int i = 0; i <ipSemester.length; i++){
        ipByte[i] = (byte) ipSemester[i];
        }
                
        System.out.println("Nama :" + Nama);
        System.out.println("NIM : " + NIM);
        System.out.println("IP tiap semester : ");
        System.out.println("Semester 1 : " + ipByte[0]);
        System.out.println("Semester 2 : " + ipByte[1]);        
        System.out.println("Alamat : " + Alamat);
        System.out.println("Umur : " + Umur);
        System.out.println("Golongan Darah : " + GolDarah);
        
    }
}