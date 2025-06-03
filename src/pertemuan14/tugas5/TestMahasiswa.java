package tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        // Membuat tiga instance dari class Mahasiswa dengan data berbeda
        Mahasiswa m1 = new Mahasiswa("230001", "Andi");
        Mahasiswa m2 = new Mahasiswa("230002", "Budi");
        Mahasiswa m3 = new Mahasiswa("230003", "Citra");

        // Menampilkan informasi masing-masing mahasiswa
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        // Menampilkan jumlah total mahasiswa yang telah dibuat sejauh ini
        System.out.println("Total mahasiswa terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}
