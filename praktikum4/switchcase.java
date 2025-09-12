// Import Scanner untuk input
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args)
    {
        // Membuat objek Scanner
        Scanner input =  new Scanner(System.in);
        // Input warna dari user
        System.out.print("Masukan warna (RGB) : ");
        String warna = input.nextLine();
        
        // Switch case untuk pemilihan warna
        switch (warna) { 
            case "R":
            System.out.println("Anda memilih warna Merah");
            break;
            case "G":
            System.out.println("Anda memilih warna Hijau");
            break;
            case "B":
            System.out.println("Anda memilih warna Biru");
            break;
            default:
            System.out.println("Warna tidak tersedia");
        }
    }
}
