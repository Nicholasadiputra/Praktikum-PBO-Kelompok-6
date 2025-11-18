package com.mycompany.operatorbitwise;

public class OperatorBitwise {
    public static void main(String[] args) {
        int a = 12; // 1100 dalam biner
        int b = 10; // 1010 dalam biner

        // a & b = 1000 (8)
        System.out.println("a & b = " + (a & b)); // AND

        // a | b = 1110 (14) 
        System.out.println("a | b = " + (a | b)); // OR

        // a ^ b = 0110 (6)
        System.out.println("a ^ b = " + (a ^ b)); // XOR

        // ~a = ...11110011 (-13)
        System.out.println("~a = " + (~a)); // NOT

        // nilai a = 1100 digeser ke kiri 2 langkah. menjadi 110000 (48)
        System.out.println("a << 2 = " + (a << 2)); // Left shift

        // nilai a = 1100 digeser ke kanan 2 langkah, menjadi 0011 (3)
        System.out.println("a >> 2 = " + (a >> 2)); // Right shift
    }
}
