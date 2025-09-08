public class OperatorPerbandingan {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        System.out.println("x == y: " + (x == y)); // x sama dengan y, false
        System.out.println("x != y: " + (x != y)); // x tidak sama dengan y, true 
        System.out.println("x > y: " + (x > y));  // x lebih besar dari y, false
        System.out.println("x < y: " + (x < y));  // x lebih kecil dari y, true
        System.out.println("x >= y: " + (x >= y)); // x lebih besar sama dengan y, false
        System.out.println("x <= y: " + (x <= y)); // x lebih kecil sama dengan y, true
    }
}