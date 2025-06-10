package Pertemuan13;

public class Kucing extends Hewan implements Suara {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan ikan.");
    }

    @Override
    public void buatSuara() {
        System.out.println(nama + " mengeong: Meong!");
    }
}

