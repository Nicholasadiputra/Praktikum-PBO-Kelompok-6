package Interface;

public class Produk implements HargaAkhir{
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

    public double hitungPajak(){
        return harga * 0.05;
    }

    @Override
    public double hitungHarga(){
        return harga * 1.05;
    }
}
