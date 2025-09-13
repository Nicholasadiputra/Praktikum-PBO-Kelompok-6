package praktikum4;

import java.util.Scanner;

// Deklarasi class ifelse
public class ifelse {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        
        // Menyimpan input nilai ke dalam variabel 'nilai'
        int nilai = input.nextInt();

        // Mengecek kondisi nilai
        if (nilai > 75) {
            System.out.println("Anda lulus ujian");
        } else {
            System.out.println("Anda harus mengulang ujian");
        }

        input.close(); // menutup Scanner agar tidak ada memory leak
    }
}
