public class PemainCatur {
    // Atribut
    private String nama;
    private int rating;
    private String negara;

    // --- Constructor Overloading ---
    // #1: Constructor paling dasar, hanya butuh nama.
    // Rating dan negara akan diisi nilai default.
    public PemainCatur(String nama) {
        // Memanggil constructor #3 dengan nilai default
        this(nama, 1200, "Belum terdaftar");
    }

    // #2: Constructor jika nama dan rating sudah diketahui.
    public PemainCatur(String nama, int rating) {
        // Memanggil constructor #3 dengan negara default
        this(nama, rating, "Belum terdaftar");
    }

    // #3: Constructor paling lengkap. Ini adalah constructor utama.
    public PemainCatur(String nama, int rating, String negara) {
        this.nama = nama;
        this.rating = rating;
        this.negara = negara;
    }

    // --- Method Overloading ---
    // #1: Method untuk mengubah rating dengan menambah/mengurangi poin.
    public void updateRating(int tambahanPoin) {
        System.out.println(this.nama + " ratingnya berubah sebesar " + tambahanPoin + " poin.");
        this.rating += tambahanPoin; // Menambah atau mengurangi rating
    }

    // #2: Method dengan nama sama, tapi parameter berbeda.
    // Berguna jika ada alasan spesifik kenapa rating berubah.
    public void updateRating(int tambahanPoin, String alasan) {
        System.out.println(this.nama + " ratingnya berubah sebesar " + tambahanPoin + " poin karena " + alasan + ".");
        this.rating += tambahanPoin;
    }

    // Method untuk menampilkan informasi pemain
    public void displayInfo() {
        System.out.println("--------------------");
        System.out.println(" Nama   : " + this.nama);
        System.out.println(" Rating : " + this.rating);
        System.out.println(" Negara : " + this.negara);
        System.out.println("--------------------");
    }
}