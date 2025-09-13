package praktikum4;

public class loopfor {
    public static void main(String[] args)
    {
        // Perulangan for dari 1 sampai 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        // Array nama mahasiswa
        String[] mahasiswa = {"Andi", "Budi", "Caca", "Dewi", "Eko"};

        // Perulangan untuk menampilkan nama mahasiswa
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + mahasiswa[i]);
        }
    }
}
