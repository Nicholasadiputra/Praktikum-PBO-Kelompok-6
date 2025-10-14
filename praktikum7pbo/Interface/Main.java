package Interface;

public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("buku", 150000);
        BarangElektronik p2 = new BarangElektronik("Mouse" , 150000, 12);

        p1.tampilkanInfo();
        System.out.println("Pajak Produk umum : " + p1.hitungPajak());
        System.out.println("-------------------------");
        p2.tampilkanInfo();
        p2.tampilkanGaransi();
        System.out.println("Pajak Barang Elektronik : " + p2.hitungPajak());
        System.out.println("Harga akhir produk : " + p2.hitungHarga());
    }
}
