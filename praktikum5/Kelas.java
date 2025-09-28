//Buat sebuah class yang berisi construtor dan ada
//method overloading serta constructor overloading,
//kemudian buatlah 3 object yang berbeda dari class
//tersebut.

// atribut yang ada dalam ruangan kelas
class isiKelas {
    //atribut
    String namaKelas;
    int jumlahSiswa;
    boolean adaTelevisi;

    // constructor overloading
    public isiKelas(String namaKelas) {
        this.namaKelas = namaKelas;
        this.jumlahSiswa = 0;
        this.adaTelevisi = false;
    }

    public isiKelas(String namaKelas, int jumlahSiswa) {
        this.namaKelas = namaKelas;
        this.jumlahSiswa = jumlahSiswa;
        this.adaTelevisi = true;
    }

    public isiKelas(String namaKelas, int jumlahSiswa, boolean AdaTelevisi) {
        this.namaKelas = namaKelas;
        this.jumlahSiswa = jumlahSiswa;
        this.adaTelevisi = true;
    }

    // method overloading
    public void tambahSiswa() {
        this.jumlahSiswa++;
        System.out.println("1 siswa berhasil ditambahkan ke " + this.namaKelas);
    }

    public void tambahSiswa(int jumlah) {
        this.jumlahSiswa += jumlah;
        System.out.println(jumlah + "1 siswa berhasil ditambahkan ke " + this.namaKelas);
    }

    public void tambahSiswa(String siswaBaru) {
        this.jumlahSiswa++;
        System.out.println("siswa baru bernama " + siswaBaru + " berhasil ditambahkan ke " + this.namaKelas);
    }

    public void tampilanOutput(){
        System.out.println("\n--- Informasi Kelas ---");
        System.out.println("Nama Ruangan  : " + this.namaKelas);
        System.out.println("Jumlah Siswa  : " + this.jumlahSiswa);
        System.out.println("ketersedian Televisi : " + (this.adaTelevisi ? "Ya" : "Tidak"));
        System.out.println("-----------------------");
    }
}

// Class utama untuk menjalankan program
public class Kelas {
    public static void main(String[] args) {
        System.out.println(" Membuat 3 Object Kelas yang Berbeda \n");

        // --- PEMBUATAN 3 OBJECT ---

        // Object 1: Dibuat menggunakan Constructor 1 (hanya nama ruangan)
        System.out.println("1. Membuat kelasA dengan constructor pertama...");
        isiKelas kelasA = new isiKelas("Ruang Teori 1A");
        // Memanggil method overloading
        kelasA.tambahSiswa(20);
        kelasA.tampilanOutput();

        // Object 2: Dibuat menggunakan Constructor 2 (nama dan jumlah siswa)
        System.out.println("\n2. Membuat kelasB dengan constructor kedua...");
        isiKelas kelasB = new isiKelas("Ruang Praktikum B", 15);
        // Memanggil method overloading
        kelasB.tambahSiswa();
        kelasB.tambahSiswa("Andi");
        kelasB.tampilanOutput();

        // Object 3: Dibuat menggunakan Constructor 3 (lengkap)
        System.out.println("\n3. Membuat kelasC dengan constructor ketiga...");
        isiKelas kelasC = new isiKelas("Laboratorium Multimedia", 25, true);
        kelasC.tampilanOutput();
    }
}




