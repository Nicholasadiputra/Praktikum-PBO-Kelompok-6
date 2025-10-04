class Produk {
    public String nama;
    private double harga;
    protected int stok;
    private String namasupplier = "chris";

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkaninfo(){
        System.out.println("Nama" + nama);
        System.out.println("Harga" + harga);
        System.out.println("Stok" + stok);
    }

    private void namaSupplier(){
        System.out.println("nama supplier nya adalah : " + namasupplier);
    }
}

