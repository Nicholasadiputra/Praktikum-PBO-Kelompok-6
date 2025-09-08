public class dasarPemrograman {
        
    public static void main(String[] args) {
        // Deklarasi konstanta (nilai tidak dapat diubah setelah inisialisasi)
        final String Nama = "Sari Rizky Mei Putri"; //konstanta Nama, Nama tidak akan berubah
        
        // Deklarasi dan inisialisasi array double untuk menyimpan IP semester
        double[] ipSemester = {3.79 , 3.79};
        //membuat array byte tujuan dengan ukuran yang sama
        byte[] ipByte = new byte[ipSemester.length];
        
        //konversi setiap elemen nilai ip
        for (int i = 0; i <ipSemester.length; i++){
        ipByte[i] = (byte) ipSemester[i];
        }
        
        // Deklarasi dan inisialisasi variabel biodata lainnya
        String Alamat = "Jl. Bangau Sakti, Panam, Pekanbaru";
        String Umur = "19";
        String GolDarah = "O";
        // Deklarasi variabel String untuk NIM
        String NIM = "2407111562";
        //Tampilkan biodata 
        System.out.println("BIODATA MAHASISWA");
        System.out.println("Nama                    :" + Nama);
        System.out.println("NIM                     : " + NIM);
        System.out.println("IP tiap semester : ");
        System.out.println("Semester 1              : " + ipByte[0]);
        System.out.println("Semester 2              : " + ipByte[1]);
        
        System.out.println("Alamat                  : " + Alamat);
        System.out.println("Umur                    : " + Umur);
        System.out.println("Golongan Darah          : " + GolDarah);
        
    }
}