
public class barangElektronik extends Produk {
    private int garansi;

    public BarangElektronik(String nama, int harga, int garansi){
        super(nama, harga); // memanggil konstruktor superclass
        this.garansi = garansi;
    }

    public void tampilkanGaransi(){
        System.out.println("garansi : " + garansi + " bulan");
    }

    //Overriding

    @Override
    public double hitungPajak() {
        return harga * 0.01;
    }
}
