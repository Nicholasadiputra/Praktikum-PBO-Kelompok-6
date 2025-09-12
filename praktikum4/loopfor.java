import java.util.Scanner;

public class loopfor {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        String[] mahasiswa = {"Andi", "Budi", "Caca", "Dewi", "Eko"};

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + mahasiswa[i]);
        }
    }
}

