package praktikum4;

public class cthContinue {
    public static void main(String[] args)
    {
        // Loop dari 1 sampai 10
        for (int e = 1; e <= 10; e++) {
            // Skip jika bilangan genap
            if (e % 2 == 0) {
            continue; 
            }
            // Cetak bilangan ganjil
            System.out.println("bilangan ganjil : " + e);
        }
    }
}
