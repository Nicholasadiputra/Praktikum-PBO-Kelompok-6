public class OperatorLogika {
    public static void main(String[] args) {
        boolean p = true;
        boolean q = false;

        System.out.println("p && q: " + (p && q)); // AND: false
        System.out.println("p || q: " + (p || q)); // OR: true
        System.out.println("!p: " + (!p));       // NOT: false

        // Short-circuit evaluation
        int a = 5;
        int b = 0;
        
        // Karena (b != 0) sudah false, bagian kedua (a / b > 2) tidak dieksekusi.
        // Ini mencegah error pembagian dengan nol.
        boolean result = (b != 0) && (a / b > 2);
        
        System.out.println("Result: " + result); // false
    }
}
