package tugas2;

public class Main {

    public static void main(String[] args) {

        // Membuat instance dari kelas SavingsAccount dengan nomor rekening "9876543210"
        SavingsAccount sa = new SavingsAccount("9876543210");

        // Melakukan penyetoran uang sebesar 2.500.000 ke dalam akun
        sa.deposit(2500000);

        // Menampilkan detail informasi rekening, termasuk tipe akun
        sa.showDetailedInfo();
    }
}
