package tugas5;

public class Mahasiswa {
    private final String nim;                  // Variabel final: NIM hanya bisa diset sekali saat objek dibuat
    private String nama;                       // Nama dapat diubah setelah inisialisasi
    private static int totalMahasiswa = 0;     // Variabel static: digunakan untuk melacak jumlah objek yang dibuat
    public static final int MAX_SKS = 24;      // Konstanta: nilai tetap untuk batas maksimum SKS

    // Konstruktor: menginisialisasi nim dan nama, serta menaikkan penghitung total mahasiswa
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;
    }

    // Menampilkan informasi detail mahasiswa ke layar
    public void displayInfo() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Maksimum SKS: " + MAX_SKS);
        System.out.println("------------------------");
    }

    // Method static untuk mengambil jumlah total mahasiswa yang telah dibuat
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
