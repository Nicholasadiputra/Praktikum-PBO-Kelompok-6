import java.util.*;

public class ifelseif {
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = input.nextInt();

        if(nilai>75){
            System.out.println("Anda lulus ujian");
        } else if (nilai>65) {
            System.out.println("Anda lulus ujian dengan peringatan");
        } else {
            System.out.println("Anda harus mengulang ujian");
        }
    }
}