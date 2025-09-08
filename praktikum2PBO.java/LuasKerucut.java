import java.util.Scanner;

public class LuasKerucut {
    public static void main(String[] args) {
        double phi = 3.14;
        double r, t;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Volume Kerucut");
        System.out.print("Silahkan Masukkan Jari-jari Alas Kerucut : ");
        r = scanner.nextDouble();

        System.out.print("Silahkan Masukkan Tinggi Kerucut          : ");
        t = scanner.nextDouble();

        double volume = (1.0 / 3.0) * phi * r * r * t;
        System.out.println("Volume Kerucut adalah                    : " + volume);

        scanner.close();
    }
}
