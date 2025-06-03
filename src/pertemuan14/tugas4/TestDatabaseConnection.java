package tugas4;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Ketika variabel connectionString diakses untuk pertama kalinya,
        // blok statis dalam class DatabaseConnection akan dijalankan secara otomatis
        System.out.println("Nilai connectionString: " + DatabaseConnection.connectionString);
    }
}
