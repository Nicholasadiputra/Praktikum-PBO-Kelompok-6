public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("laptop", 9000000, 5);
        Produk p2 = new Produk("HP", 3500000, 10);

        System.out.println("Nama produk 1 : " +p1.nama);
        System.out.println("Harga : " + p1.getHarga());
        System.out.println("Harga baru untuk produk 1 : " + p1.getHarga());

        p1.namasupplierFix();
        p1.tampilkaninfo();
        p2.tampilkaninfo();

        Produk.infoJumlahProduk();
    }
}