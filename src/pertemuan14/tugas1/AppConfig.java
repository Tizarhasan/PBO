package tugas1;

// Kelas AppConfig berfungsi sebagai tempat penyimpanan konfigurasi global aplikasi
public class AppConfig {

    // Konstanta static final untuk menyimpan alamat dasar API
    // Static: dapat digunakan langsung tanpa membuat instance kelas
    // Final: nilainya tidak dapat diubah setelah didefinisikan
    public static final String BASE_URL = "https://www.myapp.com/api";

    // Menyimpan informasi versi aplikasi
    // Umumnya digunakan untuk pelacakan versi atau pengecekan kompatibilitas API
    public static final String APP_VERSION = "1.0.0";

    // Waktu tunggu default dalam milidetik untuk permintaan ke server
    // Berguna dalam pengaturan timeout koneksi atau permintaan jaringan
    public static final int DEFAULT_TIMEOUT = 5000; 
}
