package praktikum4;

public class cthBreak {
    public static void main(String[] args)
    {
        // Loop dari 1 sampai 10
        for (int d = 1; d <= 10; d++) {
            // Cek jika d sama dengan 5
            if (d == 5) {
                System.out.println("Break di angka : " + d);
                break; // Keluar dari loop ketika d bernilai 5
            }
            // Cetak angka selain 5
            System.out.println("Angka : " + d);
        }
    }
}
