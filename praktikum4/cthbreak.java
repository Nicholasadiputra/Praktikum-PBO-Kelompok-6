public class cthBreak {
    public static void main(String[] args)
    {
        for (int d = 1; d <= 10; d++) {
            if (d == 5) {
                System.out.println("Break di angka : " + d);
                break; // Keluar dari loop ketika d bernilai 5
            }
            System.out.println("Angka : " + d);
        }
    }
}