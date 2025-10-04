public class Praktikum6 {
    public static void main(String[] args) {
        Produk p1 = new Produk("laptop", 12000000, 5);
        Produk p2 = new Produk("HP", 3500000, 10);

        System.out.println(p1.nama);
        System.out.println(p1.stok);
        System.out.println(p1.harga); //error karena private

        p1.namasupplier(); // error private
        p1.namasupplierFix(); //error private
        p2.tampilkaninfo();
    }
}

