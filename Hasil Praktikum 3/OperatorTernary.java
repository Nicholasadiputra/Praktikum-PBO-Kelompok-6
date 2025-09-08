public class OperatorTernary {
    public static void main(String[] args) {
        int score = 85;
        String grade = (score >= 80) ? "A" : (score >= 70) ? "B" : "C";
        System.out.println("Nilai: " + grade);

        // Penggunaan untuk mencari nilai maksimum
        int max = (10 > 5) ? 10 : 5;
        System.out.println("Maximum: " + max);
    }
}
