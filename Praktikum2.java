/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum2;

public class Praktikum2 {
        
    public static void main(String[] args) {
        final String Nama = "Fahry Akbar Raksanjani"; //konstanta Nama, Nama tidak akan berubah
        String NIM = "2407126536";
        double[] ipSemester = {3.00 , 3.30};
        //membuat array byte tujuan dengan ukuran yang sama
        byte[] ipByte = new byte[ipSemester.length];
        
        //konversi setiap elemen nilai ip
        for (int i = 0; i <ipSemester.length; i++){
        ipByte[i] = (byte) ipSemester[i];
        }
        
        String Alamat = "Jl. Sakinah 5 Blok L5";
        String Umur = "18";
        String GolDarah = "A";
        
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
