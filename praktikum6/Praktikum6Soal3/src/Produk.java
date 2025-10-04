class Produk {
    public String nama;
    private double harga;
    protected int stok;
    private String namasupplier = "chris";

    static int jumlahProduk = 0;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        jumlahProduk++;
    }

    public static void infoJumlahProduk(){
        System.out.println("Total produk yang telah dibuat : " + jumlahProduk);
    }

    public void tampilkaninfo(){
        System.out.println("Nama " + nama);
        System.out.println("Harga " + harga);
        System.out.println("Stok " + stok);
    }

    private void namaSupplier(){
        System.out.println("nama supplier nya adalah : " + namasupplier);
    }

    public void namasupplierFix(){
        namaSupplier();
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double hargaBaru){
        if(hargaBaru>0){
            this.harga = hargaBaru;
        }
        else if (hargaBaru == 0){
            this.harga = hargaBaru;
            System.out.println("Produk ini gratis");
        }
        else{
            System.out.println("Harga produk tidak boleh negatif");
        }
    }
}