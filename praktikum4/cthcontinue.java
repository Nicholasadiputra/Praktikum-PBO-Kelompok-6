public class cthcontinue {
    public static void main(String[] args)
    {
        for (int e = 1; e <= 10; e++) {
            if (e % 2 == 0) {
            continue; 
            }
            System.out.println("bilangan ganjil : " + e);
        }
    }
}