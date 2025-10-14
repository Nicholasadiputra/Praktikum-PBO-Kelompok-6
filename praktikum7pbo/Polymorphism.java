public class Polymorphism {
    public static void main(String[] args){
        Produk p1 = new Produk("Buku", 150000);
        Produk p2 = new BarangElektronik("Mouse", 150000, 12);

        p1.tampilkanInfo();
        System.out.println("-------------------------");
        p2.tampilkanInfo();
    }
}
