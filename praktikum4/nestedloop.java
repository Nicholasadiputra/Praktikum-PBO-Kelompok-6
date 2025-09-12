public class nestedloop {
    public static void main(String[] args)
    {   
        // Judul program
        System.out.println("---Mencetak nomor kursi bioskop---");
        // Inisialisasi variabel kursi dengan huruf 'A'
        char kursi = 'A';
        // Loop baris (A,B,C)
        for (int i = 0; i < 3; i++) {
            // Loop kolom (1,2,3)
            for (int j = 1; j <= 3; j++) {
                System.out.println(kursi + " " + j + " ");
            }
            // Baris baru setiap ganti huruf
            System.out.println();
            // Increment huruf kursi
            kursi++;
        }
    }
}
