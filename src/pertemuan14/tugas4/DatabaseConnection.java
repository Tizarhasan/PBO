package tugas4;

public class DatabaseConnection {

    // Variabel static yang menyimpan alamat koneksi ke database
    // Bersifat global untuk seluruh instance dari class ini
    public static String connectionString;

    // Static block akan dijalankan sekali saat class pertama kali dimuat oleh JVM
    // Digunakan untuk mengatur nilai awal connectionString
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block: connectionString berhasil diset.");
    }

    // Konstruktor tanpa parameter, tidak melakukan apa pun saat objek dibuat
    public DatabaseConnection() {
    }
}
