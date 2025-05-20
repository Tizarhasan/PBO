package tugas;

public class MobilListrik extends Kendaraan implements KendaraanListrik {
    private int levelBaterai;

    public MobilListrik(int kecepatan, int waktu, int levelBaterai) {
        super(kecepatan, waktu);
        this.levelBaterai = levelBaterai;
    }

    @Override
    public double hitungJarakTempuh() {
        return kecepatan * waktu;
    }

    @Override
    public void isiDaya() {
        levelBaterai = 100;
        System.out.println("Baterai telah diisi penuh.");
    }

    @Override
    public int cekBaterai() {
        return levelBaterai;
    }
}
