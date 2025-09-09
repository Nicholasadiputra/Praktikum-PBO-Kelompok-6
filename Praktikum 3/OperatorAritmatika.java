/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operatoraritmatika;

 public class OperatorAritmatika {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b)); // Penjumlahan: 13
        System.out.println("a - b = " + (a - b)); // Pengurangan: 7
        System.out.println("a * b = " + (a * b)); // Perkalian: 30
        System.out.println("a / b = " + (a / b)); // Pembagian: 3
        System.out.println("a % b = " + (a % b)); // Modulus: 1

        // Increment dan Decrement
        System.out.println("++a = " + (++a)); // Pre-increment: a menjadi 11, lalu ditampilkan
        System.out.println("b-- = " + (b--)); // Post-decrement: tampilkan b (3), lalu b dikurangi 1
        System.out.println("b sekarang: " +  b); // nilai b setelah post-decrement
    }
} 
    

