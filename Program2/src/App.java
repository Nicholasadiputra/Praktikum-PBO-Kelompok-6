public class App {
    public static void main(String[] args) {
        // Deklarasi Variabel
        String nama,alamat;
        int umur;
        long nim;
        double ip1;
        char golonganDarah;
        byte ip2;

        // Input Data
        nama = "Muhammad Rizqy Putra Pratama";
        alamat = "Jalan Swakarya";
        umur = 19;
        nim = 2407111902L;
        ip1 = 3.79;
        ip2 = (byte) 3.78;
        golonganDarah = 'O';

        // Output Data
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + umur + " Tahun");
        System.out.println("NIM : " + nim);
        System.out.println("IP Semester 1 : " + ip1);
        System.out.println("IP Semester 2 : " + ip2);
        System.out.println("Golongan Darah : " + golonganDarah);

    }
}
