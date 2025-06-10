package Pertemuan13;

public class Anjing extends Hewan implements Suara {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan tulang.");
    }

    @Override
    public void buatSuara() {
        System.out.println(nama + " menggonggong: Guk guk!");
    }
}

