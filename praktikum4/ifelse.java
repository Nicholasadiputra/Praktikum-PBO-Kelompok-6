import java.util.Scanner;

public class ifelse {
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = input.nextInt();

        if (nilai>75){
            System.out.println("Anda lulus ujian");
        } else {
            System.out.println("Anda harus mengulang ujian");
        }
    }
}