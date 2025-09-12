import java.util.Scanner;

public static void main(String[] args)
    {
        int a = 1;
        while (a <= 5) {
            System.out.println("While Loop ke-" + a);
            a++;
        }
        
        Scanner input = new Scanner(System.in);
        String password = "";

        while (!password.equals("java123")) {
            System.out.print("Masukkan password: ");
            password = input.nextLine();
        }

        System.out.println("Login Berhasil!");
 
}
