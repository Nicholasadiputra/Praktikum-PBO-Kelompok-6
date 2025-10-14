public class Produk {
    protected String nama;
    protected int harga;

    public Produk(String nama, int harga){
       this.nama = nama;
       this.harga = harga;
    }

    public void tampilkanInfo(){
        System.out.println("nama produk : " + nama);
        System.out.println("harga : " + harga);
    }

    //untuk overriding

    public double hitungPajak(){
        return harga * 0.05;
    }
}