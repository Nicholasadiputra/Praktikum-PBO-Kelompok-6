public class Main {
    public static void main(String[] args) {
        System.out.println("===== INFORMASI NASABAH =====");

        // Instansiasi dan pengisian data objek Rekening pertama
        Rekening r1 = new Rekening();
        r1.setNomorRekening(12300);
        r1.setNamaNasabah("Ipin");
        r1.setSaldo(2500000.00);

        // Instansiasi dan pengisian data objek Rekening kedua
        Rekening r2 = new Rekening();
        r2.setNomorRekening(12400);
        r2.setNamaNasabah("Muhammad Sumbul");
        r2.setSaldo(5000000.00);

        // Menampilkan data rekening 1
        System.out.println("=== Data Rekening 1 ===");
        System.out.println("Nomor Rekening : " + r1.getNomorRekening());
        System.out.println("Nama Nasabah   : " + r1.getNamaNasabah());
        System.out.println("Saldo          : Rp " + r1.getSaldo());
        System.out.println();

        // Menampilkan data rekening 2
        System.out.println("=== Data Rekening 2 ===");
        System.out.println("Nomor Rekening : " + r2.getNomorRekening());
        System.out.println("Nama Nasabah   : " + r2.getNamaNasabah());
        System.out.println("Saldo          : Rp " + r2.getSaldo());
        System.out.println();

        // Menampilkan informasi bank dengan memanggil method static
        System.out.println("=== INFORMASI BANK ===");
        System.out.println("Nama Bank    : " + Bank.getNamaBank());
        System.out.println("Kode Bank    : " + Bank.getKodeBank());
        System.out.println("Suku Bunga   : " + Bank.getSukuBunga() + "% per tahun");
    }
}
