import java.util.Scanner; //Melakukan Import Scanner Pada Java

public class App {
    public static void main(String[] args){
        //Deklarasi Variabel
        double phi = 3.14;
        double r,t;

        //Deklarasi Scanner
        Scanner scanner = new Scanner(System.in);

        //Input Data
        System.out.println("Program Menghitung Volume Kerucut");
        System.out.print("Silahkan Masukkan jari-jari Alas Kerucut : ");
        r = scanner.nextDouble(); //Memasukkan nilai kedalam variabel r

        System.out.print("Silahkan Masukkan Tinggi Kerucut         : ");
        t = scanner.nextDouble(); //Memasukkan nilai kedalam variabel t

        double volume = (1.0/3.0) * phi * r * r * t; //Menghitung Volume kerucut
        System.out.println("Volume Kerucut adalah                    : " + volume); //Menampilkan hasil volume kerucut
        scanner.close();

    }
}
