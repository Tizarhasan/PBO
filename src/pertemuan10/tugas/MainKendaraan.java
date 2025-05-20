package tugas;

public class MainKendaraan {
    public static void main(String[] args) {
        MobilListrik tesla = new MobilListrik(60, 2, 45);

        System.out.println("Jarak tempuh: " + tesla.hitungJarakTempuh() + " km");
        System.out.println("Level baterai: " + tesla.cekBaterai() + "%");

        tesla.isiDaya();
        System.out.println("Level baterai setelah diisi: " + tesla.cekBaterai() + "%");
    }
}
