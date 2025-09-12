import java.util.Scanner;

public class switchcase {
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);
        System.out.print("Masukan warna (RGB) : ");
        String warna = input.nextLine();
        
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