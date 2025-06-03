package tugas2;

public class BankAccount {

    // Variabel accountNumber hanya bisa diatur sekali saat objek dibuat
    // Bersifat private dan final agar tidak bisa diubah dari luar maupun setelah inisialisasi
    private final String accountNumber;

    // Variabel balance bisa diakses oleh class turunan dan class lain dalam package yang sama
    // Tidak bersifat final karena nilainya dapat berubah
    protected double balance;

    // Konstruktor: digunakan untuk menetapkan nomor rekening saat objek dibuat
    // Saldo awal ditetapkan ke 0.0 secara default
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Menambahkan dana ke saldo jika jumlah yang dimasukkan lebih besar dari nol
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method ini ditandai dengan kata kunci final agar tidak bisa diturunkan atau dimodifikasi oleh subclass
    // Menampilkan informasi nomor rekening dan saldo saat ini
    public final void displayAccountInfo() {
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.println("Saldo: Rp " + balance);
    }
}
