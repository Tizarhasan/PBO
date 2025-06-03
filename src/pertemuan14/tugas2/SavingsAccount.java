package tugas2;

public class SavingsAccount extends BankAccount {

    // Konstruktor SavingsAccount menerima nomor rekening
    // dan meneruskannya ke konstruktor kelas induk (BankAccount)
    public SavingsAccount(String accountNumber) {
        super(accountNumber); // memanggil konstruktor milik superclass
    }

    // Method khusus yang hanya ada di SavingsAccount
    // Menampilkan detail akun dengan memanggil info dari kelas induk dan menambahkan jenis rekening
    public void showDetailedInfo() {
        super.displayAccountInfo(); // menampilkan info dasar dari BankAccount
        System.out.println("Jenis Rekening: Tabungan");
    }
}
