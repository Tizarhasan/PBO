package tugas3;

public class Counter {
    // Variabel static ini digunakan untuk menghitung jumlah objek yang telah dibuat
    // Nilai ini akan sama dan dibagikan ke semua instance dari kelas Counter
    private static int instanceCount = 0;

    // Konstruktor akan dijalankan setiap kali objek baru dibuat
    // Saat itu juga, nilai instanceCount akan bertambah satu
    public Counter() {
        instanceCount++;
    }

    // Method static ini dapat diakses tanpa perlu membuat objek Counter terlebih dahulu
    // Fungsinya untuk mengambil jumlah total objek yang telah dibuat
    public static int getInstanceCount() {
        return instanceCount;
    }
}
