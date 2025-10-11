public class BarangElektronik extends Produk implements HargaAkhir{
    private int garansi;

    public BarangElektronik(String nama, int harga, int garansi){
        super(nama, harga); // memanggil konstruktor superclass
        this.garansi = garansi;
    }

    public void tampilkanGaransi(){
        System.out.println("garansi : " + garansi + " bulan");
    }

    @Override
    public double hitungPajak() {
        return harga * 0.01;
    }

    @Override
    public double hitungHarga(){
        return harga * 1.01;
    }
}
