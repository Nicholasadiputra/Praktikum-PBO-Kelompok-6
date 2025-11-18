public class Rekening {
    private int nomorRekening;
    private String namaNasabah;
    private double saldo;

    public void setNomorRekening(int nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNomorRekening() {
        return nomorRekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public double getSaldo() {
        return saldo;
    }
}
