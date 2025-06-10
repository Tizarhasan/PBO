package Pertemuan13;

public abstract class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    // Method abstrak
    public abstract void makan();
}

