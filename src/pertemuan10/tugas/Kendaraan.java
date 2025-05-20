package tugas;

public abstract class Kendaraan {
    protected int kecepatan;
    protected int waktu;

    public Kendaraan(int kecepatan, int waktu) {
        this.kecepatan = kecepatan;
        this.waktu = waktu;
    }

    public abstract double hitungJarakTempuh();

    public int getKecepatan() {
        return kecepatan;
    }

    public int getWaktu() {
        return waktu;
    }
}
