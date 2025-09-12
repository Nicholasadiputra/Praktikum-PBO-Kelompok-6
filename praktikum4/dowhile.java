// Class utama
public class dowhile {
    public static void main(String[] args)
    {
        // Inisialisasi variabel x
        int x = 6;
        // Loop do-while, dieksekusi minimal 1x meskipun kondisi false
        do {
            System.out.println("Do While Loop ke-" + x);
            x++;
        } while (x <= 5); // Cek kondisi setelah eksekusi
    }
}
