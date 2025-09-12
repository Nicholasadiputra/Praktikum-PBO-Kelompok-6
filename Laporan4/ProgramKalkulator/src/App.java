import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean keputusan = true;
        double sisi, panjang, lebar, jariJari, alas, tinggi, phi;
        int pilihan;
        String keputusan2;

        System.out.println("--- Selamat Datang di Program Kalkulator Luas Bangun Ruang ---");
        
        while(keputusan){
            System.out.println("Pilih bangun ruang yang ingin dihitung Luasnya:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda (1-5): ");
            pilihan = scanner.nextInt();

            switch(pilihan){
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    sisi = scanner.nextDouble();
                    System.out.println("Luas Persegi: " + (sisi * sisi));
                    break;
                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    lebar = scanner.nextDouble();
                    System.out.println("Luas Persegi Panjang: " + (panjang * lebar));
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    jariJari = scanner.nextDouble();
                    phi = 3.14;
                    System.out.println("Luas Lingkaran: " + (phi * jariJari * jariJari));
                    break;
                case 4:
                    System.out.print("Masukkan alas segitiga: ");
                    alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    tinggi = scanner.nextDouble();
                    System.out.println("Luas Segitiga: " + (0.5 * alas * tinggi));
                    break;
                case 5:
                    keputusan = false;
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            
            System.out.println("Apakah Anda ingin menghitung lagi? (y/n)");
            keputusan2 = scanner.next().toLowerCase();
            if (keputusan2.equalsIgnoreCase("y")) {
                keputusan = true;
                System.out.println();
               
            } else {
                 System.out.println("Terima kasih telah menggunakan program ini!");
                 keputusan = false;
        }
  }
    scanner.close();
}

}