package praktikum5;

public class Novel 
{
    // Atribut
    private String judul;
    private String penulis;
    private int tahunTerbit;

    // Constructor 1: Default
    public Novel() 
    {
        this.judul = "Unknown";
        this.penulis = "Unknown";
        this.tahunTerbit = 0;
    }

    // Constructor 2: dengan dua parameter
    public Novel(String judul, String penulis) 
    {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = 0;
    }

    // Constructor 3: dengan tiga parameter
    public Novel(String judul, String penulis, int tahunTerbit) 
    {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Method: menampilkan info novel
    public void tampilkanInfo() 
    {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }

    public static void main(String[] args) 
    {
        // Object 1
        Novel novel1 = new Novel();
        System.out.println("Judul: " + novel1.judul);
        System.out.println("Penulis: " + novel1.penulis);
        System.out.println("Tahun Terbit: " + novel1.tahunTerbit);

        System.out.println();

        // Object 2
        Novel novel2 = new Novel("Bumi", "Tere Liye");
        System.out.println("Judul: " + novel2.judul);
        System.out.println("Penulis: " + novel2.penulis);
        System.out.println("Tahun Terbit: " + novel2.tahunTerbit);

        System.out.println();

        // Object 3
        Novel novel3 = new Novel("Hujan", "Tere Liye", 2016);
        System.out.println("Judul: " + novel3.judul);
        System.out.println("Penulis: " + novel3.penulis);
        System.out.println("Tahun Terbit: " + novel3.tahunTerbit);
    }
}