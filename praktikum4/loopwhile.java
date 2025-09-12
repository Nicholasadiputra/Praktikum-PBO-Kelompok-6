// Import Scanner untuk input user
import java.util.Scanner;

public class loopwhile {
    public static void main(String[] args)
    {
        // Inisialisasi variabel untuk loop pertama
        int a = 1;
        // Loop while untuk menampilkan 5 kali
        while (a <= 5) {
            System.out.println("While Loop ke-" + a);
            a++;
        }
        
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);
        // Inisialisasi password kosong
        String password = "";

        // Loop while untuk validasi password
        while (!password.equals("java123")) {
            System.out.print("Masukkan password: ");
            password = input.nextLine();
        }

        // Pesan setelah password benar
        System.out.println("Login Berhasil!");
    }
}

