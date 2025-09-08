import java.util.Scanner;//mengimpor kelas Scanner

public class inputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //membuat objek Scanner

        //Meminta input pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        //meminta input integer
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        //meminta input double
        System.out.print("Masukkan tinggi badan: ");
        double tinggi = scanner.nextDouble();

        System.out.println("\n--- Data Pengguna ---");
        //menampilkan output menggunakan printf untuk format
        System.out.printf("Nama: %s, Umur: %d, Tinggi: %.1f cm%n", nama, umur, tinggi);

        scanner.close(); //menutup Scanner setelah digunaka
    }
}

