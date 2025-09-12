public class nestedloop {
    public static void main(String[] args)
    {   
        System.out.println("---Mencetak nomor kursi bioskop---");
        char kursi = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(kursi + " " + j + " ");
            }
            System.out.println();
            kursi++;
        }
    }
}
