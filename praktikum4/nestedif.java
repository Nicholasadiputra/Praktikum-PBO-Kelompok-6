package praktikum4;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // Input angka dari user
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        // Cek angka nol
        if (angka == 0) {
            System.out.println("Merupakan bilangan bernilai netral");
        } 
        // Cek angka positif
        else if (angka > 0) {
            System.out.print("Merupakan bilangan positif ");
            // Cek genap/ganjil
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            }else{
                System.out.println("dan ganjil");
            }
        } 
        // Cek angka negatif
        else {
            System.out.print("Bilangan bernilai negatif ");
            // Cek genap/ganjil
            if (angka % 2 == 0){
                System.out.println("dan genap");
            } else {
                System.out.println("dan ganjil");
            }
        }
        input.close(); // menutup Scanner agar tidak ada memory leak
    }
    
}
