import java.util.Scanner;

public class nestedif {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        if (angka == 0) {
            System.out.println("Merupakan bilangan bernilai netral");
        } else if (angka > 0) {
            System.out.print("Merupakan bilangan positif ");
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            }else{
                System.out.println("dan ganjil");
            }
        } else {
            System.out.print("Bilangan bernilai negatif ");
            if (angka % 2 == 0){
                System.out.println("dan genap");
            } else {
                System.out.println("dan ganjil");
            }
        }
    }
}
