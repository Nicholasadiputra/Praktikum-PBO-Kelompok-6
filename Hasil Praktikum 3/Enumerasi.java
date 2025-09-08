// Enum didefinisikan di luar class utama atau sebagai nested enum
enum Hari {
    SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
}

public class Enumerasi {
    public static void main(String[] args) {
        // Menggunakan enum
        Hari hariIni = Hari.SENIN;
        
        if (hariIni == Hari.SENIN) {
            System.out.println("Hari ini adalah Senin!");
            System.out.println("Besok adalah " + Hari.SELASA);
        }

    }
}